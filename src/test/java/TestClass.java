import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestClass {

    @BeforeAll
    static void BeforeAll(){
        Configuration.holdBrowserOpen =true;
    }

    @Test
    void myTest(){
        open("http://localhost:8080test.html");
    }
}
