package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automationpractice.qa.base.TestBase;

public class ContactUsPage extends TestBase{
	
	@FindBy (xpath= "//h3[@class='page-subheading']")
	WebElement messageheader;
	
	@FindBy(name = "id_contact")
	WebElement subjectheading;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "id_order")
	WebElement orderref;
	
	@FindBy(id = "fileUpload")
	WebElement uploadfile;
	
	@FindBy(id = "message")
	WebElement message;
	
	@FindBy(name = "submitMessage")
	WebElement sendbutton;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	WebElement successmessage;
	
		
	public ContactUsPage(){
		PageFactory.initElements(driver, this);
	}
	public void verifyContactUsPageTitle(){
		String Contactuspagetitle = driver.getTitle();
		Assert.assertEquals(Contactuspagetitle, "Contact us - My Store", "ContactUs Page is not displayed");
	}
	public void selectSubjectHeading(){
		subjectheading.click();
		Select select = new Select(subjectheading);
		select.selectByVisibleText("Customer service");
	}
	public void enterEmailAddress(){
		email.sendKeys("test@test.com");
	}
	public void enterOrderReference(){
		orderref.sendKeys("or1234");
	}
	public void enterMessage(){
		message.sendKeys("Please find attached file");
	}
	public void clickOnChooseFile(){
		uploadfile.sendKeys("C:\\Users\\User\\Desktop\\TestUpload.txt");
	}
	public void clickonSendbutton(){
		sendbutton.click();
	}
	public String verifySuccessMessage(){
		return successmessage.getText();
		
		
	}
}
