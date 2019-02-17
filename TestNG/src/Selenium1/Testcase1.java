package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	String baseurl;
	ChromeDriver driver;
	
	@BeforeTest
	public void driverdeclare() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(description="Testing")
	public void test1() throws InterruptedException {
		// login 
		System.out.println("testNG 1st test");
		baseurl = "https://www.adactin.com/HotelApp//index.php";
		driver.get(baseurl);
		driver.findElement(By.className("login_input")).sendKeys("drohini21");
		driver.findElement(By.id("password")).sendKeys("Arsenal@20");
		driver.findElement(By.className("login_button")).click();
	Thread.sleep(2);
		
		//find above in xpath 
		
	//e.g	xpath=//input[.="login_input"]
	//		xpath=//*[.="login_input"]  xpath=//input[@class="login_input"]		
	//	xpath=//a[text()="New User Register Here"]		
				
		//hotel search//
		
	Select sel; 
	sel= new Select(driver.findElement(By.name("location")));
	//sel.selectByIndex(1);
//sel.selectByValue("London");
	sel.selectByVisibleText("London");
Thread.sleep(200);
		close();
	}
	
	
	public  void close()
	{
		driver.close();
		
	}
	
}