package FoodHubWebUK.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ChromeDriver driver;

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://foodhub.co.uk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement fHUKWeb =driver.findElement(By.xpath("//label[text()='United Kingdom']"));
		fHUKWeb.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

  }

 @AfterMethod
  public void afterMethod() {
	  
	driver.close();
  }

}
