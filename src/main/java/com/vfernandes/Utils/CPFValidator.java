package com.vfernandes.Utils;

import java.util.regex.Pattern;

public class CPFValidator {
    private static final String CPF_REGEX = "^[0-9]{11}$";
    private static final Pattern CPF_PATTERN = Pattern.compile(CPF_REGEX);

    /***
     * Checks if the key is a CPF following the <a href="https://www.bcb.gov.br/content/estabilidadefinanceira/forumpireunioes/api-dict.html#tag/Directory">DICT  API</a> rules, it only validate if the key has the length of a CPF.
     * Must only container numbers
     * Allowed example:  12345678901
     * @return boolean - True if it's a CPF False if it's not a CPF
     */
    public static boolean isValidCPF(String CPF){
        return CPF_PATTERN.matcher(CPF).matches();
    }
}
