package getDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import getDate.Constants;


	public class Webdriver {
		WebDriver driver;
		@BeforeMethod
		public void setup() throws InterruptedException{
		
			System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("disable-infobars");
			 driver = new ChromeDriver(options);
			 driver.manage().window().maximize();
			 driver.get(Constants.URL);
			 Thread.sleep(3000);
			
		}
//		 @AfterMethod()
//		  public void close(){
//			  driver.quit();
//		  }

	}


