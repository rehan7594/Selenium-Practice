package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_ActiTimeLink {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\ActiTime");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("usern")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("rehan");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("rehan123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		Thread.sleep(2000); 
	} 

}