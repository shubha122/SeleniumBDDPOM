package stepdefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginStep {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private String title ;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://palo-it.fitnetmanager.com/");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {	
			System.out.print(title);
		Assert.assertTrue("Title match", title.contains(expectedTitleName));
	}

	@Then("Lost Your Password link should be displayed")
	public void lost_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isLostPasswordLInk());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on SignIn button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignIn();
	}
	@Then("user should be on Homepage")
	public void user_should_be_on_homepage() {
		Assert.assertTrue(loginPage.getHomepageTitle());
		
	}
	

}
