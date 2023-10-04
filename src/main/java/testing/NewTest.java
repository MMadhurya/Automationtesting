package testing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest<TakeScreenshot> {
reusableFunctions rf= new reusableFunctions();
@Test
@Parameters("u")
  public  void fiirsttest(String u) throws IOException {System.err.println(u);
	 
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(u);
			  rf.takeScreenshot(driver);		  
			  List <WebElement> name =driver.findElements(By.xpath("//input[@name='name']"));
			  name.get(0).sendKeys("Madhurya");
			  rf.takeScreenshot(driver);
			  name.get(1).sendKeys("M");
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
			  rf.takeScreenshot(driver);
			  List <WebElement> password=driver.findElements(By.xpath("//input[@type=\'password\']"));
			  password.get(0).sendKeys("thilak");
			  rf.takeScreenshot(driver);
			  password.get(1).sendKeys("thilak");
			  	
				
  }
}

