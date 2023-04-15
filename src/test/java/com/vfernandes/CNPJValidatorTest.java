package com.vfernandes;

import org.junit.Assert;
import org.junit.Test;

import com.vfernandes.Utils.Validators.CNPJValidator;

public class CNPJValidatorTest {
    
    @Test
    public void testValidCNPJ() {
        String cnpj = "12345678901234";
       Assert.assertTrue(CNPJValidator.isValidCNPJ(cnpj));
    }

    @Test
    public void testInvalidCNPJ() {
        String cnpj = "12345678901";
        Assert.assertFalse(CNPJValidator.isValidCNPJ(cnpj));
    }

    @Test
    public void testCNPJWithNonNumericCharacters() {
        String cnpj = "1234567890abcde";
        Assert.assertFalse(CNPJValidator.isValidCNPJ(cnpj));
    }
}
