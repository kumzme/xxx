package Steps;

import com.Common.automation.CoreUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

import static com.Common.automation.TestHelpers.getDefaultWebDriver;


public class Steps {
    private static final Logger logger = LoggerFactory.getLogger(CoreUtils.class);

    @Given("I just did something {string}")
    public void i_just_did_something(String string) throws Exception {

        WebDriver driver_web = getDefaultWebDriver();
        driver_web.navigate().to("https://www.espncricinfo.com");
        Allure.addAttachment("Attachment _ 01", "application/json", "{aa:bb}");
        Allure.epic("Some Epic");
        Allure.description("Doing something Me");
        Allure.feature("Name of scenario");
        Allure.issue("Defect Number", "Something ");
        Allure.suite("Saaa");
        Allure.step("Saa", Status.PASSED);
        Allure.story("Name of story");
        Allure.label("1", "1a");
        Allure.parameter("aa22", new HashMap<>().put("aa", "value"));
        Allure.getLifecycle().getCurrentTestCase();
        Allure.getLifecycle().getCurrentTestCaseOrStep();

        logger.info("___");
    }

    @Then("Try this  {string}")
    public void try_this(String string) {

    }
}
