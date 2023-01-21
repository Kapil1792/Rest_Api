package selenium_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MyntraTask_Demo {
	public static WebDriver driver;
//no of products	
	
	@Test
	public void noOfproducts() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		List<WebElement> noOfProducts = driver.findElements(By.xpath("//li[@class=\"product-base\"]"));
		 
			System.out.println("No of Products: "+noOfProducts.size());}

//			For getting the product information
//			for (WebElement webElement : noOfProducts) {
//				System.out.println(webElement.getText());}
//		
		@Test	
			public static void lowestPriceofAllProducts() {
				List<Integer> priceList = new ArrayList<> ();
				List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-productMetaInfo']//descendant::span[@class='product-discountedPrice']"));
				for (WebElement price : allPrices) {
					String priceText = price.getText().replace("Rs. ","");
					int priceValue = Integer.parseInt(priceText);
					priceList.add(priceValue);
				}
				Integer min_Price = Collections.min(priceList);
				System.out.println(min_Price);
	}
	 
}