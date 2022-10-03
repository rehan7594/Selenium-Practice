package cqa_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFB_Usernamefield_lessthanMobileNumberField {
	public void mobileNumber() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
