package com.swaglabs.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage extends PageObject {
    public static final Target LABEL_TITLE_PRODUCT = Target.the("LABEL TITLE PRODUCT").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target BUTTON_ADD_TO_CART = Target.the("BUTTON ADD TO CART").locatedBy("//android.view.ViewGroup[contains(@content-desc,'test-ADD')]");
    public static final Target ICON_ADD_TO_CART = Target.the("ICON ADD TO CART ").locatedBy("//android.view.ViewGroup[@content-desc='test-Cart']");
    public static final Target BUTTON_CHECKOUT = Target.the("BUTTON CHECKOUT").locatedBy("//android.view.ViewGroup[@content-desc='test-CHECKOUT']");
    public static final Target INPUT_FIRST_NAME = Target.the("INPUT FIRST NAME").locatedBy("//android.widget.EditText[@content-desc='test-First Name']");
    public static final Target INPUT_LAST_NAME = Target.the("INPUT LAST NAME").locatedBy("//android.widget.EditText[@content-desc='test-Last Name']");
    public static final Target INPUT_POSTAL_CODE = Target.the("INPUT POSTAL CODE").locatedBy("//android.widget.EditText[@content-desc='test-Zip/Postal Code']");
    public static final Target BUTTON_CONTINUE = Target.the("BUTTON CONTINUE").locatedBy("//android.view.ViewGroup[@content-desc='test-CONTINUE']/android.widget.TextView");
    public static final Target BUTTON_FINISH = Target.the("BUTTON FINISH").locatedBy("//android.view.ViewGroup[@content-desc='test-FINISH']");
    public static final Target LABEL_MESSAGE = Target.the("LABEL MESSAGE").locatedBy("//android.widget.TextView[@text='{0}']");

}
