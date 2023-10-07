package com.utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Utility {

public static WebDriver driver;
@BeforeClass
public static void browserLaunch() {
	driver=new EdgeDriver();
	driver.manage().window().maximize();
}
@BeforeMethod
public static void loadUrl(String Url) {
	driver.get(Url);
}
@AfterSuite

public static void closeWindow() {
	driver.close();
	driver.quit();
}
public static WebElement findElementById(String id) {
	return driver.findElement(By.id(id));
}

public static WebElement findElementByName(String name) {
	return driver.findElement(By.name(name));
}

public static WebElement findElementByXpath(String xpath) {
	return driver.findElement(By.xpath(xpath));
}

public static WebElement findElementByLinkText(String text) {
	return driver.findElement(By.linkText(text));
}

public static WebElement findElementByPartialLinkText(String text) {
	return driver.findElement(By.partialLinkText(text));

}

public static List<WebElement> findElementByTagName(String text) {
	return driver.findElements(By.tagName(text));
}

public static void textData(WebElement we, String value) {
	we.sendKeys(value);
}

public static void onClick(WebElement we) {
	we.click();
}

public static void implictWait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

public static void explictWait(WebElement e) {
	WebDriverWait we = new WebDriverWait(driver, Duration.ofSeconds(20));
	we.until(ExpectedConditions.visibilityOf(e));
	
}

}




