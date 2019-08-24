package com.challenge.invoice.service;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.repository.CustomerRepository;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @MockBean
    private CustomerRepository repository;

    @Test
    @Transactional
    public void whenFindCustomerByIdReturnNotNullCustomer() {
        Mockito.when(repository.findById(15L)).thenReturn(Optional.of(getCustomer(15L)));

        Optional<Customer> customer = customerService.findById(15L);

        Assert.assertThat(customer, Matchers.notNullValue());
        Assert.assertThat(customer.get().getName(), Matchers.equalTo("eu"));
    }

    @Test
    @Transactional
    public void whenSaveCustomerReturnCustomerWithIdNotNull() {
        Customer customer = getCustomer(null);
        Customer returnCustomer = getCustomer(15L);
        Mockito.when(repository.save(customer)).thenReturn(returnCustomer);

        Customer result = customerService.save(customer);

        Assert.assertThat(result, Matchers.notNullValue());
        Assert.assertThat(result.getName(), Matchers.equalTo("eu"));
    }

    private Customer getCustomer(Long id) {
        return Customer.builder()
                .id(id)
                .name("eu")
                .email("eu@eu.com")
                .birthday(LocalDate.of(2000, 1, 1))
                .build();
    }


}
