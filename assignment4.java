package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\games\\ruturaj\\cucumber\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id]"));
		System.out.println("Number of id's : "+elements.size());

		for (WebElement webelement : elements){
			String Text = webelement.getText();
			System.out.println("ID : "+Text);
		}

		
		// getting id's of all browser windows

		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//*[@id = 'tabButton']")).click();
		driver.findElement(By.xpath("//*[@id = 'windowButton']")).click();
		driver.findElement(By.xpath("//*[@id = 'messageWindowButton']")).click();
		
		String main_window = driver.getWindowHandle();
		Set<String>i = driver.getWindowHandles();

		Iterator <String> Window = i.iterator();
		System.out.println("outsideloop");
		while(Window.hasNext()){
			String child_window = Window.next();
			System.out.println("while");
			if(!main_window.equals(child_window)){
				System.out.println("if");
				int x = 1;
				driver.switchTo().window(child_window);
				System.out.println("Title of Page : "+driver.getTitle());				
				x = x + 1;
				List<WebElement> items = driver.findElements(By.xpath("//*[@id]"));
				System.out.println("Number of id's : "+items.size());
				for (int j = 0; j<items.size(); j++){
					System.out.println("ID : "+items.get(j).getAttribute("value"));
					System.out.println("ID : "+get(j));
				}
				System.out.println("Total Number browser windows : "+x);
			} 
		}
	// TODO Auto-generated method stub
	}
}
