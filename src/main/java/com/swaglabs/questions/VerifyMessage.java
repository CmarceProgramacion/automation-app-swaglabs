package com.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.swaglabs.userinterfaces.ProductsPage.LABEL_MESSAGE;

public class VerifyMessage implements Question<Boolean> {
    private String name;

    public VerifyMessage(String name) {
        this.name = name;
    }

    public static VerifyMessage verify(String name) {
        return new VerifyMessage(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_MESSAGE.of(name).isVisibleFor(actor);
    }
}
