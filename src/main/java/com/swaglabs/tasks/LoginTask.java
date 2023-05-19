package com.swaglabs.tasks;

import com.swaglabs.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.swaglabs.userinterfaces.LoginSwaglabsPage.*;

public class LoginTask implements Task {
    private String user;
    private String password;

    public LoginTask(UserModel userModel) {
        this.user = userModel.getUser();
        this.password = userModel.getPassword();
    }

    public static Performable withTheData(UserModel userModel) {
        return Tasks.instrumented(LoginTask.class, userModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(USER_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(BUTTON_LOGIN));
    }
}
