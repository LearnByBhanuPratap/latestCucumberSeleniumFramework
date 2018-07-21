package com.cucumberFramework.testBase;

import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.LoginPage;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public interface AllObjects {

	static LoginPage loginPage = new LoginPage(TestBase.driver);
	static HomePage homePage = new HomePage(TestBase.driver);
}
