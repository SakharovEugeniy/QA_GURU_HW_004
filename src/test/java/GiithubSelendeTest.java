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
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void GiithubSelendeSoftAssertionsJUnit5Test(){
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        //$$("ul[data-filterable-for=wiki-pages-filter] li").findBy(text("SoftAssertions")).click();
        $$(".list-style-none li").findBy(text("SoftAssertions")).click();
    }

}
