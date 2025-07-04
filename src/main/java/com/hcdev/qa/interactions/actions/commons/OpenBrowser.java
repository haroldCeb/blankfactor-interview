package com.hcdev.qa.interactions.actions.commons;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Task {

    private final PageObject page;

    public OpenBrowser(PageObject page){
        this.page = page;
    }


    @Override
    @Step("The web page is opened")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(page)
        );
    }

    public static Performable onPage(PageObject page){
        return instrumented(OpenBrowser.class, page);
    }
}
