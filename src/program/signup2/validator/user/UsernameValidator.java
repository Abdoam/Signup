package program.signup2.validator.user;

import program.signup2.validator.StringValidator;

public class UsernameValidator implements StringValidator {
    @Override
    public boolean isValid(String username) {
        // check
        System.out.println("UsernameValidator");
        return true;
    }
}
