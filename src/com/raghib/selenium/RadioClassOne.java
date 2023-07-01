package com.raghib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioClassOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int size = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println("Radio Option Count : "+size);
		
		for(int index=0; index < size; index++) {
			WebElement element = driver.findElements(By.xpath("//input[@name='group1']")).get(index);
			String el = element.toString();
			if (el.equalsIgnoreCase("Cheese")) {
				element.click();
			}
		}
		driver.close();
	}

}
