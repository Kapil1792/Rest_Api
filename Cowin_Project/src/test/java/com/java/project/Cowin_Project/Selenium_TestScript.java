package com.java.project.Cowin_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_TestScript {

	public static class Cowin_TestNG {
		WebDriver driver = null;

		private static ChromeOptions desiredOptions() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			return options;

		}

		@BeforeTest
		private void browserLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(desiredOptions());
		}

		@BeforeClass
		private void launchURL_Snap() throws InterruptedException {
			driver.get("https://www.cowin.gov.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement Scroll_Down = driver.findElement(By.xpath("(//img[@class='img-fluid'])[3]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", Scroll_Down);
			Thread.sleep(3000);

		}

		@Test(priority = 1)
		private void Search() throws InterruptedException {
			driver.findElement(By.xpath("//mat-select[@formcontrolname='state_id']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='mat-option-text'])[32]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("mat-select-value-7")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()=' Chennai ']")).click();
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			Thread.sleep(3000);
		}

		@Test(priority = 2)
		private void Select_Options() throws InterruptedException {
			WebElement Age = driver.findElement(By.xpath("//label[text()='18+']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", Age);
			Thread.sleep(3000);
			WebElement Dose_Count = driver.findElement(By.xpath("//label[text()='Dose 2']"));
			js.executeScript("arguments[0].click();", Dose_Count);
			WebElement Paid_Free = driver.findElement(By.xpath("//label[text()='Paid']"));
			js.executeScript("arguments[0].click();", Paid_Free);
			WebElement Vaccine_Name = driver.findElement(By.xpath("//label[text()='Covishield']"));
			js.executeScript("arguments[0].click();", Vaccine_Name);
			js.executeScript("arguments[0].scrollIntoView(true);", Vaccine_Name);
			Thread.sleep(3000);
		}

		@Test(priority = 3)
		private void Take_Snap() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Siva\\eclipse-workspace\\Maven\\screenshot\\fb3.jpg");
			FileHandler.copy(source, destination);

		}
        @AfterTest
		private void Closebrowser() {
			driver.close();
		}
	}
}

