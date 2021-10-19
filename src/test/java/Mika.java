import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Mika {
    @Test
    void SearchMikaOnWiki() {
        open("https://ru.wikipedia.org/wiki/");

        $(byName("search")).setValue("Vbrf").pressEnter();

        $(".firstHeading").shouldHave(text("Мика"));
    }
}