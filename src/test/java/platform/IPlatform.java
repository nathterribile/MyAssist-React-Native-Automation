package platform;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import main.Variaveis;

public interface IPlatform {

    default URL getRemoteAddress() throws MalformedURLException {
        String url = Variaveis.get().asString("remoteAddress", "http://127.0.0.1:4723");
        System.out.println("Using remote address: " + url);
        return new URL(url);
    }

    AppiumDriver getDriver();
}
