package JenkinsWithSelenium.JenkinsWithSeleniumAutomation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver","/home/edureka/Downloads/geckodriver");
    	WebDriver driver = new FirefoxDriver();
    	System.out.println("Hi, This is demo for Jenkins Integration");
    	driver.get("http://localhost:3001");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	driver.findElement(By.name("login")).sendKeys("TCS");
    	driver.findElement(By.name("password")).sendKeys("TCS");
    	driver.findElement(By.name("click")).click();
    	//Thread.sleep(5000);
    	driver.quit();}}

