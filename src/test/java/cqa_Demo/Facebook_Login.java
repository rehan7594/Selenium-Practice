package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Login {
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rehansdm94@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rehandimple");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	   
	}
}