package com.swaglabs.tasks;

import com.swaglabs.interactions.FocusElement;
import com.swaglabs.models.PurchaseModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.swaglabs.userinterfaces.ProductsPage.*;

public class BuyProductTask implements Task {
    private final PurchaseModel purchaseModel;

    public BuyProductTask(PurchaseModel purchaseModel) {
        this.purchaseModel = purchaseModel;
    }

    public static Performable withTheData(PurchaseModel purchaseModels) {
        return Tasks.instrumented(BuyProductTask.class, purchaseModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FocusElement.focusTextElement(purchaseModel.getProductName()),
                Click.on(LABEL_TITLE_PRODUCT.of(purchaseModel.getProductName())),
                FocusElement.focusTextElement("ADD TO CART"),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(ICON_ADD_TO_CART),
                Click.on(BUTTON_CHECKOUT),
                Enter.theValue(purchaseModel.getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(purchaseModel.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(purchaseModel.getPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(BUTTON_CONTINUE),
                FocusElement.focusTextElement("FINISH"),
                Click.on(BUTTON_FINISH)
        );
    }
}
