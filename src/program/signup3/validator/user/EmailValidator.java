package program.signup3.validator.user;

import program.signup3.validator.StringValidator;

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
