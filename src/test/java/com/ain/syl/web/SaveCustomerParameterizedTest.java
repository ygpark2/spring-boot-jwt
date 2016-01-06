package com.ain.syl.web;

import com.ain.syl.support.ApplicationTest;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.TestRestTemplate;
// import org.springframework.test.context.junit4.rules.SpringClassRule;
// import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
@ApplicationTest
public class SaveCustomerParameterizedTest {

    // @ClassRule
    // static static final SpringClassRule SCR = new SpringClassRule();

    // @Rule
    // static final SpringMethodRule springMethodRule = new SpringMethodRule();

    private RestTemplate restTemplate = new TestRestTemplate("demo", "123");

    @Test
    public void savesCustomer() {

    }

    /*
    @Test
    @Parameters
    static void savesCustomer(String first, String last) {
        // act
        URI uri = restTemplate.postForLocation("http://localhost:9000/customer",
            new Customer(first, last));
        // assert
        ResponseEntity<Customer> responseEntity =
            restTemplate.getForEntity(uri, Customer.class);

        Customer customer = responseEntity.getBody();

        assertThat(customer.getFirstname()).isEqualTo(first);
        assertThat(customer.getLastname()).isEqualTo(last);
    }

    static Object[] parametersForSavesCustomer() {
        return $(
            $("John", "Doe"),
            $("John", "Smith"),
            $("Deborah", "Johnson"),
            $("Jan", "Kowalski")
        );
    }
    */
}