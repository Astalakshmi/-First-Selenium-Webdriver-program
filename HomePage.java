package com.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\702820\\eclipse-workspace\\driver\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
	}

}
