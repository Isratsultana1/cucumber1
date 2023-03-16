package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement sigInButton;
 				
//			public void enterUserName(String userName) {
//	@FindBy(how =How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
//    WebElement NewAccount;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
//	WebElement Accounttitle;
//	@FindBy(how = How.XPATH, using ="//*[@id=\"account\"]" )
//	WebElement description;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
//	WebElement InitialBalance;
//	@FindBy(how = How.XPATH, using ="//*[@id=\"balance\"]")
//	WebElement AccountNumber;
//	@FindBy(how = How.XPATH, using ="//*[@id=\"account_number\"]" ) 
//	WebElement ContactPerson;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"contact__person\"]" )
//	WebElement phone;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
//	WebElement 
//		
	
	public void clickBankCash() {
		
	}

	public void clickNewAccount() {
		
	}

	public void enterAccounttitle(String accounttitle) {
		// TODO Auto-generated method stub
		
	}

	public void enterdescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void enterinitialBalance(String initialBalance) {
		// TODO Auto-generated method stub
		
	}

	

	public void enteraccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		
	}

//	public void enteracontactPerson(String contactPerson) {
//		ContactPerson.sendKeys(contactPerson);
//	try {
////		Thread.sleep(3000);
//	}catch (InterruptedException e) {
//	e.printStackTrace();	
//	}
//	}

//	public void enterphoneNumber(String phoneNumber) {
//		phoneNumber.sendKeys(phoneNumber + generateRandomNum(9999));
//		try {
//		Thread.sleep(3000);	
//		}catch(InterruptedException e) {
//	    e.printStackTrace();
//		}

	

//	private String generateRandomNum(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void enterinternetBankingURL(String internetBankingURL) {
//		URL.sendKeys(URL);
//		try {
//		Thread.sleep(3000);	
//		}catch(InterruptedException e) {
//		e.printStackTrace();	
//		}
//	}
//		
		
		
	

//	public void clickSubmitbutton() {
//	SubmitButton.click();
//	}

	
	

	public void enterUserName(String username) {
		UserName.sendKeys(username);	
		
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);	
	}

	public void clickSignInButton() {
		sigInButton.click();	
		
	}

	public String getPageTitle() {
		
		return null;
	}
	
			
			
			
			
			
			
	
	
}	