package selenium_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Demo {
	
	public static WebDriver driver;	
		
@Test
		public static void browserLaunch() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
			driver.manage().window().maximize();
			
		}
@Test
		public static void numberofproducts() {

			List<WebElement> findelements = driver.findElements(By.xpath("//li[@class='product-base']"));
			int size = findelements.size();
			System.out.print("No of total products:");
			System.out.println(size);
			
			for (WebElement webElement : findelements) {
				System.out.println(webElement.getText());
			}	
		}

@Test
public static void minimumPriceofProduct() {
	List<Integer> pricelist = new ArrayList<>();
	List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[(@class='product-discountedPrice') or (text() and not (@class))]"));
	for (WebElement price : allPrices) {
			String pricetext = price.getText().replaceAll("Rs. ", "");
			int pricevalue = Integer.parseInt(pricetext);
			pricelist.add(pricevalue);
	
		}
      Integer minPrice = Collections.min(pricelist);
	System.out.println("Minimum price is:"+ minPrice);
	
}

@Test
private void minimumpriceProductName() {
    int count=0;
    int minprice =0;
    try {
		List<WebElement> minimumpriceall = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[(@class='product-discountedprice' and text()='"+minPrice+"') or (text()='"+minPrice+"' and not (@class))]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
	    for (WebElement minimumprice : minimumpriceall) {
	    	String productName = minimumprice.getText();
	    	System.out.println("product name of minimum price:"+productName);
	    	count++;
		}
		
		System.out.println("Totally "+count+" products are in minimum price: "+minPrice);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	}