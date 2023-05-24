package com.simplecode.AppiumAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.HashMap;


public class BasicTest {

	public static void main(String[] args)throws MalformedURLException {
		

//        AndroidDriver<AndroidElement> driver = utilities.createAppiumDriver("C:\\Users\\shubh\\OneDrive\\Desktop\\SQA interview preparation\\app-release-universal.apk");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementById("com.shubhobrata.roy.bdixtester.tester:id/btn_view").click();
        
        AndroidDriver<AndroidElement> driver = utilities.createAppiumDriver("C:\\Users\\shubh\\OneDrive\\Desktop\\SQA interview preparation\\BD.Medmate-1.1.0.apk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]").click();      
        //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText/android.view.View/android.view.View").sendKeys("hello");
        WebElement element = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText/android.view.View/android.widget.TextView");
        element.click();
//        driver.getKeyboard().sendKeys("edu");
        String value = "edu";

     // Send key events using adb shell input text command
     String adbCommand = String.format("input text %s", value);
     ((AndroidDriver<AndroidElement>) driver).executeScript("mobile: shell", ImmutableMap.of("command", adbCommand));
	}
     
}
