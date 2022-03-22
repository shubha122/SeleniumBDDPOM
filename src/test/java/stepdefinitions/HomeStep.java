package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class HomeStep {
	private WebDriver driver;
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage ;
	
	
	@Given("user has already logged in")
	public void user_has_already_logged_in(DataTable dataTable) {
		List<Map<String,String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://palo-it.fitnetmanager.com/");
		homePage = loginPage.doLogin(userName, passWord);
		
	}

	@Given("user is on account page")
	public void user_is_on_account_page() {
		Assert.assertTrue(loginPage.getHomepageTitle());

	}

	@Then("user gets the home page menu")
	public void user_gets_the_home_page_menu(DataTable menuContent) {
		List<String> expectedMenuContentList = menuContent.asList();
		System.out.println(expectedMenuContentList);
		List<String> actualMenuContentList = homePage.menuOptions();
		System.out.println(actualMenuContentList);
		Assert.assertTrue(expectedMenuContentList.containsAll(actualMenuContentList));
		
	}
	@Then("count should be {int}")
	public void count_should_be(Integer menuCount) {
		int menuSize = homePage.countMenuOptions();
		System.out.print(menuSize);
		Assert.assertTrue(menuSize==menuCount);
		
	}

}
