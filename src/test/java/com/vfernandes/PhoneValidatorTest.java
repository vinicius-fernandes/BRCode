package com.vfernandes;

import org.junit.Assert;
import org.junit.Test;

import com.vfernandes.Utils.Validators.PhoneValidator;

public class PhoneValidatorTest {
    @Test
    public void testValidPhone() {
        String phone = "+5510998765432";
        Assert.assertTrue(PhoneValidator.isValidPhone(phone));
    }

    @Test
    public void testInvalidPhone() {
        String phone = "+55abc98765432";
        Assert.assertFalse(PhoneValidator.isValidPhone(phone));
    }

    @Test
    public void testPhoneWithoutPlus() {
        String phone = "5510998765432";
        Assert.assertFalse(PhoneValidator.isValidPhone(phone));
    }

    @Test
    public void testPhoneWithPlusInWrongPosition() {
        String phone = "1+5510998765432";
        Assert.assertFalse(PhoneValidator.isValidPhone(phone));
    }
}
