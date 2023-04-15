package com.vfernandes;

import org.junit.Assert;
import org.junit.Test;

import com.vfernandes.Utils.CRC16.CRC16;

public class CRC16Test {


    @Test
    public void ReturnsTheCorrectsCRC16_CCIT_FALSE(){
        Assert.assertEquals(CRC16.CRC16C_CITTFALSE("1234567".getBytes()), 30488);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CRC16_CCIT_FALSEthrowExceptionWhenInputIsNull(){
        CRC16.CRC16C_CITTFALSE(null); 
    }


    @Test
    public void ReturnsTheCorrectsCRC16_CCIT_FALSE_HEX_STRING_(){
        Assert.assertEquals(CRC16.CRC16_CITTFALSE_HEX_STRING("1234567"), "7718");
        Assert.assertEquals(CRC16.CRC16_CITTFALSE_HEX_STRING("Hello dasdsadasdsadasdsad s d b b c"), "0CE3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void CRC16_CCIT_FALSE_HEX_STRING_throwExceptionWhenInputIsNull(){
        CRC16.CRC16_CITTFALSE_HEX_STRING(null); 
    }
    
}
