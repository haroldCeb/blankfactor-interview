package com.hcdev.qa.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://blankfactor.com/")
public class BlankFactorHomePage extends PageObject {
    public static final Target DDOWN_INDUSTRIES = Target.the("Industries dropdown")
        .located(By.cssSelector("ul#menu-main-menu li.industries-mega-menu-wrap"));

    public static final Target BTN_RETIREMENT_AND_WEALTH = Target.the("Retirement and wealth button")
        .located(By.cssSelector("div.swiper-slide a.industry-item[title='Retirement and wealth']"));

}
