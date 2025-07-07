package utils;

import io.appium.java_client.AppiumDriver;
import platform.Platform;

public class GlobalDriver {
    private static AppiumDriver driver;

    public static void set() {
        driver = Platform.getDriver();

    }

    public static AppiumDriver get() {
        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
    }
}
