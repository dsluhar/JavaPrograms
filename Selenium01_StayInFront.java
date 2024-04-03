package AutomationScripts;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium01_StayInFront {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.stayinfront.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
    	
    	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Consumer Goods')]"));
    	
    	Actions action = new Actions(driver);
    	
    	action.moveToElement(ele).build().perform();
    	Thread.sleep(2000);
    	
    	WebElement Ele2 ;
    	Ele2 = driver.findElement(By.xpath("(//a[text()='StayinFront Retail Optimization Platform'])[1]"));
    	Ele2.click();
    	Thread.sleep(2000);
    	
    	((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 800)", ""); //Scrolling Down
   	 	Thread.sleep(4000);
    	
    	//driver.close();
    	//driver.quit();
    	
    	}
}
