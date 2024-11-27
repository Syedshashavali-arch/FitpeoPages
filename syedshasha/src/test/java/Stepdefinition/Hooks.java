package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver;
	JavascriptExecutor js; 
	

	@Before
	public void setup() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

	}

	@Given("Launch the url")
	public void launch_the_url() throws InterruptedException {
		driver.navigate().to("https://www.fitpeo.com/cpt-codes");
		Thread.sleep(3000);

	}

	@Then("Click on the revenue calculator section")
	public void click_on_the_revenue_calculator_section() throws InterruptedException {
		driver.findElement(By.linkText("Revenue Calculator")).click();
		Thread.sleep(3000);
	}

	@When("The Revenue calculator page loads")
	public void the_revenue_calculator_page_loads() throws InterruptedException {
		System.out.println(" Rever click Done");
		// driver.findElement(By.xpath("//*[@type='number']")).click();
		System.out.println(" 200 clicked");
		Thread.sleep(3000);
		 
	}

	@Then("Scroll down to Medicare Eligible Patients section")
	public void scroll_down_to_medicare_eligible_patients_section() throws InterruptedException {
		 WebElement java = driver.findElement(
	                By.xpath("//*[@type='number']"));
		
		java = driver.findElement(By.xpath("//*[@type='number']"));
		js.executeScript("javascript:window.scrollBy(250,350)");
		// js.executeScript("document.getElementById(':r0:').value='820';");
		js.executeScript("arguments[0].click();", java);
		Thread.sleep(3000);
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
	}

	@Then("Adjust the slider to {int} bottom text field value should be updated to {int}")
	public void adjust_the_slider_to_bottom_text_field_value_should_be_updated_to(Integer int1, Integer int2)
			throws InterruptedException {
		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		System.out.println(" 63 ..");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='checkbox'])[8]")).click();
		System.out.println(" 63 ..");

	}

	@Then("Update the value in the input field enter {int}")
	public void update_the_value_in_the_input_field_enter(Integer int1) throws InterruptedException {
		System.out.println(" All Check boxes done");
		// Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, -1200)");

		Thread.sleep(2000);

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}