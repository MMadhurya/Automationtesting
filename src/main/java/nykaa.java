import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
		
public class nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		String oldTab = driver.getWindowHandle();
		System.out.println("OldTab"+oldTab);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//a[text()='makeup'])[2]")).click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<newTab.size();i++) {
			System.out.println("The value of is"+newTab.get(i));
		}
		driver.switchTo().window(newTab.get(1));		
		driver.findElement(By.xpath("//div[text()='Lipstick']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'! Creamy Matte Lipstick')]")).click();
		System.out.println("the current url"+driver.getCurrentUrl());
		System.out.println("the new tabs count is"+newTab.size());
		ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(newTab2.size());
		driver.switchTo().window(newTab2.get(2));
		System.out.println("the current url"+driver.getCurrentUrl());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//img[@alt='Let it Snooze-shade']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Bag'][1]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				driver.findElement(By.xpath("//span[@class='cart-count']")).click();
				System.out.println("the current url"+driver.getCurrentUrl());
				driver.switchTo().frame(0);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//span[text()='Proceed']")).click();
				TakesScreenshot screenshot = (TakesScreenshot)driver;
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(source, new File("./screenshot/finalscreen.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
		
		

	}

}
