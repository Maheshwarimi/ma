package org.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
public LoginPage(WebDriver driver)
{

this.driver = driver;

}

public WebElement getUserNameTextbox()
{

try
{

return driver.findElement(By.name("username"));

}

catch(Exception e)
{

return null;

}
}

public WebElement getPasswordTextbox()
{

try

{

return driver.findElement(By.name("pwd"));

}
catch(Exception e)
{

return null;
}
}

public WebElement getLoginButton()
{

try

{

return driver.findElement(By.cssSelector("input[type='submit']"));

}
catch(Exception e)
{

return null;
}

}

}
