package program.signup4.validator.user;

import program.signup4.validator.StringValidator;

public class EmailValidator implements StringValidator {
    private String email;

    @Override
    public boolean isValid(String email) {
        // check
        System.out.println("EmailValidator");
        this.email = email;
        return true;
    }

    @Override
    public String getValue() {
        return email;
    }
}
