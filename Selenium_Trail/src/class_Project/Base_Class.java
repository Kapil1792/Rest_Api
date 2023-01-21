package class_Project;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_Class {
	public static WebDriver driver;
	
	
public static void input(WebElement element, String value) {
	element.sendKeys(value);
}

public static void click(WebElement element) {
	element.click();
}

public static void clear(WebElement element) {
	element.clear();
}

public static void sleep() throws InterruptedException {
	Thread.sleep(5000);
}

public static void getTuiuuuuext(WebElement element) {
	String text = element.getText();
	System.out.println(text);
}

public static void getAttribute(WebElement element, String value) {
	String attribute = element.getAttribute(value);
	System.out.println(attribute);
}
public static void isSelected(WebElement element) {
	boolean isSelected = element.isSelected();
	System.out.println(isSelected);

}

public static void isEnabled(WebElement element) {
	boolean isEnabled = element.isEnabled();
	System.out.println(isEnabled);

}

public static void isDisplayed(WebElement element) {
	boolean isDisplayed = element.isDisplayed();
	System.out.println(isDisplayed);
}

public void browserLaunch() {
	driver.get("URL");
}

public static void maximize() {
	driver.manage().window().maximize();
}

public static void close() {
	driver.close();
}

public static void quit() {
	driver.quit();
}

public static void fullscreen() {
	driver.manage().window().fullscreen();
}

public static void navigateTo(String url) {
	driver.navigate().to(url);
}

public static void navigateBack() {
	driver.navigate().back();
}

public static void navigateForward() {
	driver.navigate().forward();
}

public static void refresh() {
	driver.navigate().refresh();
}

public static String getTitle() {
	String title = driver.getTitle();	
	return title;
}

public static String currentUrl() {
	String currentUrl  = driver.getCurrentUrl();
	return currentUrl;
}

public static void launchUrl(String url) {
	driver.get(url);
}

public static String getWindow() {
	String getHandle =driver.getWindowHandle();
	return getHandle;
}

public static Set<String> getMutipleWindow() {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
}

public static WebDriver browserLaunch(String browser) {

	  if (browser.equalsIgnoreCase("chrome")) {
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("start-maximized");

	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(options);
	  } else if (browser.equalsIgnoreCase("edge")) {
	   WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	  } else if (browser.equalsIgnoreCase("gecko")) {

	   WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();

	  } else {
	   System.out.println("the invalid browser");
	  }
	  return driver;
	 }

}



