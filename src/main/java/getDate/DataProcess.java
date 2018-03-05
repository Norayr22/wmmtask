package getDate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataProcess {
	
	WebDriver driver;
	@FindBy(name = Constants.USERNAME)
	private WebElement username;
	@FindBy(name = Constants.PASSWORD)
	private WebElement password;
	@FindBy(className = Constants.LOGIN) 
	private WebElement login;
	@FindBy(xpath = Constants.TASK_NUMBER)
	private WebElement task_number;
	@FindBy(xpath = Constants.TASKS)
	private List<WebElement> tasks;
	@FindBy(xpath = Constants.DATA)
	private WebElement data;
	@FindBy(xpath = Constants.WALL)
	private WebElement wall;
	@FindBy(xpath = Constants.TASK)
	private WebElement task;
	@FindBy(xpath = Constants.ERROR)
	private WebElement error;
	@FindBy(xpath = Constants.FIND)
	private WebElement find;
	@FindBy(xpath = Constants.PAGEINATION)
	private List<WebElement> pagination;

	public  DataProcess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void registerNewUser() throws InterruptedException {
		username.sendKeys("digitain");
		password.sendKeys("digitain");
		login.click();
		Thread.sleep(2000);
		task.click();
		Thread.sleep(2000);
		find.click();
		for(int p = 0; p<= pagination.size()/2; p++) {
			if(p>0) {
	   		pagination.get(p).click();}
		for(int i = 0; i <= tasks.size()-1; i++) {
		tasks.get(i).click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
	   	driver.switchTo().window(tab.get(1));
	   	
	   	try   
	    {    
	   		if(error.isDisplayed()) {        
	    	  driver.close();
	    	  driver.switchTo().window(tab.get(0));
	      }    
	   		}  
	    catch(Exception e)     
	    {       
	    	wall.click();
	    	System.out.println(task_number.getText());
		   	driver.close();   
	         
	   	
	   	driver.switchTo().window(tab.get(0));
	   	ArrayList<String> tab1 = new ArrayList<String> (driver.getWindowHandles());
	   	driver.switchTo().window(tab1.get(1)); 
	   	System.out.println(data.getText());
	   	driver.close();
	   	driver.switchTo().window(tab1.get(0));
	   	}
	   	}
	   	
		Thread.sleep(2000);}
		
	   	driver.quit();
		
	   	  
		};
		
	}





