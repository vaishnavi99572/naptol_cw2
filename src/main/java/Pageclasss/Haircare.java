package Pageclasss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Haircare {
	
	WebDriver driver;
	
	 public Haircare(WebDriver driver){
		// initialize using this driver
		
		this.driver= driver;
		// use and store driver and this
		
		PageFactory.initElements(driver, this);
		 
	} 
	 @FindBy(linkText = "Beauty")
	 private WebElement beauty;
	 
	 @FindBy(linkText = "Hair Care")
	 private WebElement hc; 
	 
	 public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getHc() {
		return hc;
	}

	public WebElement getOutstock() {
		return outstock;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}

	public WebElement getBranded() {
		return branded;
	}

	public WebElement getDfElement() {
		return dfElement;
	}

	public WebElement getOil() {
		return oil;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	@FindBy(id = "isexoutStock")
	 private WebElement outstock;
	 
	 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	 private WebElement setbutton;
	 
	 @FindBy(id = "brandFilterBox8313")
	 private WebElement branded;
	 
	 @FindBy(id = "discountFilterBox3")
	 private WebElement dfElement;
	 
	 @FindBy(linkText = "Adivasi Original Hair Oil for Men")
	 private WebElement oil;
	 
	 @FindBy(css = "[class=\"red_button icon chat\"]")
	 private WebElement addtocart;
	 
	 public void test1() {
		 
		 hc.click();
		 outstock.click();
		 setbutton.click();
		 
	 }
	 public void test2() throws InterruptedException {
		 Thread.sleep(2000);
		 branded.click();
		 Thread.sleep(2000);
		 dfElement.click();
		 
		 
	 }
	 public void teset3() throws InterruptedException {
		 Thread.sleep(2000);
		 
//		// Scroll to a specific element on the page
//		 WebElement element = driver.findElement(By.linkText("Adivasi Original Hair Oil for Men"));
//		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		 JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		 jsExecutor.executeScript("window.scrollTo(0,0)");
		 oil.click();
		 driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		 addtocart.click();
		 driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty/beauty/hair-care.html?&brand=8313-Branded&discountRange=40to50");
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	 

