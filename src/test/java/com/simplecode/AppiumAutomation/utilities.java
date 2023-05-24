package com.simplecode.AppiumAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class utilities {
	 public static AndroidDriver<AndroidElement> createAppiumDriver(String apkPath) throws MalformedURLException {
	      
		 	File fs = new File(apkPath);
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4a");
	        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
	        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        return driver;
	    }
}
