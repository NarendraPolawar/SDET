package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver;
	
	public static void launchBrowser7() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDRA S. POLAWAR\\Desktop\\selenium\\narendra\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		}
	
	public static void launchBrowser8() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDRA S. POLAWAR\\Desktop\\selenium\\narendra\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		}
}
