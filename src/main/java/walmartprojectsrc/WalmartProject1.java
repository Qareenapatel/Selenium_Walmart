package walmartprojectsrc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartProject1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blnts.com/");
	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New Arrivals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tops")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Brooklyn New York Graphic Boyfriend Tee Black Hover']")).click();
		
		driver.findElement(By.xpath("//span[text()='L/G']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='add']")).click();
		
	}

}
