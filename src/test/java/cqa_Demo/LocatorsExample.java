package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsExample {
	@Test
	public void locate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //write the url of web application 
		  //driver.get("https://www.facebook.com/");
		 // driver.manage().window().maximize();
		 
		 driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\ActiTime");
		 
	WebElement	user = driver.findElement(By.id("username"));
	user.clear();
	Thread.sleep(4000);	
	user.sendKeys("admin");
		 driver.findElement(By.id("username")).clear();
		 
	}
}
