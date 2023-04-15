package com.vfernandes.Utils.Validators;

import java.util.regex.Pattern;

public class CNPJValidator {
    private static final String CNPJ_REGEX = "^[0-9]{14}$";
    private static final Pattern CNPJ_PATTERN = Pattern.compile(CNPJ_REGEX);

    /***
     * Checks if the key is a CNPJ following the <a href="https://www.bcb.gov.br/content/estabilidadefinanceira/forumpireunioes/api-dict.html#tag/Directory">DICT  API</a> rules, it only validate if the key has the length of a CNPJ.
     * Must only container numbers
     * Allowed example:  12345678901234
     * @return boolean - True if it's a CNPJ False if it's not a CNPJ
     */
    public static boolean isValidCNPJ(String cnpj){
        return CNPJ_PATTERN.matcher(cnpj).matches();
    }
}
