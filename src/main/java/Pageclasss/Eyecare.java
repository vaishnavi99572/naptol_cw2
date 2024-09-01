package Pageclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Eyecare {
	
	WebDriver driver;
	
	 public  Eyecare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		 
	} 
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText ="Eye Care")
	 private WebElement Ec;
	 
	 @FindBy(id = "isfreeship")
	 private WebElement freship;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(id = "isexoutStock")
	 private WebElement outstock;
	 
	 @FindBy(id = "brandFilterBox8313")
	 private WebElement brand;
	 
	 @FindBy(id = "discountFilterBox1")
	 private WebElement discount;
	
	
	 public WebElement getBrand() {
		return brand;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getOutstock() {
		return outstock;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getEc() {
		return Ec;
	}

	public WebElement getFreship() {
		return freship;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}
	
	
	public void test01() throws InterruptedException {
		Ec.click();
		Thread.sleep(2000);
		brand.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("discountFilterBox1")));
		Thread.sleep(2000);
		discount.click();
	}
	
	public void test1() {
		
		freship.click();
		setbutton.click();
		
		WebElement ac= driver.findElement(By.cssSelector("[class=\"error\"]"));
		
		Assert.assertTrue(ac.isDisplayed());
	} 
	public void test2() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("isfreeship")));
		freship.click();
		outstock.click();
		
		// applying explicit wait
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class=\"button_1\"])[1]")));

		setbutton.click();
		
		
	}

}
