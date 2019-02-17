package SeleniumLocator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selnium_loc {
	// driver declare

	WebDriver driver;
 
	selnium_loc() {// initialization
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	public void launchurl(String baseurl)
	{
		
		String ActualErrormsg;	
		
		// to use main class baseurl
		//this.baseurl = "https://www.adactin.com/HotelApp//index.php";
		driver.get(baseurl);
		
	}	
	

	public void testcase1() throws InterruptedException {
// invalid login test case//
		
		String expectedErrormsg;
		expectedErrormsg = "Invalid Login details or Your Password might have expired. Click here to reset your password";
String ActualErrormsg;
		

		// driver.get("https://www.adactin.com/HotelApp//index.php");
		// driver.navigate().to(baseurl);

		driver.findElement(By.name("username")).sendKeys("drohini21");
		// driver.findElement(By.name("username")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Arsenal@20");
		Thread.sleep(2000);
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(2000);
		//// div[@class="auth_error"]

		ActualErrormsg = driver.findElement(By.xpath("//div[@class=\"auth_error\"]")).getText();
		if (ActualErrormsg.contentEquals(expectedErrormsg)) {
			System.out.println("valid message");
		} else {
			System.out.println("Invalid message");
		}

	
	}
	

	public void linktest1()
	{
		driver.findElement(By.linkText("Go to Build 2")).click();
		
	}	
	
	
	
public void closebrowser()
{
	driver.close();
}

	public static void main(String[] args) throws InterruptedException {

		selnium_loc obj1 = new selnium_loc();

		obj1.launchurl("https://www.adactin.com/HotelApp//index.php");
		obj1.testcase1();
		//obj1.linktest1();
		//obj1.closebrowser();
		

	}

}
