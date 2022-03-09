package program.signup3;


import program.signup3.model.User;

public class SignupWithUsername implements SignUpHandler {
    @Override
    public boolean register(User user) {
        System.out.println("SignupWithUsername");
        return true;
    }
}
