package owner.samples;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfigForProviderSample extends Config {

    @Key("baseUrl")
    @DefaultValue("https://mail.ru/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("remoteUrl")
    @DefaultValue("http://localhost:4444")
    URL getRemoteURL();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("version")
    @DefaultValue("128.0")
    String getBrowserVersion();
}
