package platform;

import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import main.Variaveis;

public class Capabilities {

    public static DesiredCapabilities getCustomCapabilities(){
        Map<String, String>  properties = getCapabilitiesFromFileProperties();
        properties.putAll(getCapabilitiesFromFileProperties());
        return getCapabilities(properties);
    }

    public static Map<String, String> getCapabilitiesFromFileProperties(){
        return Variaveis.get().AllFromLocalProperties();
    }

    private static DesiredCapabilities getCapabilities(Map<String, String> map){
        map.remove("remoteAddress");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        map.forEach(capabilities::setCapability);
        System.out.println(capabilities);
        return capabilities;
    }
}
