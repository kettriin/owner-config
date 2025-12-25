package owner.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:${mode}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://mail.ru/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("remoteUrl")
    String getRemoteURL();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("version")
    String getBrowserVersion();
}
