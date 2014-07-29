import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class GoogleTest {
 private WebDriver driver;

 @Test
 public void verifySearch() {
	/* 
	 DesiredCapabilities capability = DesiredCapabilities.chrome();
	 ChromeOptions options = new ChromeOptions();
	    options.addArguments("test-type");
	//    capabilities.setCapability("chrome.binary","<<your chrome path>>");
	    capability.setCapability(ChromeOptions.CAPABILITY, options);
	    */
	 DesiredCapabilities capability = DesiredCapabilities.firefox();
	 try {
	//	driver = new RemoteWebDriver(new URL("http://192.168.1.132:4445/wd/hub"), capability);
	//	 driver = new RemoteWebDriver() 
		//		 (new URL("http://192.168.1.132:4445/wd/hub"));
		 System.out.println("");
	} catch(Exception e){ //catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  driver = new FirefoxDriver();
  driver.get("http://www.google.com/");
  driver.findElement(By.name("q")).sendKeys("Selenium");
  //driver.quit();
 }
}