import program.signup3.SignUpHandler;
import program.signup3.SignupWithEmail;
import program.signup3.SignupWithUsername;
import program.signup3.model.User;

public class MainSignup3 {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setUsername("Abdo")
                .setPassword("1234")
                .setEmail("abc@gmail")
                .build();

        SignUpHandler signUpHandlerWithUsername = new SignupWithUsername();
        SignUpHandler signUpHandlerWithEmail = new SignupWithEmail();

        signUpHandlerWithUsername.register(user);
        signUpHandlerWithEmail.register(user);

        System.out.println(user);
    }
}
