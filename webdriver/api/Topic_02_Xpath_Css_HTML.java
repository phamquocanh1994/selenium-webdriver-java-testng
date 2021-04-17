package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_02_Xpath_Css_HTML {
	WebDriver driver;
  @Test
  public void TC_01_Validate() throws InterruptedException {
	  // Hiểu được HTML của 1 element
	  // Thao tác vs Đăng ký button
	driver.findElement(By.xpath("//form[@id='frmLogin']//button[text()='ĐĂNG KÝ']")).click();
	// driver: đại diện cho selenium Webdriver - gọi thư viện ra để sử dụng
	// fineElement: tìm element
	// By.id/ classname/name/xpath/ cssSelector/tagname/linkText/ partialLinktest: loại locator gì
	// click(): click vào button
	
	Thread.sleep(5000);
	// nhập vào textbox HỌ TÊN
	driver.findElement(By.cssSelector("input[id='txtFirstname']")).sendKeys("automationFC");
	Thread.sleep(3000);
	// nhập vào textbox Password
	driver.findElement(By.id("txtPassword")).sendKeys("123456789");
	Thread.sleep(3000);
	
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://alada.vn/tai-khoan/dang-ky.html");
  }

  @AfterClass
  public void afterClass() {
  }

}
