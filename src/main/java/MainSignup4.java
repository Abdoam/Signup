import com.google.inject.Guice;
import com.google.inject.Injector;
import program.signup4.SignUpHandler;
import program.signup4.SignupWithEmail;
import program.signup4.SignupWithUsername;
import program.signup4.injector.AppInjector;
import program.signup4.model.User;

public class MainSignup4 {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());

        User user = injector.getInstance(User.class)
                .setUsername("Abdo")
                .setPassword("1234")
                .setEmail("abc@gmail");

        SignUpHandler signUpHandlerWithUsername = injector.getInstance(SignupWithUsername.class);
        SignUpHandler signUpHandlerWithEmail = injector.getInstance(SignupWithEmail.class);

        signUpHandlerWithUsername.register(user);
        signUpHandlerWithEmail.register(user);

        System.out.println(user);
    }
}
