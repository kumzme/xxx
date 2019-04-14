// TS created By Deepa
package mahesh.utils.integration;

import static mahesh.automation.CommonApplicationMethods.click_Element;
import static mahesh.automation.CommonApplicationMethods.setText_Element;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import mahesh.automation.CommonApplicationMethods;

// *Deepa-
public class kjhs {
  private static final Logger logger = LogManager.getLogger(FinancialSectionPage.class.getName());
  int get_The_Row_From_Login_Data;
  private WebDriver webDriver;


  public kjhs(WebDriver mydriver) {
    this.webDriver = mydriver;
  }

  public void NewFinancialQuestion() throws Exception {
    // Locate section for 'Cash on Hand' enter all valid data as required.
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_363_setText", "01052017");
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_364_setText", "2000");
    // Locate the Savings Account(s) Balance Search box
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_365_setText", "5000");
    // Locate the Checking Account(s) Balance Search box
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_366_setText", "5000");
    // Locate the Continue button and click on it to continue.
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Locate section for Other Source of Income enter all valid data as
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_367_setText", "7000");
    // Locate the Other Income search box and enter Other Income.
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_368_setText", "0");
    // Locate the applicant Business Type and enter amount of applicant
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_369_setText", "800000");
    // Locate the applicant equity in other firm and enter applicant
    // business equity.
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_370_setText", "50000");
    // Locate the continue button and click on it to continue.
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Locate and NO for question 'Do you have any notes receivable from
    click_Element(webDriver, "orgwsb_financial_Page_Ans_371_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Select NO for the two question on Retirement Accounts.
    click_Element(webDriver, "orgwsb_financial_Page_Ans_372_N");
    click_Element(webDriver, "orgwsb_financial_Page_Ans_373_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Locate and select yes for question, Do you have loan against a life
    // Life insurance.
    click_Element(webDriver, "orgwsb_financial_Page_Ans_374_N");
    click_Element(webDriver, "orgwsb_financial_Page_Ans_375_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Select No for the Stock and Bonds Section.
    click_Element(webDriver, "orgwsb_financial_Page_Ans_377_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Select No for Real Estate - Primary Residence Section questions.
    click_Element(webDriver, "orgwsb_financial_Page_Ans_378_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Select No for Real Estate - Other
    click_Element(webDriver, "orgwsb_financial_Page_Ans_380_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Personal Property.
    click_Element(webDriver, "orgwsb_financial_Page_Ans_382_N");
    click_Element(webDriver, "orgwsb_financial_Page_Ans_383_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Notes Payable and Other Liabilities
    click_Element(webDriver, "orgwsb_financial_Page_Ans_384_N");
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Assesses Taxes
    click_Element(webDriver, "orgwsb_financial_Page_Ans_385_N");
    // Locate and click on the continue button.
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Locate the next 3 search boxes for Adjusted Gross Income and enter
    // valid data.
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_386_SetText", "1000");
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_387_SetText", "2000");
    setText_Element(webDriver, "orgwsb_financial_Page_Ans_388_SetText", "3000");
    // Locate and click on the continue button.
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Check Personal Summary page Reached -Click on the save and continue button.
    // webDriver.findElement(By.xpath("//a[ contains (@id,'personal_summary')]")).getText();
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Privacy Statement
    click_Element(webDriver, "orgwsb_Questionnaire_Page_Commit");
    // Verify that user is being navigated to the Review Page.
    click_Element(webDriver, "Application_Common_Submit_Button");
    CommonApplicationMethods.accept_Alert(webDriver, 4);

  }

  private void assertEquals(String actual_Text1, String expected_Text1) {
    // TODO Auto-generated method stub
  }
}
