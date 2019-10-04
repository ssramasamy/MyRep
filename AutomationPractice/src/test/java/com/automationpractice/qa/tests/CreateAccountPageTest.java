package com.automationpractice.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.CreateAccountPage;
import com.automationpractice.qa.pages.MyStoreHomePage;

public class CreateAccountPageTest extends TestBase {
	public MyStoreHomePage mpage;
	public CreateAccountPage capage;

	public CreateAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialisation();
		mpage = new MyStoreHomePage();
		capage = new CreateAccountPage();
	}

	@Test(priority = 1)

	public void CreateAccountPageTitleTest() {

		mpage.clickOnSignIn();
		String CreatePageTitle = capage.validateCreatePageTitle();
		Assert.assertEquals(CreatePageTitle, "Login - My Store", "Page Title is not displayed");
	}

	@Test(priority = 2)

	public void createAccountTest() {

		mpage.clickOnSignIn();
		capage.enterEmailAddress();
		capage.clickOnCreate();
		String successmessage = capage.verifySuccessMessage();
		Assert.assertEquals(successmessage, "Account Successfully Created",
				"Account is not created - " + successmessage);

	}

	@AfterMethod()

	public void tearDown() {
		driver.quit();
	}
}
