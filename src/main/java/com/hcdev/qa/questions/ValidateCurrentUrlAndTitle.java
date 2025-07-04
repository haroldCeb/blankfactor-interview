package com.hcdev.qa.questions;

import com.hcdev.qa.interactions.actions.navigations.NavigateToContactPage;
import com.hcdev.qa.ui.RetirementAndWealthPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.hcdev.qa.interactions.actions.commons.ClickOnWidget.clickOnWidget;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateCurrentUrlAndTitle implements Task {

    private final String urlContentExpected;
    private final String titleContextExpected;

    private static final Logger LOGGER = Logger.getLogger(ValidateCurrentUrlAndTitle.class.getName());

    public ValidateCurrentUrlAndTitle(String urlContentExpected, String titleContextExpected) {
        this.urlContentExpected = urlContentExpected;
        this.titleContextExpected = titleContextExpected;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = Serenity.getDriver();
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();

        actor.attemptsTo(
            Ensure.that(title).contains(this.titleContextExpected),
            Ensure.that(currentUrl).contains(this.urlContentExpected)
        );

        String text = actor.recall("aiAndMachineLearningCardContent");
        if(LOGGER.isLoggable(Level.INFO)){
            LOGGER.log(Level.INFO, String.format("\nCurrent title: %s \nText copied from div card: %s", title, text));
        }
    }

    public static Performable validateCurrentUrlAndTitle(String urlContentExpected, String titleContextExpected){
        return instrumented(ValidateCurrentUrlAndTitle.class, urlContentExpected, titleContextExpected);
    }
}
