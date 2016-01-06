package com.ain.syl.web;

import com.ain.syl.support.ApplicationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ApplicationTest
public class SaveCustomerTest {

    private RestTemplate restTemplate = new TestRestTemplate("demo", "123");

    @Test
    public void savesCustomer() {

    }

    /*
    @Test
    static void savesCustomer() {
        // act
        URI uri = restTemplate.postForLocation("http://localhost:9000/customer", new Customer("John", "Doe"));
        // assert
        ResponseEntity<Customer> responseEntity = restTemplate.getForEntity(uri, Customer.class);

        Customer customer = responseEntity.getBody();

        assertThat(customer.getFirstname()).isEqualTo("John");
        assertThat(customer.getLastname()).isEqualTo("Doe");
    }
    */
}