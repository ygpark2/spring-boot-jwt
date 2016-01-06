package com.ain.syl.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.validation.Valid;

import com.ain.syl.domain.admin.Contact;
import com.ain.syl.repository.admin.ContactRepository;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

/**
 * @author Young Gyu Park
 */
@Service
@Transactional(readOnly = true)
public class ContactService {
    private final AtomicInteger idGeneration = new AtomicInteger(1000);
    
    @Inject
    private ContactRepository contactRepo;
    
    @Inject
    private GaugeService gaugeService;
    
    @Inject
    private CounterService counterService;
    
    @Inject
    private ApplicationContext appContext;

    @Transactional
    public long loadContacts(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines()
                         //.parallel()
                         .map(this::parseContact)
                         .map(this::saveContact)
                         .count();
        }
    }

    public Page<Contact> searchContacts(String keyword, int page, int pageSize) {
        keyword = (keyword == null) ? "" : keyword.toLowerCase();

        StopWatch watch = new StopWatch();
        watch.start();
        Page<Contact> contacts = contactRepo.searchContacts(keyword, new PageRequest(page, pageSize));
        watch.stop();
        gaugeService.submit("query.by.keyword." + keyword, watch.getTotalTimeMillis());
        counterService.increment("search.by.keyword." + keyword);
        
        return contacts;
    }

    public Contact getContact(String id) {
        return contactRepo.findOne(id);
    }

    @Transactional
    public Contact saveContact(@Valid Contact contact) {
        if (contact == null) {
            return null;
        }
        
        if (contact.getId() == null) {
            contact.setId(String.valueOf(idGeneration.incrementAndGet()));
        }

        return contactRepo.save(contact);
    }

    @Transactional
    public void deleteContacts(String... ids) {
        contactRepo.deleteContacts(ids);
    }
    
    @Transactional
    public void deleteAllContacts() {
        contactRepo.deleteAllInBatch();
    }
    
    /**
     * contactLine format: id|name|fullName|jobTitle|email|mobile|skypeId
     */
    private Contact parseContact(String contactLine) {
        String[] items = contactLine.split("\\|");
        if (items.length < 2) {
            throw new IllegalArgumentException("Invalid contact-line format: " + contactLine);
        }
        
        Contact contact = new Contact();
        contact.setId(items[0]);
        contact.setName(items[1]);
        if (items.length > 2) {
            contact.setFullName(items[2]);
        }
        if (items.length > 3) {
            contact.setJobTitle(items[3]);
        }
        if (items.length > 4) {
            contact.setEmail(items[4]);
        }
        if (items.length > 5) {
            contact.setMobile(items[5]);
        }
        if (items.length > 6) {
            contact.setSkypeId(items[6]);
        }
        
        return contact;
    }
}
