package com.raghib.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioClassOne extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";

	public static String url = "http://www.echoecho.com/htmlforms10.htm";

	public static void main(String[] args) {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int size = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println("Radio Option Count : " + size);

		for (int index = 0; index < size; index++) {
			WebElement element = driver.findElements(By.xpath("//input[@name='group1']")).get(index);
			String el = element.toString();
			if (el.equalsIgnoreCase("Cheese")) {
				element.click();
			}
		}
		//BaseClass.quitDriver();
	}
}
