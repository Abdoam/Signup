package program.signup3.validator.user;

import program.signup3.validator.StringValidator;

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
