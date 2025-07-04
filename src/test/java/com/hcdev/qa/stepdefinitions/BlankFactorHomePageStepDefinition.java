package com.hcdev.qa.stepdefinitions;

import com.hcdev.qa.interactions.actions.commons.OpenBrowser;
import com.hcdev.qa.ui.BlankFactorHomePage;
import com.hcdev.qa.ui.RetirementAndWealthPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.hcdev.qa.interactions.actions.commons.ClickOnWidget.clickOnWidget;
import static com.hcdev.qa.interactions.actions.navigations.NavigateToContactPage.navigateToContactPage;
import static com.hcdev.qa.interactions.actions.navigations.NavigateToPoweringInnovationInRetirementServices.navigateToPoweringInnovationInRetirementServices;
import static com.hcdev.qa.questions.ValidateCurrentUrlAndTitle.validateCurrentUrlAndTitle;
import static com.hcdev.qa.util.waits.ExplicitWait.waitSeconds;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BlankFactorHomePageStepDefinition {

    @Managed
    WebDriver driver;
    Actor actor;
    private BlankFactorHomePage blankFactorHomePage;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("User");
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("the user navigates up to the powering innovation in retirement services section")
    public void theUserNavigatesUpToThePoweringInnovationInRetirementServicesSection() {
        actor.attemptsTo(
            OpenBrowser.onPage(blankFactorHomePage),
            navigateToPoweringInnovationInRetirementServices()
        );
    }


    @When("the user navigate to contact page")
    public void theUserNavigateToContactPage() {
        actor.attemptsTo(
            navigateToContactPage()
        );
    }

    @Then("URL and the title are validated")
    public void urlAndTheTitleAreValidated() {
        actor.attemptsTo(
            validateCurrentUrlAndTitle("contact", "Contact")
        );
    }
}
