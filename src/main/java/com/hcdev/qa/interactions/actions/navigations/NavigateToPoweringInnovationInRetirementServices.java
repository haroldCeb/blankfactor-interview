package com.hcdev.qa.interactions.actions.navigations;

import com.hcdev.qa.interactions.actions.commons.OpenBrowser;
import com.hcdev.qa.ui.BlankFactorHomePage;
import com.hcdev.qa.ui.RetirementAndWealthPage;
import net.serenitybdd.core.pages.PageObject;
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

public class NavigateToPoweringInnovationInRetirementServices implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            MoveMouse.to(BlankFactorHomePage.DDOWN_INDUSTRIES),
            MoveMouse.to(BlankFactorHomePage.BTN_RETIREMENT_AND_WEALTH),
            clickOnWidget(BlankFactorHomePage.BTN_RETIREMENT_AND_WEALTH),
            WaitUntil.the(RetirementAndWealthPage.H2_POWERING_INNOVATION_SUB_TITLE, isClickable()).forNoMoreThan(5).seconds().then(
                Scroll.to(RetirementAndWealthPage.H2_POWERING_INNOVATION_SUB_TITLE)
            ),
            MoveMouse.to(RetirementAndWealthPage.DIV_CARD_AI_AND_MACHINE_LEARNING)
                .andThen(actions -> {
                    String text = actor.asksFor(TextContent.of(RetirementAndWealthPage.DIV_CARD_AI_AND_MACHINE_LEARNING_HOVER_CONTENT));
                    actor.remember("aiAndMachineLearningCardContent", text);
                })
        );
    }

    public static Performable navigateToPoweringInnovationInRetirementServices(){
        return instrumented(NavigateToPoweringInnovationInRetirementServices.class);
    }
}
