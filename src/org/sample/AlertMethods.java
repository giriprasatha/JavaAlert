package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\JavaAlert\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

	WebElement textAlert = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
	
	
	textAlert.click();
	
	WebElement promptAlert = driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']"));
	
	
	
	promptAlert.click();
	
	Thread.sleep(4000);
	
	Alert alert = driver.switchTo().alert();
	
	alert.sendKeys("Hi Rose");
	
	alert.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
