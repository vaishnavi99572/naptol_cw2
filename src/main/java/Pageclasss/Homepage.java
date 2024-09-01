package Pageclasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	 public Homepage(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(css = "[class=\"cate_head\"]")
	private WebElement shopingcategories;
	
	@FindBy(linkText = "Beauty & Wellness")
	private WebElement beautywellness;
	
	@FindBy(xpath = "(//a[@class=\"cate_mother\"])[2]")
	private WebElement beautyElement;
	
	
	public WebElement getShopingcategories() {
		return shopingcategories;
	}

	public WebElement getBeautywellness() {
		return beautywellness;
	}
	
	public WebElement getBeautyElement() {
		return beautyElement;
	}


	public void ShopingCategories() {
		Actions mouse=new Actions(driver);
		
		WebElement ele = driver.findElement(By.cssSelector("[class=\"cate_head\"]"));
		
		mouse.moveToElement(ele).build().perform();
			
		
		
	}
	public void Beautywelness() {
		Actions mouse = new Actions(driver);
		
		WebElement elee = driver.findElement(By.linkText("Beauty & Wellness"));
		
		mouse.moveToElement(elee).build().perform();
		
		elee.click();
		
		// this will click on beauty section
		
		//beautyElement.click();
	
		
	}
	
}

