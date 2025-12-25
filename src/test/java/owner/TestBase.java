package owner;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import owner.config.WebDriverConfig;

public class TestBase {

    private static WebDriverConfig config;

    @BeforeAll
    static void beforePageTest() {

        config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        if ("CHROME".equalsIgnoreCase(config.getBrowser())) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
        } else if ("FIREFOX".equalsIgnoreCase(config.getBrowser())) {
            WebDriverManager.firefoxdriver().setup();
            Configuration.browser = "firefox";
        } else {
            // Значение по умолчанию
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
        }

        if (config.isRemote()) {
            Configuration.remote = config.getRemoteURL();
        }

        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @AfterEach
    public void stopDriver() {
        closeWebDriver();
    }
}