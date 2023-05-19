package com.swaglabs.tasks;

import com.swaglabs.interactions.FocusElement;
import com.swaglabs.models.PurchaseModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.swaglabs.userinterfaces.ProductsPage.*;

public class BuyProductTask implements Task {
    private String productName;
    private String firstName;
    private String lastName;
    private String postalCode;

    public BuyProductTask(PurchaseModels purchaseModels) {
        this.productName = purchaseModels.getProductName();
        this.firstName = purchaseModels.getFirstName();
        this.lastName = purchaseModels.getLastName();
        this.postalCode = purchaseModels.getPostalCode();
    }

    public static Performable withTheData(PurchaseModels purchaseModels) {
        return Tasks.instrumented(BuyProductTask.class, purchaseModels);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FocusElement.focusTextElement(productName),
                Click.on(LABEL_TITLE_PRODUCT.of(productName)),
                FocusElement.focusTextElement("ADD TO CART"),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(ICON_ADD_TO_CART)
        );
    }
}
