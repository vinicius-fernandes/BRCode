package com.vfernandes.Utils.Validators;

import java.util.regex.Pattern;


public class EmailValidator {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    /***
     * Checks if the key is an email  following the <a href="https://html.spec.whatwg.org/multipage/input.html#valid-e-mail-address">W3C HTML5</a> rules.
     * Must be lower case and have a max of 77 characters
     * Allowed example: pix@bcb.gov.br
     * @return boolean - True if it's a email False if it's not a email
     */
    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
