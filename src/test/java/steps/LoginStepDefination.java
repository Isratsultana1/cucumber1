package steps;

import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {

	LoginPage loginPage;

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		initDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("User enters username as {string}")
	public void User_enters_username_as(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_log_in_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {		
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
//
//	@When("User enters the {string}in the {string} field")
//	public void user_enters_the_in_the_field(String userInfo, String field) {
//		switch (field) {
//		case "Username":
//			loginPage.enterUserName(userInfo);
//			break;
//		case "Password":
//			loginPage.enterPassword(userInfo);
//			break;
//		}
//	}
//
//	@When("User enters as(String)")
//	public void user_enters_as(String password) {
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
//		loginPage.enterPassword(password);
//	}
//
//	@Then("User clicks on sign in button")	
//	public void user_clicks_on_sign_in_button() {
//   loginPage.clickSignInButton();
   }

