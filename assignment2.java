package demo;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;

public class assignment2{

	public static void main(String[] args) throws InterruptedException{
		//script for clear,click,findelement,findelements,getsize,gettagname,is displayed,is enabled, sendkeys, submit,contains.
		
		System.setProperty("webdriver.chrome.driver", "F:\\games\\ruturaj\\cucumber\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			
		//sendkeys (Task1)
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		WebElement element = driver.findElement(By.xpath("//*[contains(@id, 'identifierId')]"));
		element.sendKeys("ABC");
		
		//isDisplayed (Task2)
		Boolean Display = driver.findElement(By.xpath("//*[@id = 'identifierId']")).isDisplayed();
		System.out.println("Element is Displayed : "+Display);
		element.clear();

		//sendkeys (Task3)		
		WebElement element1 = driver.findElement(By.xpath("//*[contains(@name, 'identifier')]"));
		element1.sendKeys("shareit");
		
		//getSize (Task4)
		WebElement box = driver.findElement(By.name("identifier"));
		System.out.println("Size of input box : "+box.getSize());

		//getAttribute (Task5)
		String value = box.getAttribute("id");
		System.out.println("Value of ID Attribute of input-box : "+value);

		//click (Task6)
		driver.findElement(By.xpath("//*[contains(@type, 'button')]")).click();
		System.out.println("Clicked Forgot Email");
		
		//Windowhandles (Task7)
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowhandles = driver.getWindowHandles();
		Iterator<String> iterator =allWindowhandles.iterator();
		
		while(iterator.hasNext()) {
			
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
			}
		}
		
		//isenabled (Task8)
		Boolean Enable = driver.findElement(By.xpath("//*[@id = 'recoveryIdentifierId']")).isEnabled();
		System.out.println("Element is Enabled : "+Enable);
		

		    
		//submit (Task9)
		driver.get("https://www.linkedin.com/signup");
		driver.findElement(By.id("join-form-submit")).submit();
		System.out.println("submitted successfully");



		//findelements (Task10)
		driver.get("https://demo.guru99.com/test/radio.html");
		List <WebElement> elements = driver.findElements(By.name("webform"));
		System.out.println("Number of Elements : " +elements.size());
		for (int i = 0; i<elements.size(); i++){
			System.out.println("Scroll down items : "+elements.get(i).getAttribute("value"));

		}

	}

	// TODO Auto-generated method stub
}