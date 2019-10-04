package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automationpractice.qa.base.TestBase;

public class CreateAccountPage extends TestBase {

	@FindBy(id = "email_create")
	WebElement CreateEmail;

	@FindBy(id = "SubmitCreate")
	WebElement CreateButton;

	@FindBy(xpath = "//li[contains(text(),'An account using this email address has already be')]")
	WebElement successmessage;

	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateCreatePageTitle() {
		return driver.getTitle();
	}

	public void enterEmailAddress() {

		CreateEmail.sendKeys("test@test.com");
	}

	public void clickOnCreate() {
		CreateButton.click();

	}

	public String verifySuccessMessage() {
		return successmessage.getText();

	}

}
