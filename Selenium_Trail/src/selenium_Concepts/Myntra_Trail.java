package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Trail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	driver.manage().window().maximize();
	
	List<WebElement> totalProducts = driver.findElements(By.xpath("//div[@class='product-price']"));
System.out.println("Total Products = "+ totalProducts.size());
}
}
