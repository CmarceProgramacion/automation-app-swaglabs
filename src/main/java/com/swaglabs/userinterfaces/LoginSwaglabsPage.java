package com.swaglabs.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSwaglabsPage extends PageObject {
    public static final Target USER_INPUT = Target.the("USER INPUT").locatedBy("//android.widget.EditText[@content-desc='test-Username']");
    public static final Target PASSWORD_INPUT = Target.the("PASSWORD INPUT ").locatedBy("//android.widget.EditText[@content-desc='test-Password']");
    public static final Target BUTTON_LOGIN = Target.the("BUTTON LOGIN").locatedBy("//android.view.ViewGroup[@content-desc='test-LOGIN']");

}
