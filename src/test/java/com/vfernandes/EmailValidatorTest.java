package com.vfernandes;
import org.junit.Assert;
import org.junit.Test;

import com.vfernandes.Utils.Validators.EmailValidator;

public class EmailValidatorTest {
    
    @Test
    public void testValidEmail() {
        Assert.assertTrue(EmailValidator.isValidEmail("pix@bcb.gov.br"));
    }

    @Test
    public void testInvalidEmail() {
        Assert.assertFalse(EmailValidator.isValidEmail("notanemail"));
        Assert.assertFalse(EmailValidator.isValidEmail("email@toolongtoolongtoolongtoolongtoolongtoolongtoolongtoolongtoolongtoolongtoolong.com"));
        Assert.assertFalse(EmailValidator.isValidEmail("email@-hyphen.com"));
        Assert.assertFalse(EmailValidator.isValidEmail("email@.dot.com"));
        Assert.assertFalse(EmailValidator.isValidEmail("email@dot-.com"));
        Assert.assertFalse(EmailValidator.isValidEmail("email@dot.com."));
    }
}

