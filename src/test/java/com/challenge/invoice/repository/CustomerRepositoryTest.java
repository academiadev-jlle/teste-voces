package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.InvoiceStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    public void whenFindByInvoicesIssued() {
        List<Customer> result = repository.findByInvoicesStatusOrInvoicesStatus(InvoiceStatus.READY, InvoiceStatus.ISSUED);
    }


}
