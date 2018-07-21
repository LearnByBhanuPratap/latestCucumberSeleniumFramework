package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Contacts {

	private WebDriver driver;
	
	
	public Contacts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
