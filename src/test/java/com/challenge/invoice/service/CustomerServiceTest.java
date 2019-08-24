package com.challenge.invoice.service;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.repository.CustomerRepository;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
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

    @Test
    @Transactional
    public void whenFindByNameReturnCustomers() {
        Mockito.when(repository.findByNameContainingIgnoreCase("eu"))
                .thenReturn(Arrays.asList(getCustomer(15L), getCustomer(16L)));

        List<Customer> result = customerService.findByName("eu");

        Assert.assertThat(result, Matchers.hasSize(2));
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
