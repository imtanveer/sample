package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.BaseClass;


public class HomePageTest extends BaseClass {
	
	public WebDriver driver;

	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver();
		driver.get(prop.getProperty("qaurl"));
	}

	@Test
	public void homePageSignIn() throws InterruptedException{
		
		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();
		
		lp.getMobile().sendKeys("9404121500");
		lp.getOtpBtn().click();
		
		lp.enterOtp().sendKeys("123456");
		
		lp.getContinueButton().click();
		
		lp.getEmail().sendKeys("tanveer@gmail.com");
		lp.getFirstName().sendKeys("tanveer");
		lp.getZipCode().sendKeys("411014");
		Thread.sleep(10);
		lp.getSociety();
		lp.getSignUpButton().click();
		lp.getProduct();
		lp.getCart().click();
		lp.getProceed().click();
		lp.getDoor().sendKeys("silver");
		lp.getWing().sendKeys("temp");
		lp.getLandmark().sendKeys("marriagehall");
		lp.getUpdated().click();
		lp.getPayment().click();
		lp.getCOD().click();
		Assert.assertEquals(lp.getSuccess().getText(), "Order is Successfully Placed!");
		

	}

//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}

}
