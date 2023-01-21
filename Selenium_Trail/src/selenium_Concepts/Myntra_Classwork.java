package selenium_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Classwork {
	public static WebDriver driver;
	
@org.testng.annotations.Test

public void browserLaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium_Trail\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	driver.manage().window().maximize();
	
}
@org.testng.annotations.Test
public static void main(String[] args) {
	
	List<WebElement> findelements = driver.findElements(By.xpath("//li[@class='product-base']"));
	int size= findelements.size();
	System.out.println("No of Products");
	System.out.println(size);

	for(WebElement webElement: findelements) {
		System.out.println(webElement.getText());
		
	}
}

}

//private void lowestPriceofAllProducts() {
//	List<Integer> priceList = new ArrayList<> ();
//	List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class=\'"
//			+ ""
//			+ "product-base\']//descendant::div[@class=\'product-productMetaInfo\']//descendant::span[@class=\'product-discountedPrice\'] "));
//	for (WebElement price : allPrices) {
//		String priceText = price.getText().replace("Rs. ", "");
//		int priceValue = Integer.parseInt(priceText);
//		priceList.add(priceValue);
//	}
//	Integer min_Price = Collections.min(priceList);
//	System.out.println(min_Price);
//	}
//
//int count=0;
//try {
//	List<WebElement> minimumpriceall = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[(@class='product-discountedprice' and text()='"+minPrice+"') or (text()='"+minPrice+"' and not (@class))]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
//    for (WebElement minimumprice : minimumpriceall) {
//    	String productName = minimumprice.getText();
//    	System.out.println("product name of minimum price:"+productName);
//    	count++;
//	}
//	
//	System.out.println("Totally "+count+" products are in minimum price: "+minPrice);
//} catch (Exception e) {
//	e.printStackTrace();
//}
//}
//}
