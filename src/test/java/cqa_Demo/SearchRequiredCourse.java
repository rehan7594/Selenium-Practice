package cqa_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchRequiredCourse {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String expectedUrl = "https://www.udemy.com/";
		String actualUrl = driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Udemy site is opened");
		}
		else {
			System.out.println("Recheck the url..!!");
		}
	}

	//  Without sign up and login search java courses from the application
	@Test
	public void search_JavaCourses_WithoutLoginAndSignup() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("java");

		String xp = "//button[@type='submit']//*[name()='svg']";
		driver.findElement(By.xpath(xp)).click();
	}


	//  Search JAVA courses after logging in
	@Test
	public void search_JavaCourses_ByLoggingIn() throws InterruptedException {

		//  LOGIN.
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();

		driver.findElement(By.id("id_email")).sendKeys("anjuchandran86069@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Anju162@123");
		driver.findElement(By.id("submit-id-submit")).click();

		// SERACH FOR JAVA
		driver.findElement(By.xpath("//input[@id='u93-search-form-autocomplete--3']")).sendKeys("java");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}
}
