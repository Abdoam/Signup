package program.signup4.model;

import program.signup4.validator.StringValidator;

import javax.inject.Inject;
import javax.inject.Named;

public class User {
    private final StringValidator username;
    private final StringValidator email;
    private final StringValidator password;

    @Inject
    private User(@Named("username") StringValidator username, @Named("email") StringValidator email, @Named("password") StringValidator password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username.getValue();
    }

    public User setUsername(String username) {
        this.username.isValid(username);
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public User setEmail(String email) {
        this.email.isValid(email);
        return this;
    }

    public String getPassword() {
        return password.getValue();
    }

    public User setPassword(String password) {
        this.password.isValid(password);
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username.getValue() + '\'' +
                ", email='" + email.getValue() + '\'' +
                ", password='" + password.getValue() + '\'' +
                '}';
    }
}
