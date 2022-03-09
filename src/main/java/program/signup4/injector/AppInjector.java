package program.signup4.injector;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import program.signup4.validator.StringValidator;
import program.signup4.validator.user.EmailValidator;
import program.signup4.validator.user.PasswordValidator;
import program.signup4.validator.user.UsernameValidator;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(StringValidator.class).annotatedWith(Names.named("username")).to(UsernameValidator.class);
		bind(StringValidator.class).annotatedWith(Names.named("email")).to(EmailValidator.class);
		bind(StringValidator.class).annotatedWith(Names.named("password")).to(PasswordValidator.class);
	}

}
