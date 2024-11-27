import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GiithubSelendeTest {

    @BeforeAll
    static void BeforeAll(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void GiithubSelendeSoftAssertionsJUnit5Test(){
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        $(".wiki-more-pages-link").$("button").click();
        $("[class=' js-wiki-sidebar-toggle-display']").find(byText("SoftAssertions")).click();
        $$("div.markdown-heading").findBy(text("Using JUnit5 extend test class:")).sibling(0)
                .shouldHave(text("SoftAssertsExtension"));   //на мой взгляд в данном задании приоритетным было посмотреть,
                                                             //что именно после заголовка JUnit5 идёт пример с этим кодом
    }

}
