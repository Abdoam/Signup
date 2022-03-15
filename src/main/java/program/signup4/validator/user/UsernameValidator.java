package program.signup4.validator.user;

import program.signup4.validator.StringValidator;

public class UsernameValidator implements StringValidator {
    private String username;

    @Override
    public boolean isValid(String username) {
        // check
        System.out.println("UsernameValidator");
        this.username = username;
        return true;
    }

    @Override
    public String getValue() {
        return username;
    }
}
