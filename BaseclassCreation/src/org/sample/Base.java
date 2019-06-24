package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\eclipse-workspace\\aa\\BaseclassCreation\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void Insert(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void Clickmethod(WebElement element) {
		element.click();
	}
	public static void SelectvalueByIndex(WebElement element, int Index) {
		Select s = new Select(element);
		s.selectByIndex(Index);
	}
	public static void SelectvalueByText(WebElement element,String name) {
		Select s = new Select(element);
		s.selectByValue(name);
	}
	public static void Mouseover(WebElement element) {
		Actions acc=new Actions(driver);
		acc.moveToElement(element).perform();
		element.click();
	}
	public static void Draganddrop(WebElement element) {
		Actions acc=new Actions(driver);
		acc.dragAndDrop(element, element);
	}
	public static void Doubleclick(WebElement element) {
		Actions acc=new Actions(driver);
		acc.doubleClick(element).perform();
		element.click();
	}
	public static void Rightclick(WebElement element) {
		Actions acc=new Actions(driver);
		acc.contextClick(element).perform();
	}
	public static void Alertaccept(WebElement element) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public static void Alertdismiss(WebElement element) {
		Alert al = driver.switchTo().alert();
        al.dismiss();
	}
	public static void selectbyvisibleText(WebElement element,String name) {
		Select s = new Select(element);
		s.selectByVisibleText(name);
	}
	public static void deselectByIndex(WebElement element, int Index) {
		Select s = new Select(element);
		s.deselectByIndex(Index);
	}
	public static void deselectbyvalue(WebElement element,String name) {
	   Select s = new Select(element);
	   s.deselectByValue(name);
	}
	public static void deselectByVisibleText(WebElement element,String name) {
		Select s = new Select(element);
		s.deselectByVisibleText(name);
	}
	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

}
