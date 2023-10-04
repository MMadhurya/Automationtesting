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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest<TakeScreenshot> {
	reusableFunctions rf = new reusableFunctions();
	WebDriver driver;
	@Test
	@Parameters({ "u", "Browser" })
	// parameter are added

	public void fiirsttest(String u, String Browser) throws IOException {System.out.println("Browser value"+Browser);		
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(u);
		rf.takeScreenshot(driver);
		List<WebElement> name = driver.findElements(By.xpath("//input[@name='name']"));
		name.get(0).sendKeys("Madhurya");
		rf.takeScreenshot(driver);
		name.get(1).sendKeys("M");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
		rf.takeScreenshot(driver);
		List<WebElement> password = driver.findElements(By.xpath("//input[@type=\'password\']"));
		password.get(0).sendKeys("thilak");
		rf.takeScreenshot(driver);
		password.get(1).sendKeys("thilak");

	}
}
