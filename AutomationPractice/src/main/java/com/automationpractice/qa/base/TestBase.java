package com.automationpractice.qa.base;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import com.automationpractice.qa.utils.TestUtil;

	public class TestBase {

		public static WebDriver driver;
		public static Properties prop;

		public TestBase() {

			try {
				prop = new Properties();
				FileInputStream fis = new FileInputStream(
						"C:/Selenium/AutomationSelenium/AutomationPractice/src/main/java/com/automationpractice/qa/config/config.properties");
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}

		public static void initialisation()
		{
				String browser =  prop.getProperty("browser");
				if(browser.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Selenium\\AutomationSelenium\\AutomationPractice\\DriversNew\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				
				else if((browser.equals("firefox")))
				{
					System.setProperty("webdriver.gecko.driver","C:\\Selenium\\AutomationSelenium\\AutomationPractice\\DriversNew\\GeckoDriver.exe");
					driver= new FirefoxDriver();
				}
				else if((browser.equals("InternetExplorer")))
				{				
					System.setProperty("webdriver.ie.driver","C:\\Selenium\\AutomationSelenium\\AutomationPractice\\DriversNew\\IEDriverServer.exe");
					driver= new InternetExplorerDriver();
				}
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
					driver.get(prop.getProperty("url"));
				}

	}



