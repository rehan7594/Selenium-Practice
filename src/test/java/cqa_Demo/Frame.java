package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test
	public void frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\frame\\page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("rehan");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
	@Test
	public void frames_usingIndex() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\frame\\page2.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("t2")).sendKeys("Rehan");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	@Test
	public void frames_usingId () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\frame\\page2.html");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("Pooja");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Anisha");
	}
	@Test
	public void frames_usingName () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\frame\\page2.html");
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("Raj");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Rani");
	}
	@Test
	public void frames_usingAddressFrame () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\\\OneDrive\\Desktop\\frame\\page2.html");
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("Akshay");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Kumar");
		//driver.close();
	}
	@Test
	public void frames_ThreeTextField() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\PC\\OneDrive\\Desktop\\frame\\page2.html");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("rehan");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("weds");
		driver.findElement(By.id("t3")).sendKeys("dimple");

	}
}