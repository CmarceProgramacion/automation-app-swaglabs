package com.swaglabs.tasks;

import com.swaglabs.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.swaglabs.userinterfaces.LoginSwaglabsPage.*;
import static com.swaglabs.userinterfaces.ProductsPage.LABEL_MESSAGE;

public class LoginTask implements Task {
    private final UserModel userModel;

    public LoginTask(UserModel userModel) {
        this.userModel = userModel;
    }

    public static Performable withTheData(UserModel userModel) {
        return Tasks.instrumented(LoginTask.class, userModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUser()).into(USER_INPUT),
                Enter.theValue(userModel.getPassword()).into(PASSWORD_INPUT),
                Click.on(BUTTON_LOGIN),
                Ensure.that(LABEL_MESSAGE.of(userModel.getLoginValidation())).isDisplayed());
    }
}
