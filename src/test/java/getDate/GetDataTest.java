package getDate;

import org.testng.annotations.Test;




public class GetDataTest extends Webdriver{
	 
		
		@Test()
		public void startRegisterTest() throws InterruptedException {
			DataProcess register = new DataProcess(driver);
			register.registerNewUser();
			
			

}
		}
