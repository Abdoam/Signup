package program.signup4;


import program.signup4.model.User;

import javax.inject.Singleton;

@Singleton
public class SignupWithUsername implements SignUpHandler {
    @Override
    public boolean register(User user) {
        System.out.println("SignupWithUsername");
        return true;
    }
}
