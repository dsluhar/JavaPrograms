package AutomationScripts;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium02_Ellkay {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.ellkay.com");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
    	
    	WebElement MenuEle = driver.findElement(By.xpath("(//*[text()='How We Help'])[1]"));
    	
    	String actualTitle = driver.getTitle();
    	
    	System.out.println("Windows Title of Site is : " +actualTitle);
    	
    	String ExpectedTitle = "ELLKAY - Making Interoperability Happen - Healthcare Data Management Partners";
    	
    	if(actualTitle.equalsIgnoreCase(ExpectedTitle))
    		   System.out.println("Title Matched");
    	else
     		   System.out.println("Title didn't match");
    	
    	//   Assert.assertEquals(actualTitle, expectedTitle);
    	
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(scrFile, new File("c:\\Dilip\\screenshot.png"));
    	
    	Actions action = new Actions(driver);
    	
    	action.moveToElement(MenuEle).perform();
    	Thread.sleep(2000);
    	
    	WebElement SubEle ;
    	SubEle = driver.findElement(By.xpath("//*[text()='Simplify Workflows for Complex Specialty Lab Ordering']"));
    	SubEle.click();
    	Thread.sleep(4000);
    	
    	driver.close();
    	driver.quit();
    	
    	}
}
