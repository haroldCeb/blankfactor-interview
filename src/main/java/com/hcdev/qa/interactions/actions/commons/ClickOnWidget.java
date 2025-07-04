package com.hcdev.qa.interactions.actions.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickOnWidget implements Task {

    private final Target widget;
    private final String customLocator;

    public ClickOnWidget(Target widget) {
        this.widget = widget;
        this.customLocator = null;
    }

    public ClickOnWidget(String customLocator) {
        this.widget = null;
        this.customLocator = customLocator;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (widget != null) {
            actor.attemptsTo(
                WaitUntil.the(widget, isClickable()).forNoMoreThan(5).seconds().then(
                    Click.on(widget)
                )
            );
        } else {
            actor.attemptsTo(
                WaitUntil.the(By.xpath(customLocator), isClickable()).forNoMoreThan(5).seconds().then(
                    JavaScriptClick.on(By.xpath(customLocator))
                )
            );
        }
    }

    public static ClickOnWidget clickOnWidget(Target widget) {
        return instrumented(ClickOnWidget.class, widget);
    }

    public static ClickOnWidget clickOnWidget(String customLocator) {
        return instrumented(ClickOnWidget.class, customLocator);
    }
}
