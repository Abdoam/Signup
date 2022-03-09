package program.signup1;

import program.model.User;
import program.signup1.validator.EmailValidator;
import program.signup1.validator.PasswordValidator;

public class SignUpWithEmailHandler extends SignUpHandler {
    private final EmailValidator emailValidator;

    public SignUpWithEmailHandler(EmailValidator emailValidator, PasswordValidator passwordValidator) {
        super(null, passwordValidator);
        this.emailValidator = emailValidator;
    }

    @Override
    public boolean register(User user) {
        // null exception because usernameValidator is null
        // return super.register(user);
        // code
        return emailValidator.isValidEmail(user.getEmail())
                && super.getPasswordValidator().isValidPassword(user.getPassword());
    }
}
