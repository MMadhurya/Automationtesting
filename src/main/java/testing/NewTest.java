package testing;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

@Test
@Parameters("u")
  public void fiirsttest(String u) {System.err.println(u);
	 // System.setProperty("webdriver.chrome.driver","‪‪C:\\Users\\HP\\eclipse-workspace\\sample\\automationtesting\\chromedriver.exe");
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(u);
			  List <WebElement> name =driver.findElements(By.xpath("//input[@name='name']"));
			  name.get(0).sendKeys("Madhurya");
			  name.get(1).sendKeys("M");
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
			  List <WebElement> password=driver.findElements(By.xpath("//input[@type=\'password\']"));
			  password.get(0).sendKeys("thilak");
			  password.get(1).sendKeys("thilak");
			  	
				
  }
}

