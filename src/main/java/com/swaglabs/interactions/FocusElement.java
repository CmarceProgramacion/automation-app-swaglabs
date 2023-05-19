package com.swaglabs.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class FocusElement extends UIInteractionSteps implements Interaction {
    private final String textElement;

    public FocusElement(String textElement) {
        this.textElement = textElement;
    }

    public static Performable focusTextElement(String textElement) {
        return Tasks.instrumented(FocusElement.class, textElement);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().textContains(\"" + textElement + "\"));"));
    }
}