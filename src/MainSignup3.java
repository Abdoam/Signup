import program.signup3.SignUpHandler;
import program.signup3.SignupWithEmail;
import program.signup3.SignupWithUsername;
import program.signup3.model.User;
import program.signup3.validator.StringValidator;
import program.signup3.validator.user.EmailValidator;
import program.signup3.validator.user.PasswordValidator;
import program.signup3.validator.user.UsernameValidator;

public class MainSignup3 {
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

        SignUpHandler signUpHandlerWithUsername = new SignupWithUsername();
        SignUpHandler signUpHandlerWithEmail = new SignupWithEmail();

        signUpHandlerWithUsername.register(user);
        signUpHandlerWithEmail.register(user);

        System.out.println(user);
    }
}
