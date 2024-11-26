package kroger.SeleniumKrogerCheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_checkout {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp(){
		
    WebDriverManager.chromedriver().setup();

    // Initialize the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();
    driver.get("https://www.kroger.com/p/kroger-peeled-baby-carrots-bag/0001111091620");
	}
	
	
	@Test
	
	public void launch() {
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    
		driver.findElement(By.xpath("//*[@id=\"WelcomeButton-A11Y-FOCUS-ID\"]/span")).click();
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SearchBar-input")));
		driver.findElement(By.id("SearchBar-input")).click();
		driver.findElement(By.id("SearchBar-input-open")).sendKeys("Banana");
	    driver.findElement(By.id("SearchBar-input-open")).sendKeys(Keys.ENTER);
    
	}
	
	
   @AfterMethod
   
   public void teardown() { 
	   driver.quit();
	}
}
