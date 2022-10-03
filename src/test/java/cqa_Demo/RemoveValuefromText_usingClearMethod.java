package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RemoveValuefromText_usingClearMethod {
	@Test
public void clearMethod() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("akshay@gmai.com");
	Thread.sleep(2000);
	String value = driver.findElement(By.id("email")).getAttribute("value");
	System.out.println("Value present inside the text box is : "+value);
	driver.findElement(By.id("email")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("rehansdm94@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); 
	//this line will actually delete the value if there is no space in the text entered
	// if there is a space between two words in the username field, we have to use the below lines of code
	driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a") ;
	driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	}
}