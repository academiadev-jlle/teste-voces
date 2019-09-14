package com.challenge.invoice;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class TesteFalhando {

    @Test
    public void teste() {
        Assert.assertThat(1L, Matchers.equalTo(2L));
    }
}
