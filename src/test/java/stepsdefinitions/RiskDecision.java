package stepsdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class RiskDecision {
    private WebDriver driver;
    private void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @Before
    public void initializeDriver() {
        // Initialized webDriver using firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    @Given("I am on the LexisNexis Risk Solutions page")
    public void i_am_on_the_sample_app_login_page() {
        // Visiting homepage of LexisNexis WebApp
        driver.get("https://risk.lexisnexis.co.uk/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
    @And("I accept cookies")
    public void i_accept_cookies() throws InterruptedException {
        // Here we are waiting for cookies popup to accept cookies
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id=\"onetrust-accept-btn-handler\"]"))).click();
        Thread.sleep(500);
    }
    @And("I verify heading {string}")
    public void i_fill_in_the_user_name_as(String text) {
        // Added assertions to verify headings text visibility
        assertEquals(driver.findElement(By.xpath("//*[@class='score-center']//h1")).getText(), (text));
    }
    @And("I click on element financial services")
    public void i_clicked_on_element_financial_services() {
        // Scrolling page to click required element
        scrollPage();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div[1]/div[2]/div[2]/a[2]")).click();
    }
    @And("I click on element financial service from dropdown")
    public void i_clicked_on_element_financial_service_from_dropdown() {
        driver.findElement(By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[1]/a")).click();
    }
    @And("I click Choose your industry dropdown")
    public void i_click_Choose_your_industry_dropdown() {
        driver.findElement(By.cssSelector("li.score-industry-section-menu")).click();
        // Verifying Dropdown title to assure dropdown's visibility
        assertEquals(driver.findElement(By.xpath("//h3[@class='section-title']")).getText(), ("Industries"));
    }
    @When("I click on element Insurance")
    public void i_clicked_on_element_insurance() {
        scrollPage();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[2]/div[2]/a[2]")).click();
    }
    @When("I click on element Life and Pensions")
    public void i_clicked_on_element_life_and_pensions() {
        scrollPage();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div[3]/div[2]/div[2]/a[2]")).click();
    }
    @When("I click on element Corporations and Non-Profits")
    public void i_clicked_on_element_corporations_and_non_profits() {
        scrollPage();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div[4]/div[2]/div[2]/a[2]")).click();
    }
    @When("I click on Financial Crime Compliance")
    public void i_click_on_financial_crime_compliance() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[1]/a")).click();
    }
    @When("I click on Fraud and Identity Management")
    public void i_click_on_fraud_and_identity_management() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[2]/a")).click();
    }
    @When("I click on Customer Data Management")
    public void i_click_on_customer_data_management() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[3]/a")).click();
    }
    @When("I click on Credit Risk Assessment")
    public void i_click_on_credit_risk_assessment() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[4]/a")).click();
    }
    @When("I click on Collections and Recovery")
    public void i_click_on_collections_and_recovery() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[5]/a")).click();
    }
    @When("I click on Investigations and Due Diligence")
    public void i_click_on_investigations_and_due_diligence() {
        driver.findElement(By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[6]/a")).click();
    }
    @Then("I verify sub heading {string}")
    public void i_click_on_the_log_in_button(String text) {
        assertEquals(driver.findElement(By.xpath("//*[@class='score-center']//h1")).getText(), (text));
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}