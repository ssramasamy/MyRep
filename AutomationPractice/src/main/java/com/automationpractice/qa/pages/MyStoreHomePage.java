package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automationpractice.qa.base.TestBase;

public class MyStoreHomePage extends TestBase {

	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement logo;

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactus;

	@FindBy(xpath = "//a[@class='login']")
	WebElement SignIn;

	public MyStoreHomePage() {

		PageFactory.initElements(driver, this);
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogo() {
		return logo.isDisplayed();

	}

	public void clickOnContactUs() {
		contactus.click();
	}

	public void clickOnSignIn() {
		SignIn.click();
	}
}
