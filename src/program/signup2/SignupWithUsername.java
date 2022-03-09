package program.signup2;

import program.model.User;
import program.signup2.validator.StringValidator;

public class SignupWithUsername extends SignUpHandler {
    private final StringValidator usernameValidator;

    public SignupWithUsername(StringValidator usernameValidator, StringValidator passwordValidator) {
        super(passwordValidator);
        this.usernameValidator = usernameValidator;
    }

    @Override
    public boolean register(User user) {
        return super.register(user) && usernameValidator.isValid(user.getUsername());
    }
}
