package com.cucumberFramework.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.Constants;
import com.cucumberFramework.helper.LoggerHelper;
import com.cucumberFramework.helper.WaitHelper;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public class LeadsVerificationPage {

	WebDriver driver;
	private WaitHelper waitHelper;

	private static Logger log = LoggerHelper.getLogger(LeadsVerificationPage.class);
	
	@FindBy(xpath="//*[@id='mouseArea_First Name']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='mouseArea_Last Name']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='mouseArea_Company']")
	WebElement companyAddress;
	
	@FindBy(xpath="//*[@id='mouseArea_Street']")
	WebElement streetAddress;
	
	@FindBy(xpath="//*[@id='mouseArea_Email']")
	WebElement email;
	
	@FindBy(xpath="//td[@class='showPanelBg']/div/table/tbody/tr/td/span[1]")
	WebElement leadsCreationHeadersMsg;

	public LeadsVerificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public WebElement getFirstName() {
		waitHelper.WaitForElement(firstName, Constants.getExplicitwait());
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getCompanyAddress() {
		return companyAddress;
	}


	public WebElement getStreetAddress() {
		return streetAddress;
	}


	public WebElement getEmail() {
		return email;
	}

	public WebElement getLeadsCreationHeadersMsg() {
		waitHelper.WaitForElement(leadsCreationHeadersMsg, Constants.explicitWait);
		return leadsCreationHeadersMsg;
	}
	
}
