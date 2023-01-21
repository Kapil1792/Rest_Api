package class_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Hrm {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		b.manage().window().maximize();
     b.findElements("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()='Admin']");
		
//		xpath: admin;
//		//span[@class="oxd-text oxd-text--span oxd-main-menu-item--name" and text()='Admin'];
//		
//		xpath: password;
//		p[@class='oxd-text oxd-text--p' and text()='Password : admin123']
//				
//				xpath: Login button;
//		button[@type='submit']
//			
//				next page:
//					xpath: click admin
//					span[@class="oxd-text oxd-text--span oxd-main-menu-item--name" and text()='Admin']
     
     
}
}