package platform;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class IOS implements IPlatform{
    @Override
    public AppiumDriver getDriver() {
        try{
            return new IOSDriver(getRemoteAddress(), Capabilities.getCustomCapabilities());
        }catch (MalformedURLException e){
            throw new RuntimeException("Erro ao obter driver " + e);
        }
    }
}
