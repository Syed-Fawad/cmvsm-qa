package StepsFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_steps {
	WebDriver driver;
	
	
	
	@Given("Browser is open")
	public void browser_is_open() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    System.out.println("Browser is Launch");   
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() 
	{
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username ,String password ) 
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException 
	{
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the Homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit(); 
		
	   
	}

}
