package platform;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class Android implements IPlatform {
    @Override
    public AppiumDriver getDriver() {
        try {
            AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
            service.start();
            return new AndroidDriver(getRemoteAddress(), Capabilities.getCustomCapabilities());
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao obter driver: URL malformada", e);
        } catch (AppiumServerHasNotBeenStartedLocallyException e) {
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server não foi iniciado", e);
        }
    }
}
