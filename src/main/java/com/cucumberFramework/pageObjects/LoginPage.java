package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='form']/div/div[2]/input")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id='form']/div/div[4]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='submitButton']")
	WebElement loginButton;
	
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}

}
