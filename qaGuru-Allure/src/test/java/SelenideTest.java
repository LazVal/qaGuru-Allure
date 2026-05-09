import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $x("//button[@data-action='click:qbsearch-input#handleExpand']").click();
        $x("//input[@id='query-builder-test']").sendKeys("lazval/qaGuru-Allure");
        $x("//input[@id='query-builder-test']").submit();

        $x("//a[@href='/LazVal/qaGuru-Allure']").click();
        $("#issues-tab").click();
        $(withText("TestIssues")).should(Condition.exist);
    }

}