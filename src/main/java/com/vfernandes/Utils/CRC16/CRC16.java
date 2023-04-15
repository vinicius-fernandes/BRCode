package com.vfernandes.Utils.CRC16;

public class CRC16 {
    
    /**
     *  <a href="https://introcs.cs.princeton.edu/java/61data/CRC16CCITT.java">CRC16 princeton implemetation</a>
     *   Reads in a sequence of bytes and prints out its 16 bit
     *   Cylcic Redundancy Check (CRC-CCIIT 0xFFFF).
     * @param bytes
     * @return int representing the crc16 value
     */

    public static int CRC16C_CITTFALSE(byte[] bytes){

        if(bytes == null)
            throw new IllegalArgumentException("The value to be converted must not be null");

        int crc = 0xFFFF;          // initial value
        int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12)

        for (byte b : bytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b   >> (7-i) & 1) == 1);
                boolean c15 = ((crc >> 15    & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) crc ^= polynomial;
            }
        }

        crc &= 0xffff;

        return crc;
    }

    /**
     * Receives a string value and then converts it to a crc16 citt false hex string
     * @param value String containg the value to obtaing the CRC16 CITTFALS HEX String with left padding of zeros
     * @return crc16 hex string
     */

    public static String CRC16_CITTFALSE_HEX_STRING(String value){
        if(value == null)
            throw new IllegalArgumentException("The value to be converted must not be null");
        int CRC16_FALSE = CRC16.CRC16C_CITTFALSE(value.getBytes());
        return String.format("%04x",CRC16_FALSE).toUpperCase();
    }
}
