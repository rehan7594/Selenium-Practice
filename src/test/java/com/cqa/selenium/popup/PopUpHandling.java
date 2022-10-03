package com.cqa.selenium.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpHandling {
	@Test
	public void autoit() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.freeconvert.com/txt-to-pdf");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"upload-file-button\"]/span")).click();
	    Thread.sleep(4000);
	    
	    Runtime.getRuntime().exec("E:\\FileUploadScript123.exe");
	    
	    Thread.sleep(4000);
	    //driver.close();
	}
}