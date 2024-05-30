package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Repository 
	By Search=By.xpath("//input[@name='q']");
	By Sort=By.xpath("//div[@class='column main']//div[1]//div[3]//select[1]");
	By ViewPage =By.xpath("//div[@class='columns']//div[3]//div[2]//div[1]//select[1]");
	By Cart=By.xpath("//a[@class='action showcart']");
	By AscDescArrow=By.xpath("//body/div[@class='page-wrapper']/main[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='search results']/div[1]/div[3]/a[1]");
	By HoodieOrBlue=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/img");
	By ItemsGrid=By.xpath("//div[@class='column main']//div[1]//div[1]//strong[2]");
	By Category =By.xpath("//div[normalize-space()='Category']");
	By Sale =By.xpath("//a[@id='ui-id-8']//span[contains(text(),'Sale')]");
	By Bags=By.xpath("//a[contains(text(),'Bags')]");
	By Style=By.xpath("//div[normalize-space()='Style']");
	By Luggage=By.xpath("//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[2]//a[1]");
	By ForwardArrow=By.xpath("//div[4]//div[2]//ul[1]//li[3]//a[1]");
	By BackwardArrow=By.xpath("//div[4]//div[2]//ul[1]//li[1]//a[1]");
	By Baging=By.xpath("//img[contains(@alt,'Strive Shoulder Pack')]");
	By Homefrompage=By.xpath("//a[@title='Go to Home Page']");
	   
	   public void SearchinHomepage(String S)
	   {
		   try {
		   driver.findElement(Search).sendKeys(S);
		   driver.findElement(Search).sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   }
		   catch (Exception e)
		   {
			   System.out.println("Exception Caught:" + e.getMessage());
		   }
	   }
	   
	   public void SortDropdown()
	   {
		   try
		   {
			 WebElement drop= driver.findElement(Sort) ;
			 Select Dropdown=new Select(drop);
			 Dropdown.selectByVisibleText("Relevance");
			 Thread.sleep(2000);
			 
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception caught :" + e.getMessage());
		   }
	   }
	   public void ShowDropdown()
	   {
		   try
		   {
			  WebElement ShowP=driver.findElement(ViewPage) ;
			  Select ShowPages= new Select(ShowP);
			  ShowPages.selectByVisibleText("");
			  Thread.sleep(2000);
			  
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception caught :" + e.getMessage());
		   }
	   }

	 public void ClickOnCart()
	 {
		 try
		 {
			 driver.findElement(Cart).click();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception caught :" + e.getMessage());
		 }
	 }
	 
	 public void ClickonAscArrow()
	 {
		 try
		 {
			 driver.findElement(AscDescArrow).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnShortBlue()
	 {
		 try
		 {
			 driver.findElement(HoodieOrBlue).click();
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 
	 public void ClickOnItemsGrid()
	 {
		 try
		 {
			 driver.findElement(ItemsGrid).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnCategory()
	 {
		 try
		 {
			 driver.findElement(Category).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnSale()
	 {
		 try
		 {
			 driver.findElement(Sale).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }


	 public void ClickOnStyle()
	 {
		 try
		 {
			 driver.findElement(Luggage).click();
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnLuggage()
	 {
		 try
		 {
			 driver.findElement(Luggage).click();
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnForwardArrow()
	 {
		 try
		 {
			 driver.findElement(ForwardArrow).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnBackwardArrow()
	 {
		 try
		 {
			 driver.findElement(BackwardArrow).click();
			 Thread.sleep(2000);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void ClickOnBagging()
	 {
		 try
		 {
			 driver.findElement(Baging).click();
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }
	 public void GoHomepage()
	 {
		 try
		 {
			 driver.findElement(Homefrompage).click();
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception caught:"+ e.getMessage());
		 }
	 }

}
