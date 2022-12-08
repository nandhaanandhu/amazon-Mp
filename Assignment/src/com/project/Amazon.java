package com.project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
 static WebDriver driver;
 
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\shakt\\eclipse-workspace\\Assignment\\Driver\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	
driver.findElement(By.xpath("//*[@type='text']")).sendKeys("amazon");

List<WebElement> list = driver.findElements(By.xpath("(//*[@class='OBMEnb'])[1]//descendant::li[@role='presentation']"));
//Thread.sleep(2000);

for (WebElement sugg : list) {
	System.out.println(sugg.getText());
}
driver.findElement(By.xpath("(//*[@class='OBMEnb'])[1]//descendant::li[@role='presentation'][1]")).click();
driver.findElement(By.xpath("//*[text()='Amazon.in']")).click();
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("dell computers");
Thread.sleep(2000);
 Robot r= new Robot();
 r.keyPress(KeyEvent.VK_ENTER);
 
 Thread.sleep(2000);
 
 driver.findElement(By.name("low-price")).sendKeys("30000");
 driver.findElement(By.name("high-price")).sendKeys("50000");
 driver.findElement(By.className("a-button-input")).click();
 List<WebElement> price = driver.findElements(By.className("a-price"));
for (WebElement allprice : price) {
	System.out.println(allprice.getText());
}
WebElement text = driver.findElement(By.xpath("//*[text()='5.0 out of 5 stars']"));
System.out.println(text.getText()
		);
	
	}
}
