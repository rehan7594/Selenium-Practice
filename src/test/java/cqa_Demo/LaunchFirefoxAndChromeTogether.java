package cqa_Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchFirefoxAndChromeTogether {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PC\\OneDrive\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		}
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void loginFFandCHROME(String browser) throws InterruptedException, IOException{
		//Reporter.log(browser, true);
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		FileInputStream configPath = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\CQA_105_106_Selenium\\src\\test\\java\\com\\cqa\\selenium\\popup\\config.properties");
		Properties prop = new Properties();
		prop.load(configPath);
		String url = prop.getProperty("URL");
		driver.get(url);
		WebElement un = driver.findElement(By.id("username"));
		for (int i = 0; i < 10; i++) {
			un.sendKeys("admin" + i);
			Thread.sleep(2000);
			un.clear();
		}
		driver.close();
	}
}
