package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Homepage;
import Objects.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods {
	WebDriver driver;
	Locators objrepo;
	Homepage objrepo2;
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}

	
	@Test(priority = 1)
	public void Account() {
		objrepo=new Locators(driver);
		objrepo.ClickonAccountLink();
	}
	
	@Test(priority = 2)
	public void FillAccountDetails()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonFirstname("Srinivas");
		objrepo.ClickonLastname("Dheeraj");
		objrepo.EnterEmail("dheeraj.srinivas18@gmail.com");
		objrepo.EnterPassword("Dheeraj@2510");
		objrepo.EnterPasswordAgain("Dheeraj@2510");
		objrepo.ClickonSubmit();
	}
	@Test(priority = 3)
	public void WhatsNew()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonWhatsNew();
	}
	@Test(priority = 4)
	public void Hoodies()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonHoodies();
	}
	@Test(priority = 5)
	public void ClickPic()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonPic();
	}
	
	@Test(priority = 6)
	public void SeSize()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonSize();
	}
	@Test(priority = 7)
	public void SeColor()

	{
		objrepo=new Locators(driver);
		objrepo.ClickonColor();
	}
	@Test(priority = 8)
	public void AddCart()
	{
		objrepo=new Locators(driver);
		objrepo.ClickOnCart();
		
	}
	@Test(priority = 9)
	public void ClickMoreInfo()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonMoreInfo();
	}
	@Test(priority = 10)
	public void GoHome()
	{
		objrepo=new Locators(driver);
		objrepo.ClickonHome();
	}
	@Test(priority = 11)
	public void search()
	{
		objrepo2=new Homepage(driver);
		objrepo2.SearchinHomepage("T-Shirt");
	}
	@Test(priority = 12)
	public void Sort()
	{
		objrepo2=new Homepage(driver);
		objrepo2.SortDropdown();
	}
	@Test(priority = 13)
	public void ShowDrop()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ShowDropdown();
	}
	@Test(priority = 14)
	public void CartClick()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnCart();
	}
	@Test(priority = 15)
	public void AcrendingOrder()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickonAscArrow();
	}
	@Test(priority = 16)
	public void ClickShort()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnShortBlue();
	}
	@Test(priority = 17)
	public void ItemGrid()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnItemsGrid();
	}
	
	@Test(priority = 18)
	public void CategoryCl()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnCategory();
	}
	@Test(priority = 19)
	public void Sale()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnSale();
	}
	@Test(priority = 20)
	public void Stle()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnStyle();
	}
	@Test(priority = 21)
	public void Luggage()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnLuggage();
	}
	@Test(priority = 22)
	public void ForwardArrow()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnForwardArrow();
	}
	@Test(priority = 23)
	public void BackwardArrow()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnBackwardArrow();
	}
	@Test(priority = 24)
	public void clickBagging()
	{
		objrepo2=new Homepage(driver);
		objrepo2.ClickOnBagging();
	}
	@Test(priority = 25)
	public void HomepageafteraddingItemtoCart()
	{
		objrepo2=new Homepage(driver);
		objrepo2.GoHomepage();
	}
	@Test(priority = 26)
	public void Signin()
	{
		objrepo=new Locators(driver);
		objrepo.ClickOnSignin();		
	}
	
	
	
	@Test(priority = 27)
	public void login()
	{
		objrepo=new Locators(driver);
		objrepo.loginCredentials("dheeraj.srinivas18@gmail.com", "Dheeraj@2510");
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
