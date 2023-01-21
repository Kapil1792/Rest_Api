package com.java.project.Facebook_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_TestScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.facebook.com/");
		b.manage().window().maximize();
		String title = b.getTitle();
		System.out.println(title);

		String s = "Facebook";

		if (title.contains(s)) {
			System.out.println("Landed in the right page");
		} else {
			System.out.println("Wrong page");
			b.quit();
		}
		WebElement email = b.findElement(By.id("email"));
		email.sendKeys("Kapil");
		Thread.sleep(2000);

		WebElement password = b.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("1792");
		Thread.sleep(1000);

		b.findElement(By.name("login")).click();
		Thread.sleep(4000);
		//Screenshot missing 
		TakesScreenshot ts = (TakesScreenshot) b;
		//File 
		
//		
		
		b.navigate().back();
		Thread.sleep(1000);
		b.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(4000);
		b.findElement(By.name("firstname")).sendKeys("Kapil");
		b.findElement(By.name("lastname")).sendKeys("Kap");
		b.findElement(By.name("reg_email__")).sendKeys("kap78@gmail.com");
		b.findElement(By.name("reg_passwd__")).sendKeys("7895");
		Thread.sleep(1000);
		b.findElement(By.name("birthday_day")).sendKeys("10");
		b.findElement(By.name("birthday_month")).sendKeys("mar");
		b.findElement(By.name("birthday_year")).sendKeys("1992");
		b.findElement(By.xpath("//label[text()='Male']")).click();
		b.findElement(By.name("reg_email_confirmation__")).sendKeys("kap78@gmail.com");
		Thread.sleep(1000);
		b.findElement(By.name("websubmit")).click();
		Thread.sleep(6000);
		b.findElement(By.xpath("//img[@width='24']")).click();
		//Take Screenshot
//		b.navigate().back();
		String title2 = b.getTitle();
		System.out.println(title2);
		if(title==title2) {
			System.out.println("Verified: Both are same");
		} else {
			System.out.println("Not Verified");
		}
		Thread.sleep(5000);
		b.quit();
	}
}

