package program.signup2.validator.user;

import program.signup2.validator.StringValidator;

public class EmailValidator implements StringValidator {
    @Override
    public boolean isValid(String email) {
        // check
        System.out.println("EmailValidator");
        return true;
    }
}
