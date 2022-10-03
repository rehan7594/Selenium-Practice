package cqa_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingTitle {
	@Test
	public void homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("rehansdm94@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("rehandimple");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String expectedTitle = "Enter Time";
		String actualTitle = driver.getTitle();
		//If actual title contains "Enter Time" text then home page is displayed.
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else{
			System.out.println("Home page is NOT displayed");

		}

	}
}