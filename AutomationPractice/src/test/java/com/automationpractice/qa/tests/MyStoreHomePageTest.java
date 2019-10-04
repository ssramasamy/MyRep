package com.automationpractice.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.MyStoreHomePage;

public class MyStoreHomePageTest extends TestBase {

	public MyStoreHomePage mpage;

	public MyStoreHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialisation();
		mpage = new MyStoreHomePage();
	}

	@Test(priority = 1)

	public void MyStoreHomePageTitleTest() {
		String PageTitle = mpage.validatePageTitle();
		Assert.assertEquals(PageTitle, "My Store", "Page Title is not displayed");
	}

	@Test(priority = 2)
	public void verifyLogoTest() {
		boolean flag = mpage.verifyLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)

	public void clickOnContactUsTest() {
		mpage.clickOnContactUs();
	}

	@AfterMethod()

	public void tearDown() {
		driver.quit();
	}

}
