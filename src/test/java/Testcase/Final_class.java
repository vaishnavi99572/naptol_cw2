package Testcase;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Generic.Basetest;
import Pageclasss.Bodycare;
import Pageclasss.Bodyshapper;
import Pageclasss.Eyecare;
import Pageclasss.Facecare;
import Pageclasss.Footcare;
import Pageclasss.Haircare;
import Pageclasss.Handnailcare;
import Pageclasss.Homepage;
import Pageclasss.Makeup;
import Pageclasss.Personalcare;

public class Final_class extends Basetest {
	protected Homepage hpe;
	protected Handnailcare hn;
	protected Personalcare pc;
	protected Bodyshapper bss;
	protected Makeup pMakeup;
	
	protected Bodycare bcare;
	protected Facecare fcare;
	protected Haircare hcare;
	protected Footcare focare;
	protected Eyecare ecare;
	
	
	@Test
	public void homepage() throws IOException{

		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
	// for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\01.png");
		
		FileUtils.copyFile(image, img);
		
		ExtentReports reports= new ExtentReports("C:\\Users\\vaish\\OneDrive\\Desktop\\SDET\\Naptool\\report.html");
		ExtentTest test=reports.startTest("Page object model of naptool");
		
		test.log(LogStatus.PASS, "Chrome browser is opened");
		
	}
	@Test
	
	public void handnaill() throws InterruptedException, IOException{
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		hn= new Handnailcare(driver);
		hn.getBeauty().click();
		hn.getHnc().click();
		hn.handnailcare(npin);
		
		hn.brand();
		Thread.sleep(2000);		
		hn.pricerange(nsp, nep);
		
		//for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\1.png");
		
		FileUtils.copyFile(image, img);
	
		
	}
	@Test
	
	public void personalcare() throws InterruptedException, IOException{
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		pc= new Personalcare(driver);
		pc.getBeauty().click();
		pc.getPersonalcare().click();
		
		pc.test1(piin);
		pc.brandcheck();
		pc.pricebox();
		
		//for taking screenshoot		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\2.png");
		
		FileUtils.copyFile(image, img);
	
		
	
	}
	@Test
	
	public void bodyshaperslimmer() throws InterruptedException, IOException{
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		bss= new Bodyshapper(driver);
		bss.getBeauty().click();
		
		bss.test1(bpin);
		bss.test2();
		bss.test3();
		
		//for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\3.png");
		
		FileUtils.copyFile(image, img);
	
		
		
	}
	@Test
	public void makeup() throws InterruptedException, IOException {
		
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		pMakeup= new Makeup(driver);
		pMakeup.getBeauty().click();
		pMakeup.test1(mpin);
		pMakeup.addtocart();
		pMakeup.checkbox();
		
		//for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\4.png");
		
		FileUtils.copyFile(image, img);
	
		
	}
	@Test
	
	public void bodyCare() throws InterruptedException, IOException {
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		bcare = new Bodycare(driver);
		
		bcare.getBeauty().click();
		bcare.test1(bopin);
		bcare.test2();
		bcare.removeallfilter();
		bcare.selectbrandprice(bsp, bep);
		bcare.discounttypeandideal();
		bcare.addtocart();
		// for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\5.png");
		
		FileUtils.copyFile(image, img);
	
	
	}
	@Test
	public void facecare() throws InterruptedException, IOException {
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		
		
		fcare= new Facecare(driver);
		fcare.getBeauty().click();
		fcare.test1();
		fcare.checkbox();
		fcare.compare();
		fcare.addtocart();
		
		//for taking screenshoot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\6.png");
		
		FileUtils.copyFile(image, img);
	
		
		
		
	}
	@Test
	public void haircare() throws InterruptedException, IOException {
		
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		hcare= new Haircare(driver);
		hcare.getBeauty().click();
		hcare.test1();
		hcare.test2();
		hcare.teset3();
		
		//for taking screenshot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\7.png");
		
		FileUtils.copyFile(image, img);
	
		
	}
	@Test
	public void footcare() throws InterruptedException, IOException{
		
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		focare = new Footcare(driver);
		focare.getBeauty().click();
		focare.test1();
		focare.test2();
		focare.test3();
		
		// for taking screenshoot
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\8.png");
		
		FileUtils.copyFile(image, img);
	
		
		
	}
	@Test
	public void eyecare() throws InterruptedException, IOException {
		hpe= new Homepage(driver);
		hpe.ShopingCategories();  
		hpe.Beautywelness();
		
		ecare = new Eyecare(driver);
		ecare.getBeauty().click();
		ecare.test01();
		ecare.test1();
		ecare.test2();
		
		// this will take screenshoot
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File image= ss.getScreenshotAs(OutputType.FILE);
		
		File img= new File("C:\\Users\\vaish\\OneDrive\\Pictures\\Ns\\9.png");
		
		FileUtils.copyFile(image, img);
	
	}
	
	
	
	
	
}