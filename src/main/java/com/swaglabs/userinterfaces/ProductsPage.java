package com.swaglabs.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage extends PageObject {
    public static final Target LABEL_TITLE_PRODUCT = Target.the("").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target BUTTON_ADD_TO_CART = Target.the("").locatedBy("//android.view.ViewGroup[contains(@content-desc,'test-ADD')]");
    public static final Target ICON_ADD_TO_CART = Target.the("").locatedBy("//android.view.ViewGroup[@content-desc='test-Cart']");

}
