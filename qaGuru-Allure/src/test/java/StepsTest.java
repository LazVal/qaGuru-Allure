import org.junit.jupiter.api.Test;
import steps.WebStep;
import testData.TestData;

public class StepsTest {

    @Test
    public void testIssueSearchSteps() {
        WebStep steps = new WebStep();

        steps.openMainPage();
        steps.clickSearchButton();
        steps.searchRepository();
        steps.clickIssues();
        steps.existIssues();
    }
}
