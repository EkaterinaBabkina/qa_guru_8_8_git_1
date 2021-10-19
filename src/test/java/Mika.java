import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Mika {
    @Test
    void SearchMikaOnWiki() {
        open("https://www.google.ru/");
        $(byName("q")).setValue("Mika").pressEnter();
        $(byText("Милка - Википедия")).click();


    }
}