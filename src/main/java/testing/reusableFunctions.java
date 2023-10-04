package testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
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

public class reusableFunctions<TakeScreenshot> {
  @Test
  public void takeScreenshot(WebDriver driver) throws IOException {
	  TakeScreenshot takesScreenshot=(TakeScreenshot) driver;
		File sourseFile =  ((RemoteWebDriver) takesScreenshot).getScreenshotAs(OutputType.FILE);
	File destFile=new File("./screenshot/img"+Math.random()+".png");
	FileUtils.copyFile(sourseFile, destFile);
	System.out.println("screenshot saved");
	
  }
}
