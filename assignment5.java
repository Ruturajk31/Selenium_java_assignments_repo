package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\games\\ruturaj\\cucumber\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://demoqa.com/browser-windows");
//		driver.get("https://www.naukri.com");
		System.out.println("Title of page: "+driver.getTitle());
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id]"));
		System.out.println("Number of id's : "+elements.size());

		for (WebElement webelement : elements){
			String Text = webelement.getText();
			System.out.println("ID : "+Text);
		}
			
		
		//driver.findElement(By.xpath("//*[@id = 'tabButton']")).click();
		driver.findElement(By.xpath("//*[@id = 'windowButton']")).click();
		//driver.findElement(By.xpath("//*[@id = 'messageWindowButton']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> S = driver.getWindowHandles();
		Iterator<String> W = S.iterator();
		while (W.hasNext()) {
			String child_window = W.next();
			if (!parentWindow.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println("Title of page: "+driver.switchTo().window(child_window).getTitle());
				List<WebElement> items = driver.findElements(By.xpath("//*[@id]"));
				System.out.println("Number of id's : "+items.size());
				
				for (WebElement webelement1 : items){
					String Text1 = webelement1.getText();
					System.out.println("ID : "+Text1);
					driver.close();
				}

			}
		}
		
		driver.findElement(By.xpath("//*[@id = 'windowButton']")).click();
		driver.findElement(By.xpath("//*[@id = 'messageWindowButton']")).click();
		driver.close();
		driver.quit();

	}

}
