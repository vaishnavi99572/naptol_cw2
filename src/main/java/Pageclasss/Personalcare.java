package Pageclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Personalcare {
	
	
	WebDriver driver;
	 Select se;
	
	 public Personalcare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 public WebElement getBeauty() {
		return beauty;
	}
	@FindBy(linkText = "Personal Care")
	 private WebElement personalcare;
	 
	 @FindBy(id = "isexoutStock")
	 private WebElement check1;
	 
	 @FindBy(css = "[placeholder=\"Search product by Pincode\"]")
	 private WebElement pincodElement;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(id = "brandFilterBox8313")
	 private WebElement brandcheckbox;
	 
	 @FindBy(id = "cpid12613396")
	 private WebElement addtocompare;
	 
	 @FindBy(id = "cpid12613025")
	 private WebElement addtocompare2;
	 
	 @FindBy(css = "[class=\"button_1 compareFancyBox\"]")
	 private WebElement comparenow;
	 
	 @FindBy(css = "[class=\"fancybox-item fancybox-close\"]")
	 private WebElement close;
	 
	 @FindBy(css = "[name=\"Scottish Club\"]")
	 private WebElement scottish;
	 
	 @FindBy(css = "[name=\"Looks21\"]")
	 private WebElement bc3;
	 
	 @FindBy(css = "[name=\"NEWISH\"]")
	 private WebElement newsElemen;
	 
	 @FindBy(id = "priceFilterBox3")
	 private WebElement pricElement;
	 
	 
	 @FindBy(id = "priceFilterBox5")
	 private WebElement pricebox;
	 
	 
	 @FindBy(id = "discountFilterBox1")
	 private WebElement discount;
	 
	 @FindBy(id = "discountFilterBox4")
	 private WebElement discoutbox;
	 
	 @FindBy(linkText = "Daily Powerful Shaver (PS3)")
	 private WebElement trimElement;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;
	 
	 @FindBy(id = "sortByFilter")
	 private WebElement sortbyyElement;
	 
	 @FindBy(linkText = "Highest Rated")
	 private WebElement highratElement;
	
	  
	 public WebElement getSortbyyElement() {
		return sortbyyElement;
	}


	public WebElement getHighratElement() {
		return highratElement;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getTrimElement() {
		return trimElement;
	}


	public WebElement getPricElement() {
		return pricElement;
	}


	public WebElement getPricebox() {
		return pricebox;
	}


	public WebElement getDiscount() {
		return discount;
	}


	public WebElement getScottish() {
		return scottish;
	}


	public WebElement getBc3() {
		return bc3;
	}


	public WebElement getNewsElemen() {
		return newsElemen;
	}


	public WebElement getPersonalcare() {
		return personalcare;
	}


	public WebElement getCheck1() {
		return check1;
	}


	public WebElement getPincodElement() {
		return pincodElement;
	}


	public WebElement getSetbutton() {
		return setbutton;
	}


	public WebElement getBrandcheckbox() {
		return brandcheckbox;
	}

	public WebElement getAddtocompare() {
		return addtocompare;
	}

	public WebElement getAddtocompare2() {
		return addtocompare2;
	}


	public WebElement getComparenow() {
		return comparenow;
	}

	public WebElement getClose() {
		return close;
	}
	
	public WebElement getDiscoutbox() {
		return discoutbox;
	}
	 
	
	

	public void test1(String piin) {
		check1.click();
		pincodElement.sendKeys(piin);
		addtocompare.click();
		addtocompare2.click();
		comparenow.click();
		close.click();
		
		 
		 
	 }
	
	public void brandcheck() throws InterruptedException {
		brandcheckbox.click();
		
		Thread.sleep(2000);
		scottish.click();
		
		Thread.sleep(2000);
		bc3.click();
		
		Thread.sleep(2000);
		newsElemen.click();
	
		
	}
	
	public void pricebox() throws InterruptedException {
		Thread.sleep(2000);
		pricElement.click();
		Thread.sleep(2000);
		pricebox.click();
		
		Thread.sleep(2000);
		trimElement.click();
		
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		 addtocart.click();
		 
		 driver.navigate().to("https://naaptol.com/shop-online/health-beauty/beauty/personal-care.html?&discountRange=30to40&discountRange=40to50");
		 
		 
	}
	

}
