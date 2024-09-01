package Pageclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Makeup {
	
	WebDriver driver;
	
	 public  Makeup(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	} 
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Makeup")
	 private WebElement makkeupElement;
	 
	 public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getMakkeupElement() {
		return makkeupElement;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getPincode() {
		return pincode;
	}


	public WebElement getSetbutton() {
		return setbutton;
	}
	@FindBy(id = "isexoutStock")
	 private WebElement checkbox1;
	 
	 @FindBy(css = "[placeholder=\"Search product by Pincode\"]")
	 private WebElement pincode;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(linkText = "Women's Set of 6 Perfumes (WSOP)")
	 private WebElement addElement;
	 
	 @FindBy(css = "[title=\"Buy online\"]")
	 private WebElement addcart;
	 
	 @FindBy(id = "brandFilterBox38993")
	 private WebElement brand2;
	 
	 @FindBy(id = "priceFilterBox1")
	 private WebElement pricebosx1;
	 
	 
	 public WebElement getBrand2() {
		return brand2;
	}

	public WebElement getPricebosx1() {
		return pricebosx1;
	}

	public WebElement getAddElement() {
		return addElement;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public void test1(String pincodes) {
		 makkeupElement.click();
		 checkbox1.click();
		 pincode.sendKeys(pincodes);
		 setbutton.click();
		 
		 
	 }
	 public void addtocart() throws InterruptedException {
		 Thread.sleep(2000);
		 addElement.click();
		 // this will handle new tab
		 
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		 addcart.click();
		 driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/make-up.html");
		 
		 
	 }
	 public void checkbox() throws InterruptedException {
		 brand2.click();
		 Thread.sleep(2000);
		 pricebosx1.click();
		 
	 }
	 

	

}
