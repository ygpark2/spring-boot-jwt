// Copyright (c) 2014 KMS Technology, Inc.
package com.ain.syl.repository.admin;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ain.syl.domain.admin.Contact;
import org.springframework.stereotype.Repository;

/**
 * @author Young Gyu Park
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {

    @Query("select c from Contact c where lower(c.id) like :keyword% "
            + "or lower(c.name) like :keyword% "
            + "or lower(c.fullName) like :keyword% "
            + "or lower(c.jobTitle) like :keyword% "
            + "or lower(c.email) like :keyword% "
            + "or lower(c.mobile) like :keyword% "
            + "or lower(c.skypeId) like :keyword% "
            + "order by c.name")
    Page<Contact> searchContacts(@Param("keyword") String keyword, Pageable pageable);
    
    @Modifying
    @Query("delete from Contact where id in (:ids)")
    void deleteContacts(@Param("ids") String... ids);
}