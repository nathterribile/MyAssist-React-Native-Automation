package platform;


import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import main.Variaveis;

public class Platform {

    public static AppiumDriver getDriver() {
        return getDriver(getPlatform());
    }

    private static IPlatform getPlatform() {
        String platform = Variaveis.get().asString("platformName", "Android");
        if(platform.equalsIgnoreCase("Android")) return new Android();
        else if(platform.equalsIgnoreCase("ios")) return new IOS();
        else throw new RuntimeException("Informe uma plataforma válida");
    }

    private static AppiumDriver getDriver(IPlatform plat) {
        AppiumDriver driver = plat.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }
}
