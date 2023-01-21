package com.java.project.Flipkart_Project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_TestScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.flipkart.com/");
		b.manage().window().maximize();
		String title = b.getTitle();
		System.out.println(title);

		String s = "Mobiles";

		if (title.contains(s)) {
			System.out.println("Landed in the right page");
		} else {
			System.out.println("Wrong page");
//			b.quit();
		}
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		b.findElement(By.name("q")).click();
		b.findElement(By.name("q")).sendKeys("i phone");
		b.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		b.switchTo().window(s).getWindowHandles();
		Thread.sleep(5000);
		b.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
//		List<String> windowHandles = new ArrayList<>();
//		for (String stringnew : windowHandles) {
//			
//		}
//		
//		b.switchTo().window(windowHandles.get(0));
		
		b.findElement(By.xpath("//ul[@class=\"row\"]//li//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		
}
}

