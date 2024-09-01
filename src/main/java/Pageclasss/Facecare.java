package Pageclasss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facecare {
	
	WebDriver driver;
	
	 public  Facecare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	} 
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Face Care")
	 private WebElement fc;
	 
	 @FindBy(id = "isexoutStock")
	 private WebElement outstock;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(id = "brandFilterBox39123")
	 private WebElement drraushel;
	 
	 @FindBy(id = "priceFilterBox1")
	 private WebElement pricebox;
	 
	 @FindBy(id = "discountFilterBox3")
	 private WebElement dis;
	 
	 @FindBy(id = "featureFilterBox0f2")
	 private WebElement unisex;
	 
	 @FindBy(linkText = "Green Tea Skin Brightening Clay Stick Mask")
	 private WebElement masklink;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;
	 
	 @FindBy(id = "cpid12612315")
	 private WebElement adc1;
	 
	 @FindBy(id = "cpid12612391")
	 private WebElement adc2;
	 
	 @FindBy(id = "compareButton")
	 private WebElement cb;
	 
	 @FindBy(css = "[title=\"Close\"]")
	 private WebElement close;
	 
	 // these all are getters of these webelements

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getFc() {
		return fc;
	}

	public WebElement getOutstock() {
		return outstock;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}

	public WebElement getDrraushel() {
		return drraushel;
	}

	public WebElement getPricebox() {
		return pricebox;
	}

	public WebElement getDis() {
		return dis;
	}

	public WebElement getUnisex() {
		return unisex;
	}

	public WebElement getMasklink() {
		return masklink;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getAdc1() {
		return adc1;
	}

	public WebElement getAdc2() {
		return adc2;
	}

	public WebElement getCb() {
		return cb;
	}
	public WebElement getClose() {
		return close;
	}
	 
	public void test1() {
		fc.click();
		outstock.click();
		setbutton.click();
		
	}
	public void checkbox() throws InterruptedException {
		Thread.sleep(2000);
		drraushel.click();
		Thread.sleep(2000);
		pricebox.click();
		Thread.sleep(2000);
		dis.click();
		Thread.sleep(2000);
		unisex.click();
	}
	
	public void compare() throws InterruptedException {
		Thread.sleep(2000);
		adc1.click();
		adc2.click();
		cb.click();
		close.click();
		
	
	}
	
	public void addtocart() {
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/face-care.html?&featid=f2-VW5pc2V4&brand=39123-Dr%20Rashel&discountRange=0to10");
		
		masklink.click();
		
		// handles new tab
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
	
		addtocart.click();
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/face-care.html?&featid=f2-VW5pc2V4&brand=39123-Dr%20Rashel&discountRange=0to10");
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
