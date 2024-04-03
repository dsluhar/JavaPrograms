package AutomationScripts;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium03_FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
    	driver.get("https://trytestingthis.netlify.app/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
    	
    	WebElement UploadElement = driver.findElement(By.xpath("//input[@id='myfile']"));
    	
    	UploadElement.sendKeys("C:\\Dilip\\DilipL.docx");
    	//UploadElement.click();
    	
    	((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000)", ""); //Scrolling Down
   	 	Thread.sleep(2000);
    	
    	
    	WebElement BtnClick = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
    	BtnClick.click();
    	
    	String actualTitle = driver.getTitle();
    	
    	System.out.println("Windows Title of Site is : " +actualTitle);
    	
    	String ExpectedTitle = "ELLKAY - Making Interoperability Happen - Healthcare Data Management Partners";
    	
    	if(actualTitle.equalsIgnoreCase(ExpectedTitle))
    		   System.out.println("Title Matched");
    	else
     		   System.out.println("Title didn't match");
    	
    	//   Assert.assertEquals(actualTitle, expectedTitle);
    	Thread.sleep(2000);
    	
    	driver.close();
    	driver.quit();
    	
    	}
}
