package com.hcdev.qa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RetirementAndWealthPage extends PageObject {
    public static final Target H2_POWERING_INNOVATION_SUB_TITLE = Target.the("Industries dropdown")
        .located(By.cssSelector("div[class='content page-content page-life-sciences'] h2:nth-child(1)"));

    public static final Target DIV_CARD_AI_AND_MACHINE_LEARNING = Target.the("AI and machine learning card")
        .located(By.cssSelector(".swiper-wrapper.px-5 > .swiper-slide:nth-of-type(3)"));

    public static final Target DIV_CARD_AI_AND_MACHINE_LEARNING_HOVER_CONTENT = Target.the("AI and machine learning card content after hover")
        .located(By.cssSelector(".swiper-wrapper.px-5 > .swiper-slide:nth-of-type(3) .card-text.small"));

    public static final Target BTN_LETS_GET_STARTED = Target.the("Let's get started button")
        .located(By.cssSelector(".footer__header a"));

}
