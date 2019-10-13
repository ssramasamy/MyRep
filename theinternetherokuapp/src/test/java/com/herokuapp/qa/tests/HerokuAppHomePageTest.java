package com.herokuapp.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.herokuapp.qa.base.TestBase;
import com.herokuapp.qa.pages.HerokuAppHomePage;

public class HerokuAppHomePageTest extends TestBase {

	public HerokuAppHomePage homepage;

	public HerokuAppHomePageTest() {
		super();
	}

	@BeforeMethod()

	public void setUp() {
		initialisation();
		homepage = new HerokuAppHomePage();
	}

	@Test(priority = 1)

	public void HerokuAppHomePageTitleTest()

	{
		String PageTitle = homepage.validatePageTitle();
		Assert.assertEquals(PageTitle, "The Internet");

	}

	@Test(priority = 2)

	public void HerokuAppHomePageHeaderTest()

	{
		String PageHeader = homepage.verifyPageHeader();
		Assert.assertEquals(PageHeader, "Challenging DOM", "Page Header is not displayed");

	}

	@Test(priority = 3)

	public void verifyButtonVisibleTest() {

		boolean flag = homepage.verifyButtonVisible();
		Assert.assertTrue(flag, "Buttons are not displayed");

	}

	@Test(priority = 4)

	public void verifyTableHeaderValuesTest() {

		boolean colunms = homepage.verifyTableHeaderValues();
		Assert.assertTrue(colunms, "Column values are not displayed");

	}

	@Test(priority = 5)

	public void verifyButton1ColorTest() {
		String buttononecolor1 = homepage.verifyButton1Color();
		Assert.assertEquals(buttononecolor1, "#2ba6cb", "Button color is not displayed");

		String buttononecolor2 = homepage.verifyButton2Color();
		Assert.assertEquals(buttononecolor2, "#c60f13", "Button color is not displayed");

		String buttononecolor3 = homepage.verifyButton3Color();
		Assert.assertEquals(buttononecolor3, "#5da423", "Button color is not displayed");
	}

	@Test(priority = 6)

	public void clickButtonOneTest() {

		homepage.clickButtonOne();

	}

	@Test(priority = 7)

	public void clickButtonTwoTest() {

		homepage.clickButtonTwo();
	}

	@Test(priority = 8)

	public void clickButtonThreeTest() {

		homepage.clickButtonThree();
	}

	@Test(priority = 9)

	public void verifyResultTest() {

		boolean ans = homepage.verifyResult();
		Assert.assertEquals(ans, true);
	}

	@Test(priority = 10)
	public void verifyRowsAndColumns() {
		boolean total = homepage.verifyRowsAndColumns();
		Assert.assertEquals(total, true);

	}

	@AfterMethod()

	public void tearDown() {
		driver.quit();
	}

}
