package kroger.SeleniumKrogerCheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_checkout {
	
	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();

    // Initialize the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();
    
    driver.get("https://www.kroger.com/");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
  //  driver.findElement(By.xpath("//*[@id=\"WelcomeButton-A11Y-FOCUS-ID\"]/span")).click();
  
    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SearchBar-input")));
    driver.findElement(By.id("SearchBar-input")).click();
    driver.findElement(By.id("SearchBar-input-open")).sendKeys("Banana");
  
	}
}
