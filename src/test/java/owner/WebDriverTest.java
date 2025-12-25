package owner;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest extends TestBase {

    @Test
    public void openMainPageTest(){
        open("/");
        assertEquals(title(), "Mail: Почта, Облако, Календарь, Заметки, Покупки — сервисы для работы и жизни");
    }
}
