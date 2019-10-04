package com.automationpractice.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.ContactUsPage;
import com.automationpractice.qa.pages.MyStoreHomePage;

public class ContactUsPageTest extends TestBase {

	public MyStoreHomePage mpage;
	public ContactUsPage cpage;

	public ContactUsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialisation();
		mpage = new MyStoreHomePage();
		cpage = new ContactUsPage();
	}

	@Test

	public void sendMessageTest() {
		mpage.clickOnContactUs();
		cpage.selectSubjectHeading();
		cpage.enterEmailAddress();
		cpage.enterOrderReference();
		cpage.enterMessage();
		cpage.clickOnChooseFile();
		cpage.clickonSendbutton();
		String success = cpage.verifySuccessMessage();
		Assert.assertEquals(success, "Your message has been successfully sent to our team.", "Email is not sent");
	}

	@AfterMethod()

	public void tearDown() {
		driver.quit();
	}

}
