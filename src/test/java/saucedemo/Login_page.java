package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	WebDriver driver;
	
	By usrname= By.id("user-name");
    By usrpass= By.id("password");
    By btnlogin= By.id("login-button");
    
    
  public Login_page(WebDriver driver) {
	  this.driver=driver;
  }  	
  
public void validlogin(String username ,String password) 
{
	driver.findElement(usrname).sendKeys(username);
	driver.findElement(usrpass).sendKeys(password);
	driver.findElement(btnlogin).click();
	
}

}