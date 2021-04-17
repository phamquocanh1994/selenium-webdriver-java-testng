package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_02_Xpath_Css_Part_II {
	WebDriver driver;
	
  @Test
  public void TC_01_ID() throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys("automationtest@gmail.com"); 
	  driver.findElement(By.id("pass")).sendKeys("123456789");
	  
	  Thread.sleep(3000);

  }
  
  @Test
  public void TC_02_Class() {
	  
  }
  @Test
  public void TC_03_Name() {
  }
  @Test
  public void TC_04_TagName() {
  }
  @Test
  public void TC_05_LinkText() {
  }
  @Test
  public void TC_06_Partial_LinkText() {
  }
  @Test
  public void TC_07_CSS() {
  }
  @Test
  public void TC_08_Xpath() {
  }
  @BeforeClass
  public void beforeClass() {
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
  }

  @AfterClass
  public void afterClass() {
  }

}
