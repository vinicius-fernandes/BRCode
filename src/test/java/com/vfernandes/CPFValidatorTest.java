package com.vfernandes;

import org.junit.Assert;
import org.junit.Test;

import com.vfernandes.Utils.Validators.CPFValidator;


public class CPFValidatorTest {
    @Test
    public void testValidCPF() {
        String cpf = "12345678901";
       Assert.assertTrue(CPFValidator.isValidCPF(cpf));
    }

    @Test
    public void testInvalidCPF() {
        String cpf = "1234567890";
        Assert.assertFalse(CPFValidator.isValidCPF(cpf));
    }

    @Test
    public void testCPFWithNonNumericCharacters() {
        String cpf = "1234567890abcde";
        Assert.assertFalse(CPFValidator.isValidCPF(cpf));
    }
}
