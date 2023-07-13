package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//mouse hover, drag&drop, double click, right click, alert-popup, ids of parent browsers, print title of all browser and close.

		System.setProperty("webdriver.chrome.driver", "F:\\games\\ruturaj\\cucumber\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//ALERTS

		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		String Text = driver.switchTo().alert().getText();
		alert.accept();
		System.out.println("Alert Message : "+Text);

		driver.findElement(By.id("confirmButton")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		System.out.println("You have selected OK button");
		
		driver.findElement(By.id("confirmButton")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println("You have selected cancel button");


		driver.findElement(By.id("promtButton")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		System.out.println("You have selected OK button");
		driver.close();
		

		
		//RIGHT CLICK (CONTEXT CLICK) & DOUBLE CLICK

		driver.get("https://demoqa.com/buttons");
		Actions actions = new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id = 'doubleClickBtn']"));
		actions.doubleClick(doubleclick).perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id = 'rightClickBtn']"));
		actions.contextClick(rightclick).perform();


		//Drag&Drop, Mouse Hover

		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(drag).moveToElement(drop).release(drop).build();
		dragAndDrop.perform();


		//mouse hover

		driver.get("https://demoqa.com/menu/");
		Actions actions = new Actions(driver);
		WebElement Main = driver.findElement(By.xpath("//a[contains(text(), 'Main Item 2')]"));
		actions.moveToElement(Main).perform();
		WebElement Sub = driver.findElement(By.xpath("//a[contains(text(), 'SUB SUB LIST')]"));
		actions.moveToElement(Sub).perform();

	}



}

