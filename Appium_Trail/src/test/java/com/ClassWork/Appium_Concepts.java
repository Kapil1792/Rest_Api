package com.ClassWork;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appium_Concepts {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformName", "Android 12 SKQ1.210908.001n");
		capabilities.setCapability("udid", "");
		capabilities.setCapability("deviceName", "Redmi A1");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url = new URL("");
		
		driver = new AndroidDriver(url,capabilities)
		
	}
}
