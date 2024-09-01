package Pageclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footcare {
	
	WebDriver driver;
	
	 public Footcare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		 
	} 
	 
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Foot Care")
	 private WebElement hc; 
	 
	 @FindBy(id = "iscod")
	 private WebElement cod;
	 
	 @FindBy(id = "brandFilterBox38964")
	 private WebElement ayurjeet;
	 
	 @FindBy(id = "discountFilterBox3")
	 private WebElement discount;
	 
	 @FindBy(linkText = "Detox Foot Patches Pack of 20")
	 private WebElement items;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getHc() {
		return hc;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getAyurjeet() {
		return ayurjeet;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getItems() {
		return items;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	 
	
	public void test1(){
		
		hc.click();
		cod.click();
	
	}
	public void test2() throws InterruptedException {
		
		ayurjeet.click();
		Thread.sleep(2000);

		discount.click();
	}
	public void test3() {
		// using javascript executor
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
	 	jsExecutor.executeScript("window.scrollTo(0,0)");
		
		items.click();
		
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		addtocart.click();
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/foot-care.html?&brand=38964-Ayurjeet&discountRange=40to50");
		
	}
	
	

}
