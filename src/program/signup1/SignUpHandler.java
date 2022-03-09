package program.signup1;


import program.model.User;
import program.signup1.validator.PasswordValidator;
import program.signup1.validator.UsernameValidator;

public class SignUpHandler {
    private final UsernameValidator usernameValidator;
    private final PasswordValidator passwordValidator;

    public SignUpHandler(UsernameValidator usernameValidator, PasswordValidator passwordValidator) {
        this.usernameValidator = usernameValidator;
        this.passwordValidator = passwordValidator;
    }

    public PasswordValidator getPasswordValidator() {
        return passwordValidator;
    }

    public boolean register(User user) {
        // code
        return usernameValidator.isValidUsername(user.getUsername())
                && passwordValidator.isValidPassword(user.getPassword());
    }
}
