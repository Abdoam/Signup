package program.signup4.validator.user;

import program.signup4.validator.StringValidator;

public class PasswordValidator implements StringValidator {
    private String password;

    @Override
    public boolean isValid(String password) {
        // check
        System.out.println("PasswordValidator");
        this.password = password;
        return true;
    }

    @Override
    public String getValue() {
        return password;
    }
}
