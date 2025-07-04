package com.hcdev.qa.util.waits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExplicitWait {

    private static final Logger LOGGER = Logger.getLogger(ExplicitWait.class.getName());

    private ExplicitWait() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable waitSeconds(int seconds) {
        return new Task() {
            @Override
            public <T extends Actor> void performAs(T actor) {
                try {
                    Thread.sleep(seconds * 1000L);
                } catch (Exception e) {
                    if (LOGGER.isLoggable(Level.SEVERE)) {
                        LOGGER.log(Level.SEVERE, String.format("Couldn't perform explicit wait for %s seconds", seconds));
                    }
                    Thread.currentThread().interrupt();
                }
            }
        };
    }
}
