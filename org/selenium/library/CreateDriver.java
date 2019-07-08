package org.selenium.library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.utils.PropertyFile;
public class CreateDriver {
	
public static WebDriver createBrowserInstance()
{
	WebDriver driver= null;

String browser =PropertyFile.getDataFromProperty("E:\\Framework\\Selenium\\config-proporties\\config.properties","Browser");

String url = PropertyFile.getDataFromProperty("E:\\Framework\\Selenium\\config-proporties\\config.properties","url");
System.out.println(browser);
if(browser.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","E:\\Framework\\Selenium\\browser_server\\chromedriver.exe");	

driver = new ChromeDriver();

}

else if(browser.equalsIgnoreCase("ie"))
{
System.setProperty("webdriver.ie.driver","E:\\Framework\\Selenium\\browser_server\\chromedriver.exe");	

driver = new ChromeDriver();

}
else
{
System.out.println("browser");
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get(url);

return driver;	

}
}