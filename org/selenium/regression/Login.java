package org.selenium.regression;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.selenium.library.CreateDriver;
import org.selenium.pageobjects.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login
{
private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Login.class.getName());
WebDriver driver;
LoginPage login;

@BeforeMethod
public void preCondition()
{

driver = CreateDriver.createBrowserInstance();
login  = new LoginPage(driver);

}

@Test
public void test_1234()
{

login.getUserNameTextbox().sendKeys("abc");
log.info("it send the ");

login.getPasswordTextbox().sendKeys("efg");
login.getLoginButton().click();

}

@AfterMethod
public void postCondition()
{
driver.quit();
}



}

