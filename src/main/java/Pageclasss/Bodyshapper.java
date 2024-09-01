package Pageclasss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bodyshapper {
	
	WebDriver driver;
	
	
	 public Bodyshapper(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Body Shaper & Slimmers")
	 private WebElement bodys;
	 
	 @FindBy(id = "iscod")
	 private WebElement cod;
	 
	 @FindBy(css = "[placeholder=\"Search product by Pincode\"]")
	 private WebElement pinc;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setElement;
	 
	 @FindBy(id = "brandFilterBox38614")
	 private WebElement brandfilter;
	 
	 
	 @FindBy(id = "brandFilterBox8313")
	 private WebElement brand2;
	 
	 @FindBy(id = "priceFilterBox3")
	 private WebElement price;
	 
	 @FindBy(id = "discountFilterBox1")
	 private WebElement dis;
	 
	 @FindBy(id = "featureFilterBox1f1")
	 private WebElement featurElement;
	 
	 @FindBy(id = "featureFilterBox1f2")
	 private WebElement feature2;
	 
	 @FindBy(linkText = "Fat Reducing Fitness Belt - BOGO")
	 private WebElement fatlink;
	 
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;

 
	 // this all are getters of webelements
	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getBrandfilter() {
		return brandfilter;
	}

	public WebElement getDis() {
		return dis;
	}

	public WebElement getFatlink() {
		return fatlink;
	}

	

	public WebElement getBrand2() {
		return brand2;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getBodys() {
		return bodys;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getPinc() {
		return pinc;
	}

	public WebElement getSetElement() {
		return setElement;
	}
	
	public void  test1(String pincode) throws InterruptedException {
		bodys.click();
		Thread.sleep(2000);
		cod.click();
		pinc.sendKeys(pincode);
		
		   
	}
	
	public void test2() throws InterruptedException {
		brandfilter.click();
		Thread.sleep(2000);
		brand2.click();
		
		
		
	}
	public void test3() throws InterruptedException {
		
		Thread.sleep(2000);
		price.click();
		Thread.sleep(2000);
		dis.click();
		Thread.sleep(2000);
		featurElement.click();
		Thread.sleep(2000);
		feature2.click();
		
		// using javascript executor to scroll the page
		
		 JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		 jsExecutor.executeScript("window.scrollTo(0,0)");
		
		fatlink.click();
		
		// this will handle new tab
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		 addtocart.click();
		 driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/slimming-products.html?&featid=f1-V2Fpc3QgJiBUdW1teQ==&featid=f2-VW5pc2V4&brand=38614-Get%20In%20Shape&brand=8313-Branded&discountRange=40to50");
		
	}
		

}
