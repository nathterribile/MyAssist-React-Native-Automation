package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.BaseSteps;

public class BasePage extends BaseSteps {

    
    static WebDriverWait wait = new WebDriverWait(BaseSteps.driver, Duration.ofSeconds(60));
    
    public static void visibilityOf(WebElement el) {
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    public static void toBeClickable(WebElement el) {
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    public static void click(WebElement el) {
        el.click();
    }

    public static String getText(WebElement el) {
        return el.getText();
    }

    public static void sendKeys(WebElement el, String text) {
        el.sendKeys(text);
    }

    public static void moveToElement(WebElement el) {
        Actions action = new Actions(driver);
        action.moveToElement(el).build().perform();
    }
    
}
