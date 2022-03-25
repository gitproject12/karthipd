package com.karthipd;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;

public class facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement userid =driver.findElement(By.id("email"));
		userid.sendKeys("johnrenish");
		WebElement pass =driver.findElement(By.id("pass"));
		pass.sendKeys("98888855");
		Actions as =new Actions(driver);
		WebElement forgetpass =driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		as.moveToElement(forgetpass).perform();
		String t =forgetpass.getText();
		System.out.println(t);
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//button[text()='Log In']"));
		button.click();
		Thread.sleep(5000);
		WebElement game = driver.findElement(By.xpath("//a[text()='Help']"));
		JavascriptExecutor jk =(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", game);
		
		TakesScreenshot th =((TakesScreenshot)driver);
		File Sr =th.getScreenshotAs(OutputType.FILE);
		File Srs=new File("C:\\Users\\Admin\\eclipse-workspace\\karthipd\\screenshort\\fb.png");
		FileUtils.copyFile(Sr, Srs);
	
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
