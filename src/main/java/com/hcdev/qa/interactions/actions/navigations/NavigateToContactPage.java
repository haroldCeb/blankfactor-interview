package com.hcdev.qa.interactions.actions.navigations;

import com.hcdev.qa.ui.BlankFactorHomePage;
import com.hcdev.qa.ui.RetirementAndWealthPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.hcdev.qa.interactions.actions.commons.ClickOnWidget.clickOnWidget;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class NavigateToContactPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(RetirementAndWealthPage.BTN_LETS_GET_STARTED),
            clickOnWidget(RetirementAndWealthPage.BTN_LETS_GET_STARTED)
        );
    }

    public static Performable navigateToContactPage(){
        return instrumented(NavigateToContactPage.class);
    }

}
