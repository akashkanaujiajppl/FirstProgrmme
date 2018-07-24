package simple;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element {
	
	
        @Test
		public void test() throws IOException
		{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		List<WebElement> element =  driver.findElements(By.id("geolocation_chosen"));
		 int n = element.size();
		 
		 for (int i=0;i<=n;i++)
		 {
			 String ele = element.get(i).getText();
		 }
		 File src= (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("path"));
	}

}
