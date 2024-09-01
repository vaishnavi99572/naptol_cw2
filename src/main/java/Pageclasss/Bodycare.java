package Pageclasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Bodycare {
	
	WebDriver driver;
	
	 public  Bodycare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	} 
	 
	 // use find by method to search for webelements
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Body Care")
	 private WebElement bodycElement;
	 
	 @FindBy(id = "isfreeship")
	 private WebElement freeship;
	 
	 @FindBy(css = "[placeholder=\"Search product by Pincode\"]")
	 private WebElement pincode;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	
	 @FindBy(id = "iscod")
	 private WebElement codElement;
	 
	 @FindBy(id = "brandFilterBox39159")
	 private WebElement fusionfit;
	 
	 @FindBy(id = "fromPriceRange")
	 private WebElement fromp;
	 
	 @FindBy(id = "toPriceRange")
	 private WebElement toprice;
	 
	 @FindBy(css = "[onclick=\"productSearch.setPriceRange(false)\"]")
	 private WebElement go;
	 
	 @FindBy(id = "featureFilterBox0f1")
	 private WebElement hairemoval;
	 
	 @FindBy(id = "featureFilterBox0f2")
	 private WebElement unisexElement;
	 
	 @FindBy(id = "discountFilterBox1")
	 private WebElement discount;
	 
	 @FindBy(id = "brandFilterBox38949")
	 private WebElement panchavtibrand;
	 
	 @FindBy(linkText = "Panchvati Herbals Hair Removal Cream")
	 private WebElement creamlink;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement clicktobuy;
	 
	 // these all are getters of webelements

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getBodycElement() {
		return bodycElement;
	}

	public WebElement getFreeship() {
		return freeship;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}

	public WebElement getCodElement() {
		return codElement;
	}

	public WebElement getFusionfit() {
		return fusionfit;
	}

	public WebElement getFromp() {
		return fromp;
	}

	public WebElement getToprice() {
		return toprice;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getHairemoval() {
		return hairemoval;
	}

	public WebElement getUnisexElement() {
		return unisexElement;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getPanchavtibrand() {
		return panchavtibrand;
	}

	public WebElement getCreamlink() {
		return creamlink;
	}

	public WebElement getClicktobuy() {
		return clicktobuy;
	}
	
	public void test1(String pc) {
		// this will click on bodycare link
		bodycElement.click();
		// applying filter free shipping
		freeship.click();
		// sending the pincode
		pincode.sendKeys(pc);
		// this will click on set button
		setbutton.click();
		
	
		
	}
	public void test2() {
		codElement.click();
		setbutton.click();
		
		// assert the item not found test
		WebElement ac= driver.findElement(By.cssSelector("[class=\"error\"]"));
		
		Assert.assertTrue(ac.isDisplayed());
		
	}
	 public void removeallfilter() throws InterruptedException {
		 freeship.click();
		 Thread.sleep(2000);
		 codElement.click();
		 Thread.sleep(2000);
		 setbutton.click();
		 
	 }
	 public void selectbrandprice(String Startp,  String endp) {
		 panchavtibrand.click();
		 fromp.sendKeys(Startp);
		 toprice.sendKeys(endp);
		 go.click();
		 
	 }
	 public void discounttypeandideal() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 unisexElement.click();
		 
		 
		 
	 }
	 public void addtocart() throws InterruptedException {
		 Thread.sleep(2000);
		 creamlink.click();
		 
		 // this will handles the window
		 
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
			
		 clicktobuy.click();
		 driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/body-care.html?&featid=f2-VW5pc2V4&featid=f1-SGFpciBSZW1vdmFs&brand=38949-Panchvati%20Herbals&discountRange=30to40&discountRange=30to33");
		
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
