package class_Project;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class_2 {
	public static WebDriver driver;
	
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
		 
		 public static void maximize() {
		  driver.manage().window().maximize();
		 }
		 public static void close() {
		  driver.close();
		 }
		 public static void quit() {
		  driver.quit();
		 }
		 public static void fullScreen() {
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
		 public static void navigateRefresh() {
		  driver.navigate().refresh();
		 }
		 
		 public static String getTitle() {
		  String title = driver.getTitle();
		  return title;
		 }
		 
		 public static String getCurrentUrl() {
		  String currentUrl = driver.getCurrentUrl();
		  return currentUrl;
		 }
		 public static void launchUrl(String url) {
		  driver.get(url);
		 }
		 
		 
		 public static String getWindow() {
		  String windowHandle = driver.getWindowHandle();
		  return windowHandle;
		 }
		 
		 public static Set<String> getMultileWindow() {
		  Set<String> windowHandles = driver.getWindowHandles();
		  return windowHandles;
		 }
		 
		 
		 
		}
	
