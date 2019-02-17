package SeleniumLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registeruser {

	// driver declare

	WebDriver driver;

	registeruser() {// initialization
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

	}

	public void launchurl(String baseurl) {

		String ActualErrormsg;

		// to use main class baseurl
		// this.baseurl = "https://www.adactin.com/HotelApp//index.php";
		driver.get(baseurl);

	}

	public void register() throws InterruptedException

	{

		driver.findElement(By.className("login_register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("usertest1");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("userpass1");
		Thread.sleep(2000);
		driver.findElement(By.id("re_password")).sendKeys("userpass1");
		Thread.sleep(2000);
		driver.findElement(By.id("full_name")).sendKeys("Testing one");
		Thread.sleep(2000);
		driver.findElement(By.id("email_add")).sendKeys("shiv58ratan@gmail.com");
		
		// Captcha -  in below wait enter manually captcha
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//To read the captcha
		String captchavalue = driver.findElement(By.xpath("//@[id='captcha']")).getText();
		System.out.println(captchavalue);
		driver.findElement(By.xpath("//@[id='captcha-form']")).sendKeys(captchavalue);
		
		
		//Select check box
		
	
		
		
		
		
		

	}

	public void closebrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		registeruser obj1 = new registeruser();

		obj1.launchurl("https://www.adactin.com/HotelApp//index.php");
		obj1.register();

		// obj1.closebrowser();

	}

}
