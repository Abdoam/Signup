import program.model.User;
import program.signup2.SignUpHandler;
import program.signup2.SignupWithEmail;
import program.signup2.SignupWithUsername;
import program.signup2.validator.StringValidator;
import program.signup2.validator.user.EmailValidator;
import program.signup2.validator.user.PasswordValidator;
import program.signup2.validator.user.UsernameValidator;

public class MainSignup2 {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setUsername("Abdo")
                .setPassword("1234")
                .setEmail("abc@gmail")
                .build();

        StringValidator usernameValidator =
                new UsernameValidator();
        StringValidator passwordValidator =
                new PasswordValidator();
        StringValidator emailValidator =
                new EmailValidator();

        SignUpHandler signUpHandlerWithUsername = new SignupWithUsername(usernameValidator, passwordValidator);
        SignUpHandler signUpHandlerWithEmail = new SignupWithEmail(emailValidator, passwordValidator);

        signUpHandlerWithUsername.register(user);
        signUpHandlerWithEmail.register(user);

        System.out.println(user);
    }
}
