package com.vfernandes.Utils.Validators;

import java.util.regex.Pattern;

public class PhoneValidator {
    private static final String PHONE_REGEX = "^\\+[1-9][0-9]{1,14}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    /***
     * Checks if the key is a Phone number following the <a href="https://www.bcb.gov.br/content/estabilidadefinanceira/forumpireunioes/api-dict.html#tag/Directory">DICT  API</a> rules.
     * Must only container numbers
     * Allowed example: +5510998765432
     * @return boolean - True if it's a Phone False if it's not a Phone
     */
    public static boolean isValidPhone(String phone){
        return PHONE_PATTERN.matcher(phone).matches();
    }
}
