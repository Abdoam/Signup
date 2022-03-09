package program.signup2;

import program.model.User;
import program.signup2.validator.StringValidator;

public class SignupWithEmail extends SignUpHandler {
    private final StringValidator emailValidator;

    public SignupWithEmail(StringValidator usernameValidator, StringValidator passwordValidator) {
        super(passwordValidator);
        this.emailValidator = usernameValidator;
    }

    @Override
    public boolean register(User user) {
        return super.register(user) && emailValidator.isValid(user.getEmail());
    }
}
