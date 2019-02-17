import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

WebDriver driver;
int i;
int j;
Selenium() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver= new ChromeDriver();
}

public void Home() throws InterruptedException
{
	///driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.45/");
	
	driver.get("https://google.co.in");
}
public static void main(String[] args) throws InterruptedException 
{
Selenium obj = new Selenium();
obj.Home();
	
}


}