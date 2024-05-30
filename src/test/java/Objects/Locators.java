package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
	WebDriver driver;
	
public Locators(WebDriver driver) {
	this.driver = driver;
	
} 

//locators repository
By CreateanAccount = By.linkText("Create an Account");
By FirstName = By.xpath("//input[@id='firstname']");
By LastName = By.xpath("//input[@id='lastname']");
By EmailInCreateaccount = By.xpath("//input[@id='email_address']");
By PasswordInCreateaccount = By.xpath("//input[@id='password']");
By ConfirmPassword = By.xpath("//input[@id='password-confirmation']");
By CreateAnAccountbtn = By.xpath("//button[@title='Create an Account']");
By WhatsNew = By.xpath("//*[@id=\"ui-id-3\"]/span");
By MensHoodie = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[2]/li[1]/a");
By Pic=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/img");
By Size=By.xpath("//div[@class='swatch-opt']/child::div[1]/child::div[1]/child::div[2]");
By Color=By.xpath("//*[@id=\"option-label-color-93-item-53\"]");
By Cart=By.xpath("//button[@title='Add to Cart']");
By MoreInfo=By.xpath("//div[@class='product data items']/child::div[3]/child::a[1]");
By Home=By.xpath("//a[@title='Go to Home Page']");
By signin=By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
By EmailinSignInPage=By.xpath("//input[@title='Email']");
By PasswordinSignInPage=By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");

public void ClickonAccountLink()

{
	   try {
	   driver.findElement(CreateanAccount).click();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception cauch :" + e.getMessage());
	   }
}
public void ClickonFirstname(String fname)

{
	   try {
	   driver.findElement(FirstName).sendKeys(fname);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception cauch :" + e.getMessage());
	   }
	   
}
public void ClickonLastname(String lname)
{
	   try {
		   driver.findElement(LastName).sendKeys(lname);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}

public void EnterEmail(String Em)
{
	   try {
		   driver.findElement( EmailInCreateaccount) .sendKeys(Em);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	  
}
public void EnterPassword(String Epass)
{
	   try {
		   driver.findElement(PasswordInCreateaccount).sendKeys(Epass);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
	   
}
public void EnterPasswordAgain(String ConfirmPass)
{
	   try {
		   driver.findElement(ConfirmPassword).sendKeys(ConfirmPass);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
	   
}
public void ClickonSubmit()
{
	   try {
		   driver.findElement(CreateAnAccountbtn).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickonWhatsNew()
{
	   try {
		   driver.findElement(WhatsNew ).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
	   
}

public void ClickonHoodies()
{
	   try {
		   driver.findElement(MensHoodie).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	
}
public void ClickonPic()
{
	   try {
		   driver.findElement(Pic).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickonSize()
{
	   try {
		   driver.findElement(Size).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickonColor()
{

	   try {
		   driver.findElement(Color).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickOnCart()
{
	   try {
		   driver.findElement(Cart).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickonMoreInfo()
{
try {
	   driver.findElement(MoreInfo).click();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception cauch :" + e.getMessage());
	   }

	   
}
public void ClickonHome()
{
	   try {
		   driver.findElement(Home).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
}
public void ClickOnSignin()
{
	   try {
	   driver.findElement(signin).click();
	   Thread.sleep(2000);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception caught :" + e.getMessage());
	   }
}
public void loginCredentials(String Enteremail, String Enterpassword)
	{
		driver.findElement(EmailinSignInPage).sendKeys(Enteremail);
		driver.findElement(PasswordinSignInPage).sendKeys(Enterpassword);
	}




}
