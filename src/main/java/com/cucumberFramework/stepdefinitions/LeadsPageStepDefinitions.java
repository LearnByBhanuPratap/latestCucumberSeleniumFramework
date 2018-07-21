package com.cucumberFramework.stepdefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumberFramework.helper.LoggerHelper;
import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LeadsCreationPage;
import com.cucumberFramework.pageObjects.LeadsVerificationPage;
import com.cucumberFramework.testBase.TestBase;
import com.cucumberFramework.verification.beans.LeadsData;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public class LeadsPageStepDefinitions extends TestBase {

	LeadsCreationPage leadsPage = new LeadsCreationPage(driver);
	LeadsVerificationPage leadsVerificationPage = new LeadsVerificationPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	Logger log = LoggerHelper.getLogger(LeadsPageStepDefinitions.class);

	@When("^I click on leads plus button$")
	public void i_click_on_leads_plus_button() throws Throwable {
		leadsPage.clickOnCreateLeads();
	}

	@When("^I select First Name title as \"([^\"]*)\"$")
	public void i_select_First_Name_title_as(String arg1) throws Throwable {
		
		leadsPage.selectFirstNameType(arg1);
	}

	@When("^I enter First Name \"([^\"]*)\"$")
	public void i_enter_First_Name(String arg1) throws Throwable {
		LeadsData.setFirstName(arg1);
		leadsPage.enterFirstName(arg1);
	}

	@When("^I enter last name \"([^\"]*)\"$")
	public void i_enter_last_name(String arg1) throws Throwable {
		LeadsData.setLastName(arg1);
		leadsPage.enterLastName(arg1);
	}

	@When("^I enter Company name \"([^\"]*)\"$")
	public void i_enter_Company_name(String arg1) throws Throwable {
		LeadsData.setCompanyName(arg1);
		leadsPage.enterCompany(arg1);
	}

	@When("^I enter Title \"([^\"]*)\"$")
	public void i_enter_Title(String arg1) throws Throwable {
		leadsPage.enterTitle(arg1);
	}

	@When("^I select Lead Source \"([^\"]*)\"$")
	public void i_select_Lead_Source(String arg1) throws Throwable {
		leadsPage.selectLeadSource(arg1);
	}

	@When("^I select Industry \"([^\"]*)\"$")
	public void i_select_Industry(String arg1) throws Throwable {
		leadsPage.selectIndustry(arg1);
	}

	@When("^I enter Annual Revenue \"([^\"]*)\"$")
	public void i_enter_Annual_Revenue(String arg1) throws Throwable {
		leadsPage.enterAnnualrevenue(arg1);
	}

	@When("^I enter No Of Employees \"([^\"]*)\"$")
	public void i_enter_No_Of_Employees(String arg1) throws Throwable {
		leadsPage.enterNoofemployees(arg1);
	}

	@When("^I enter Secondary Email \"([^\"]*)\"$")
	public void i_enter_Secondary_Email(String arg1) throws Throwable {
		leadsPage.enterSecondaryEmail(arg1);
	}

	@When("^I enter Street \"([^\"]*)\"$")
	public void i_enter_Street(String arg1) throws Throwable {
		LeadsData.setStreetAdress(arg1);
		leadsPage.enterStreet(arg1);
	}

	@When("^I enter Postal Code \"([^\"]*)\"$")
	public void i_enter_Postal_Code(String arg1) throws Throwable {
		leadsPage.enterPostalCode(arg1);
	}

	@When("^I enter Country \"([^\"]*)\"$")
	public void i_enter_Country(String arg1) throws Throwable {
		leadsPage.enterCountry(arg1);
	}

	@When("^I enter Description \"([^\"]*)\"$")
	public void i_enter_Description(String arg1) throws Throwable {
		leadsPage.enterDescription(arg1);
	}

	@When("^I enter Phone \"([^\"]*)\"$")
	public void i_enter_Phone(String arg1) throws Throwable {
		leadsPage.enterPhone(arg1);
	}

	@When("^I enter Mobile \"([^\"]*)\"$")
	public void i_enter_Mobile(String arg1) throws Throwable {
		leadsPage.enterMobile(arg1);
	}

	@When("^I enter Fax \"([^\"]*)\"$")
	public void i_enter_Fax(String arg1) throws Throwable {
		leadsPage.enterFax(arg1);
	}

	@When("^I enter Email \"([^\"]*)\"$")
	public void i_enter_Email(String arg1) throws Throwable {
		LeadsData.setEmail(arg1);
		leadsPage.enterEmail(arg1);
	}

	@When("^I enetr Website \"([^\"]*)\"$")
	public void i_enetr_Website(String arg1) throws Throwable {
		leadsPage.enterWebsite(arg1);
	}

	@When("^I select Lead Status \"([^\"]*)\"$")
	public void i_select_Lead_Status(String arg1) throws Throwable {
		leadsPage.selectLeadStatus(arg1);
	}

	@When("^I select Assigned To \"([^\"]*)\"$")
	public void i_select_Assigned_To(String arg1) throws Throwable {
		leadsPage.selectAssignedTo(arg1);
	}

	@When("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		leadsPage.clickSave();
	}

	@Then("^I should see lead creation success message$")
	public void i_should_see_lead_creation_success_message() throws Throwable {
		log.info(LeadsData.getFirstName());
		log.info(LeadsData.getLastName());
		if (leadsVerificationPage.getLeadsCreationHeadersMsg().getText().contains(LeadsData.getFirstName())
				&& leadsVerificationPage.getLeadsCreationHeadersMsg().getText().contains(LeadsData.getLastName())) {
		} else {
			Assert.assertTrue(false, "leads creation message is invalid " + leadsVerificationPage.getLeadsCreationHeadersMsg().getText());
		}
	}

	@Then("^I should verify leads information$")
	public void i_should_verify_leads_information() throws Throwable {
		Assert.assertTrue(leadsVerificationPage.getFirstName().getText().contains(LeadsData.getFirstName()));
		Assert.assertEquals(leadsVerificationPage.getLastName().getText(), LeadsData.getLastName());
		Assert.assertEquals(leadsVerificationPage.getStreetAddress(), LeadsData.getStreetAdress());
		Assert.assertEquals(leadsVerificationPage.getEmail(), LeadsData.getEmail());
	}

}
