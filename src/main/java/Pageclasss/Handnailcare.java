package Pageclasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Handnailcare {
	
	WebDriver driver;
	
	 public  Handnailcare (WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	}   
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Hand & Nail Care")
	 private WebElement hnc;
	 
	 @FindBy(id = "isexoutStock")
	 private WebElement checkbox1;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(id = "brandFilterBox6302")
	 private WebElement brandbox;
	 
	 @FindBy(css = "[placeholder=\"Search product by Pincode\"]")
	 private WebElement pincode;
	 
	 @FindBy(id = "fromPriceRange")
	 private WebElement fromp;
	 
	 @FindBy(id = "toPriceRange")
	 private WebElement toprice;
	 
	 @FindBy(css = "[onclick=\"productSearch.setPriceRange(false)\"]")
	 private WebElement go;
	 
	 @FindBy(linkText = "Pack of 10 Nail Paint Kit with Free UV LED Nail Dryer")
	 private WebElement pack;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;

	public WebElement getPack() {
		return pack;
	}

	public WebElement getGo() {
		return go;
	}

	public void setGo(WebElement go) {
		this.go = go;
	}

	public WebElement getFromp() {
		return fromp;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getToprice() {
		return toprice;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getHnc() {
		return hnc;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}

	public WebElement getBrandbox() {
		return brandbox;
	}
	
	
	 public WebElement getPincode() {
		return pincode;
	}

	public void handnailcare(String pin) throws InterruptedException {
		 //hnc.click();
		 checkbox1.click();
		 pincode.sendKeys(pin);
		 setbutton.click();
		 
		 //checkbox1.click();
		 Thread.sleep(2000);
		 pack.click();
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		 
		 addtocart.click();
		 driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/hand-nail-care.html");
		// driver.close();
		 
		  
	 }
	
	public void brand() {
		brandbox.click();
		// assert the brand name on UI
		
		
		WebElement ac= driver.findElement(By.id("loading_Pagination"));
		
		Assert.assertTrue(ac.isDisplayed());
		
	}
	public  void pricerange(String price, String eprice) {
		
		brandbox.click();
		fromp.sendKeys(price);
		toprice.sendKeys(eprice);
		go.click();
		
		// assert the result
		
		WebElement ac= driver.findElement(By.cssSelector("[class=\"error\"]"));
		
		Assert.assertTrue(ac.isDisplayed());
		
		
	}
	
	
	
	

}
