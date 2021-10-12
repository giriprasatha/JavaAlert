package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\JavaAlert\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement textUser = driver.findElement(By.id("email"));
	textUser.sendKeys("jack1234");
	
	

	//To perform double Click
	Actions act =new Actions();
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
