package StepsFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_to_cart 
{ 
	WebDriver driver;
	@Given("I am on the Catalog page")
	public void i_am_on_the_catalog_page() {
		
		//driver.navigate().refresh();
		driver.get("https://www.saucedemo.com/inventory.html");
	
	}

	@Given("Add a product in cart")
	public void add_a_product_in_cart() { 
		
		driver.findElement(By.id("item_4_title_link")).click();
	}

	@When("User click on the cart button")
	public void user_click_on_the_cart_button() {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	    
	}

	@Then("Product added in the cart successfully")
	public void product_added_in_the_cart_successfully() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.close(); 
	}

}
