import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GiithubSelendeTest {

    String codeText =
"""
@ExtendWith({SoftAssertsExtension.class})
class Tests {
  @Test
  void test() {
    Configuration.assertionMode = SOFT;
    open("page.html");

    $("#first").should(visible).click();
    $("#second").should(visible).click();
  }
}
""";

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
        $$("div.markdown-heading").findBy(text("Using JUnit5 extend test class:")).sibling(0).shouldHave(exactText(codeText));
    }

}
