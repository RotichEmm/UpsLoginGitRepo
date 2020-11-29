package emmilyUpsLoginGitPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmmilyUpsLoginGit {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver chromeDriver = new ChromeDriver(); 
			System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
			chromeDriver.get("https://wwwapps.ups.com/doapp/signup");	
			chromeDriver.manage().window().maximize();		
			chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
			WebElement Username = chromeDriver.findElement(By.name("fullName"));Username.sendKeys("Nancy  Smith");
			Thread.sleep(2000);
			WebElement email = chromeDriver.findElement(By.name("email_input"));email.sendKeys("NSmith@gmail.com");
			Thread.sleep(2000);
			WebElement userID = chromeDriver.findElement(By.name("user_id_input"));userID.sendKeys("smithnmithN2000"); 
			Thread.sleep(2000);
			WebElement password = chromeDriver.findElement(By.name("password_input"));password.sendKeys("Password@1234567912"); 
			Thread.sleep(2000);
			WebElement phoneInput = chromeDriver.findElement(By.name("phoneInput"));phoneInput.sendKeys("9146000022");
			Thread.sleep(2000); 
			chromeDriver.findElement(By.xpath("//*[@id='ups-checkbox_group']")).click();
			Thread.sleep(2000);
			 chromeDriver.findElement(By.xpath("//*[@id='SignUpButton']/div/fullpage-doa")).click();
			 Thread.sleep(2000);
			 chromeDriver.close(); 
			 
		}
		
}



		
			
			

		
		

	


