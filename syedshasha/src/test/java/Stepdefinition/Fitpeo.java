package Stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fitpeo {
	
	
	 
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	// Launch website
	driver.navigate().to("https://www.fitpeo.com/cpt-codes");
	        driver.findElement(By.linkText("Revenue Calculator")).click();
	        Thread.sleep(3000);
	        System.out.println(" Rever click Done");
	        //driver.findElement(By.xpath("//*[@type='number']")).click();
	        System.out.println(" 200 clicked");
	        Thread.sleep(3000);
	        WebElement java = driver.findElement(
	                By.xpath("//*[@type='number']"));
	        // :r0:
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        //js.executeScript("document.getElementById(':r0:').value='820';");
	        js.executeScript("arguments[0].click();", java);
	        Thread.sleep(30000);
	        js.executeScript("document.getElementById(':r0:').value='820';");
	        System.out.println(" after enter 820");
	        Thread.sleep(30000);
	        js.executeScript("document.getElementById(':r0:').value='560';");
	        System.out.println(" after enter 560");
	        Thread.sleep(30000);
	        js.executeScript("javascript:window.scrollBy(250,350)");
	        driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
	        System.out.println(" 57 ..");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
	        System.out.println(" 19 ..");
	        Thread.sleep(3000);
	       
	        driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
	        System.out.println(" 63 ..");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//*[@type='checkbox'])[8]")).click();
	        System.out.println(" 63 ..");
	       
	        System.out.println(" All Check boxes done");
	        //Thread.sleep(3000);
	        JavascriptExecutor js1 = (JavascriptExecutor)driver;
	        js1.executeScript("window.scrollBy(0, -1200)");

	        Thread.sleep(2000);
	               
	     

	}

	}

