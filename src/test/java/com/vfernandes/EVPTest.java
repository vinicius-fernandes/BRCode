package com.vfernandes;

import org.junit.Assert;
import org.junit.Test;
import com.vfernandes.Utils.Validators.EVPValidator;
public class EVPTest {
    @Test
    public void testIsValidEVP_ValidEVP_ReturnsTrue() {
        String evp = "123e4567-e89b-12d3-a456-426655440000";
        
        boolean result = EVPValidator.isValidEVP(evp);
        
        Assert.assertTrue(result);
    }
    
    @Test
    public void testIsValidEVP_InvalidEVP_ReturnsFalse() {
        String evp = "invalid-evp";
        
        boolean result = EVPValidator.isValidEVP(evp);
        
        Assert.assertFalse(result);
    }
}
