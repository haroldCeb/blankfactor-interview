package com.hcdev.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/blank-factor-home-page.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = {
        "com.hcdev.qa.stepdefinitions"
    },
    tags = "@blank-factor-homepage-interactions",
    plugin = {"pretty"}
)
public class BlankFactorHomePageTestRunner {
}
