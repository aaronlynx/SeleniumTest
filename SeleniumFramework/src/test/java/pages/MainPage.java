package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainPage {
	
	WebDriver driver;
	int count = 2;
	
	
	
	//objects and elements
	By role = By.xpath("//div[@class='ts-AdminPageHeader__account-username']");
	By PageTitle = By.xpath("//h1[contains(text(),\"Preview Customer's Authentication Process\")]");
	By logOut = By.xpath("//button[@class='ts-Button ts-Button--theme-link-unstyled ts-Button--medium']");
	By firstRecord = By.xpath("//tbody//tr[1]");
	By recordTitle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]");
	
	
	
	String rowsXpath = "//tr[]";
	
	
	
	
	
	//constructor
	public MainPage (WebDriver driver){
		this.driver = driver;
		
	}
	
	//methods
	public String getRole() {
		
		return driver.findElement(role).getText();
		
	}
	
	public boolean ispageTitlePresent() {
		
		try {
			driver.findElement(PageTitle).isDisplayed();
			return true;
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
			
		
	}
	
	public void clickLogout() {
		driver.findElement(logOut).sendKeys(Keys.RETURN);
		driver.switchTo().alert().accept();
		
	}
	
	public void clickFirstRecord() {
		WebElement element = driver.findElement(firstRecord);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	
	public boolean isRecordsTitlePresent() {
		
		try {
			driver.findElement(recordTitle).isDisplayed();
			return true;
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void clickFiveRecords() {
		
	}
}
