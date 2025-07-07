package steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.GlobalDriver;

public class BaseSteps {

    protected static AppiumDriver driver;

    @BeforeAll
    public static void setup() {
        try{
            GlobalDriver.set();
        }
        catch(Exception e){
            System.out.println("driver could not initiate");
            GlobalDriver.close();
        }
        driver = GlobalDriver.get();
        System.out.println("Global Driver BaseSteps");
    }


    @AfterStep
    public void finish(Scenario scenario)throws IllegalMonitorStateException{
        byte[] image = null;
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        try {
            image = FileUtils.readFileToByteArray(src);
        } catch (IOException e) {
            System.out.println("file not readable");
            
        }
        scenario.attach(image, "image/png", "image");
    }


    @After
    public static void finish(){
        GlobalDriver.close();
    }

}
