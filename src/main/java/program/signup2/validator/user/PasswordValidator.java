package program.signup2.validator.user;

import program.signup2.validator.StringValidator;

public class PasswordValidator implements StringValidator {
    @Override
    public boolean isValid(String password) {
        // check
        System.out.println("PasswordValidator");
        return true;
    }
}
