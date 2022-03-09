import program.model.User;
import program.signup1.SignUpHandler;
import program.signup1.SignUpWithEmailHandler;
import program.signup1.validator.EmailValidator;
import program.signup1.validator.PasswordValidator;
import program.signup1.validator.UsernameValidator;

public class MainSignup1 {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setUsername("Abdo")
                .setPassword("1234")
                .setEmail("abc@gmail")
                .build();

        UsernameValidator usernameValidator =
                new UsernameValidator();
        PasswordValidator passwordValidator =
                new PasswordValidator();
        EmailValidator emailValidator =
                new EmailValidator();

        SignUpHandler signUpHandlerWithUsername = new SignUpHandler(usernameValidator, passwordValidator);
        SignUpHandler signUpHandlerWithEmail = new SignUpWithEmailHandler(emailValidator, passwordValidator);

        signUpHandlerWithUsername.register(user);
        signUpHandlerWithEmail.register(user);

        System.out.println(user);
    }
}
