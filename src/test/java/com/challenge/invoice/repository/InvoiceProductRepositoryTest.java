package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceProductRepositoryTest {

    @Autowired
    private InvoiceProductRepository repository;

    @Test
    public void whenFindByInvoicesIssued() {
        Page<InvoiceProduct> result = repository.findByIdInvoiceStatus(InvoiceStatus.READY, PageRequest.of(0, 20, Sort.by(Sort.Direction.DESC, "createdAt")));

    }


}
