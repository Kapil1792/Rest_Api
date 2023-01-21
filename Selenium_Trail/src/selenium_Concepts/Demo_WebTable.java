package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebTable {

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Selenium_Trail\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();	}
}
