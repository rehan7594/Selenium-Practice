package cqa_Demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Browser_Launching_Basedon_User_Input {
	@Test
	public void launching_Multiple_Browser() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String Browser = scanner.nextLine();
		System.out.println("user has enter browser name..."+Browser);
		WebDriver driver = null;
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver1.manage().window().maximize();
			Thread.sleep(2000);
			driver1.findElement(By.name("email")).sendKeys("rehansdm94@gmail.com");
			Thread.sleep(2000);

			driver1.findElement(By.id("pass")).sendKeys("rehandimple");
			Thread.sleep(2000);
			driver1.findElement(By.name("login")).click();
			Thread.sleep(2000);

		}
		else
			if(Browser.equals("Firefox")) {

				System.setProperty("webdriver.gecko.driver","C:\\Users\\PC\\OneDrive\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				driver1.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver1.manage().window().maximize();
				Thread.sleep(2000);
				driver1.findElement(By.name("email")).sendKeys("rehansdm94@gmail.com");
				Thread.sleep(2000);

				driver1.findElement(By.id("pass")).sendKeys("rehandimple");
				Thread.sleep(2000);
				driver1.findElement(By.name("login")).click();
				Thread.sleep(2000);
			}
			else if(Browser.equals("Edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\PC\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				WebDriver driver1 = new EdgeDriver();
				driver1.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver1.manage().window().maximize();
				Thread.sleep(2000);
				driver1.findElement(By.name("email")).sendKeys("rehansdm94@gmail.com");
				Thread.sleep(2000);

				driver1.findElement(By.id("pass")).sendKeys("rehandimple");
				Thread.sleep(2000);
				driver1.findElement(By.name("login")).click();
				Thread.sleep(2000);
			}
			else if(Browser.equals("IE")) {
				System.setProperty("webdriver.ie.driver","C:\\Users\\PC\\OneDrive\\Desktop\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
				WebDriver driver1 = new InternetExplorerDriver();
				driver1.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver1.manage().window().maximize();
				Thread.sleep(2000);
				driver1.findElement(By.name("email")).sendKeys("rehan@gmail,com");
				Thread.sleep(2000);

				driver1.findElement(By.id("pass")).sendKeys("rehan@7594");
				Thread.sleep(2000);
				driver1.findElement(By.name("login")).click();
				Thread.sleep(2000);

			}
			else if(Browser.equals("Opera")) {
				System.setProperty("webdriver.opera.driver","C:\\Users\\PC\\Downloads\\operadriver_win64\\operadriver.exe");
				WebDriver driver1 = new InternetExplorerDriver();
				driver1.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver1.manage().window().maximize();
				Thread.sleep(2000);
				driver1.findElement(By.name("email")).sendKeys("rehansdm94@gmail.com");
				Thread.sleep(2000);

				driver1.findElement(By.id("pass")).sendKeys("rehandimple");
				Thread.sleep(2000);
				driver1.findElement(By.name("login")).click();
				Thread.sleep(2000);

			}

			else {
				System.out.println("Invalid Browser");
			}
		Thread.sleep(4000);
	}
}