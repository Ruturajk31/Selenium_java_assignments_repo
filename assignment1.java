package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "F:/Games/ruturaj/cucumber/chromedriver/chromedriver.exe");
		// System.out.println("webdriver setting");		
		WebDriver driver= new ChromeDriver();

			//locating link using ID locator (Task1)
		driver.get("https://www.google.co.in/search?q=google&rlz=1C1GCEA_enIN990IN990&ei=oiX1Yar4JoeQseMP6JmnoAo&ved=0ahUKEwiq0ZOs7tb1AhUHSGwGHejMCaQQ4dUDCA4&uact=5&oq=google&gs_lcp=Cgdnd3Mtd2l6EAMyEAguELEDEIMBEMcBENEDEEMyCggAELEDEIMBEEMyCggAELEDEIMBEEMyBAgAEEMyBwgAELEDEEMyBwgAELEDEEMyCggAELEDEIMBEEMyDQgAELEDEIMBEMkDEEMyBQgAEJIDMgUIABCSAzoLCAAQgAQQsQMQgwE6BQgAEIAEOggIABCABBCxAzoECC4QQ0oECEEYAEoECEYYAFAAWMkHYIYLaABwAngAgAHIAYgB6giSAQUwLjUuMZgBAKABAcABAQ&sclient=gws-wiz");
		driver.manage().window().maximize(); 	
		WebElement link =  driver.findElement(By.id("hdtb-tls"));
		//System.out.println("located link using id locator");
		
		
		     //locating link using name locator (Task2)
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 	
		WebElement link = driver.findElement(By.name("login"));
		//System.out.println("item located");
		    
			// locating link using class name locator (Task3)		     
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize(); 			
		WebElement link = driver.findElement(By.className("nav__button-secondary"));
		//System.out.println("item located");
		    
			// locating link using css Selector locator (Task4)		     
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize(); 		
		WebElement link = driver.findElement(By.cssSelector("#simpleLink"));
		//System.out.println("item located");
		   
			// locating link using partial link text (Task5)
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 		
		WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
		//System.out.println("item located");
		
		   // locating link using link text (Task6)
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 		
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		//System.out.println("item located");

		//common action to be done on every webelement 
		link.click();
		System.out.println("click successful");
		driver.close();


}
}
