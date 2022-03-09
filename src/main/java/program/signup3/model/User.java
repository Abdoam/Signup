package program.signup3.model;

import program.signup3.validator.StringValidator;
import program.signup3.validator.user.EmailValidator;
import program.signup3.validator.user.PasswordValidator;
import program.signup3.validator.user.UsernameValidator;

public class User {
    private final StringValidator username;
    private final StringValidator email;
    private final StringValidator password;

    private User(StringValidator username, StringValidator email, StringValidator password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username.getValue();
    }

    public void setUsername(String username) {
        this.username.isValid(username);
    }

    public String getEmail() {
        return email.getValue();
    }

    public void setEmail(String email) {
        this.email.isValid(email);
    }

    public String getPassword() {
        return password.getValue();
    }

    public void setPassword(String password) {
        this.password.isValid(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username.getValue() + '\'' +
                ", email='" + email.getValue() + '\'' +
                ", password='" + password.getValue() + '\'' +
                '}';
    }

    public static class Builder {
        private String username;
        private String email;
        private String password;
        private StringValidator usernameValidator;
        private StringValidator emailValidator;
        private StringValidator passwordValidator;

        public User build() {
            // set default params
            if (usernameValidator == null) usernameValidator = new UsernameValidator();
            if (emailValidator == null) emailValidator = new EmailValidator();
            if (passwordValidator == null) passwordValidator = new PasswordValidator();

            User user = new User(usernameValidator, emailValidator, passwordValidator);
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);

            return user;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUsernameValidator(StringValidator usernameValidator) {
            this.usernameValidator = usernameValidator;
            return this;
        }

        public Builder setEmailValidator(StringValidator emailValidator) {
            this.emailValidator = emailValidator;
            return this;
        }

        public Builder setPasswordValidator(StringValidator passwordValidator) {
            this.passwordValidator = passwordValidator;
            return this;
        }
    }
}
