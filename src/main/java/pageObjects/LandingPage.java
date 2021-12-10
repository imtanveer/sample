package pageObjects;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class LandingPage {

	public WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By signIn = By.xpath("//div[@class='text-value ng-star-inserted']");

	By mobileNo = By.xpath("//input[@id='mat-input-11']");

	By otpClick = By.xpath("//span[contains(text(),'Send OTP')]");
	
	By otpNo = By.cssSelector("[class^='otp-input']");
	
	By continueButton = By.cssSelector("button[class='secondary']");
	
	By email = By.xpath("(//input[@placeholder='Email*'])[1]");
	
	By firstName = By.cssSelector("input[formcontrolname='firstName']");
	
	By zipCode = By.cssSelector("input[formcontrolname='zipCode']");
	
	By signUpButton = By.cssSelector("button[class='secondary']");
	  
	By societyAdd = By.xpath("//input[@formcontrolname='societyAddress']");
	
	By societyLoc = By.xpath("//span[contains(text(),'Kharadi')]"); 
	
	By cartBtn = By.cssSelector("[class^='icon-shopping-cart']"); 
	
	By checkOut = By.cssSelector("//button[contains(text(),'Proceed to Checkout')]");
	
	By door = By.xpath("//mat-label[contains(text(),'Door')]");
	By wing = By.xpath("//mat-label[contains(text(),'Wing')]");
	By mark = By.xpath("//input[@formcontrolname='landmark']");
	By update = By.xpath("//span[contains(text(),'Update Address')]");
	
	By payment = By.xpath("//span[contains(text(),'Proceed to Payment')]");
	
	By cod = By.xpath("//div[contains(text(),'Cash on delivery')]"); 
	
	By success = By.xpath("//div[contains(text(),'Order is Successfully Placed!')]");
	
	public WebElement getDoor() {

		return driver.findElement(door);
	}
	
	public WebElement getWing() {

		return driver.findElement(wing);
	}
	
	public WebElement getLandmark() {

		return driver.findElement(mark);
	}
	
	public WebElement getUpdated() {

		return driver.findElement(update);
	}
	
	public WebElement getPayment() {

		return driver.findElement(payment);
	}
	
	public WebElement getCOD() {

		return driver.findElement(cod);
	}
	
	public WebElement getSuccess() {

		return driver.findElement(success);
	}
	
	
	
	public WebElement getSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement getMobile() {

		return driver.findElement(mobileNo);
	}

	public WebElement getOtpBtn() {

		return driver.findElement(otpClick);
	}
	
	public WebElement enterOtp() {

		return driver.findElement(otpNo);
	}
	
	public WebElement getContinueButton() {

		return driver.findElement(continueButton);
	}
	
	public WebElement getEmail() {

		return driver.findElement(email);
	}
	
	public WebElement getFirstName() {

		return driver.findElement(firstName);
	}
	
	public WebElement getZipCode() {

		return driver.findElement(zipCode);
	}
	
	public  WebElement getSignUpButton() {

		return driver.findElement(signUpButton);
		
	}
	
	public void getSociety() {
		
		driver.findElement(societyAdd).click();
		driver.findElement(societyLoc).click();
	}
	
	public WebElement getCart() {
		return driver.findElement(cartBtn);
	}
	
	public WebElement getProceed() {
		return driver.findElement(checkOut);
	}
	@FindBy(css = "[class^='product-details'] [class='title']")
	List<WebElement> products;
	
	String[] itemsNeeded = { "FRESH COW GHEE 1 LITRE" };
	List<String> itemList = Arrays.asList(itemsNeeded);

	public List<WebElement> getProduct() {

		System.out.println(products.size());
		System.out.println("itemlist"+itemList);
		//int j = 0;
		
//		for(int i=0;i<products.size();i++) 
//		{
//			
//			String name = products.get(i).getText();
//			System.out.println(name);
//			if(name.contains("FRESH COW GHEE 1 LITRE"))
//			{
//				driver.findElements(By.xpath("//button[@class='add-cart']")).get(i).click();
//			}
//			
//		}

		for (int i = 0; i < products.size(); i++) {
			System.out.println("vvvvvvvv"+products.get(i).getText());
			String item = products.get(i).getText();

			if (itemList.contains(item)) {
				//j++;
				driver.findElements(By.xpath("//button[contains(normalize-space(),'ADD')]")).get(i).click();
//				if (j == itemsNeeded.length) {
//					break;
//				}
			}

		}
		return products;
	}
	
}
