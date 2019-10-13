package com.herokuapp.qa.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.qa.base.TestBase;

public class HerokuAppHomePage extends TestBase {

	/*@FindBy(xpath = "//h3[contains(text(),'DOM')]")
	WebElement pageHeader;

	@FindBy(xpath = "//a[@class='button']")
	WebElement buttonone;

	@FindBy(xpath = "//a[@class='button alert']")
	WebElement buttontwo;

	@FindBy(xpath = "//a[@class='button success']")
	WebElement buttonthree;

	@FindBy(xpath = "//div[@class='large-2 columns']")
	WebElement buttons;

	@FindBy(xpath = "//div[@class='large-10 columns']")
	WebElement table;

	@FindBy(xpath = "//canvas[@id='F']")
	WebElement result;

	@FindBy(xpath = "//canvas[@id='canvas']")
	WebElement Result;*/

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public String verifyPageHeader() {

		WebElement pageHeader = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'DOM')]")));
		return pageHeader.getText();

	}

	public boolean verifyButtonVisible() {

		WebElement buttons = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='large-2 columns']")));

		return buttons.isDisplayed();

	}

	public String verifyButton1Color() {

		WebElement buttonone = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));

		String buttoncolor = buttonone.getCssValue("background-color");
		return Color.fromString(buttoncolor).asHex();

	}

	public String verifyButton2Color() {

		WebElement buttontwo = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button alert']")));

		String buttoncolor = buttontwo.getCssValue("background-color");
		return Color.fromString(buttoncolor).asHex();

	}

	public String verifyButton3Color() {

		WebElement buttonthree = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button success']")));

		String buttoncolor = buttonthree.getCssValue("background-color");
		return Color.fromString(buttoncolor).asHex();
	}

	public void clickButtonOne() {

		WebElement buttonone = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));

		buttonone.click();
	}
	
	public void clickButtonTwo() {

		WebElement buttontwo = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button alert']")));

		buttontwo.click();
	}

	public void clickButtonThree() {

		WebElement buttonthree = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button success']")));

		buttonthree.click();
	}
	public boolean verifyTableHeaderValues() {

		List<WebElement> headers = driver.findElements(By.tagName("th"));
		return  headers.containsAll(headers);
		
			}

	public boolean verifyResult() {

		WebElement Result = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//canvas[@id='canvas']")));

		return Result.isDisplayed();

	}
	
	public boolean verifyRowsAndColumns(){
		
		
		List<WebElement> totalvalues = driver.findElements(By.tagName("td"));
		return totalvalues.containsAll(totalvalues);
	}
	
	

}
