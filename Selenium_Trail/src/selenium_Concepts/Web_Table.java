package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Table {

		@Test
		public static void browserLaunch() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/coronavirus/");
			driver.manage().window().maximize();
			
			List<WebElement> Covid = driver.findElements(By.xpath("//table/tbody/tr[15]/td[2]"));
			
			for (WebElement webElement : Covid) {
				System.out.println(webElement.getText());
			}
	}
		
}
