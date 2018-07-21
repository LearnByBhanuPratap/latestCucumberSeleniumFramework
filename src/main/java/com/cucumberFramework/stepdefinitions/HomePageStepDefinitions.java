package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public class HomePageStepDefinitions extends TestBase{

	HomePage homePage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Then("^I sould see application homepage$")
	public void i_sould_see_application_homepage() throws Throwable {
		homePage.getAdministrator().isDisplayed();
	}

	@Then("^I sould see administrator text message on home Page$")
	public void i_sould_see_administrator_text_message_on_home_Page() throws Throwable {
		homePage.administrator.isDisplayed();
	}
	
	@Given("^I am on home page of application$")
	public void i_am_on_home_page_of_application() throws Throwable {
		homePage.administrator.isDisplayed();
		
	}

	@Then("^I should see home page$")
	public void i_should_see_home_page() throws Throwable {
		homePage.administrator.isDisplayed();
	}
	

	@When("^I click on leads link$")
	public void i_click_on_leads_link() throws Throwable {
		homePage.navigateToLeads();
	}



}