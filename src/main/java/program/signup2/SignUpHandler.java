package program.signup2;

import program.model.User;
import program.signup2.validator.StringValidator;

public abstract class SignUpHandler {
    private final StringValidator passwordValidator;

    public SignUpHandler(StringValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    public boolean register(User user) {
        // code
        return passwordValidator.isValid(user.getPassword());
    }
}

