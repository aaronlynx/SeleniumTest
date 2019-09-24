package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
	
	WebDriver driver;
	int count = 2;
	
	
	
	//objects and elements
	By role = By.xpath("//div[@class='ts-AdminPageHeader__account-username']");
	By PageTitle = By.xpath("//h1[contains(text(),\"Preview Customer's Authentication Process\")]");
	By logOut = By.xpath("//button[@class='ts-Button ts-Button--theme-link-unstyled ts-Button--medium']");
	By firstRecord = By.xpath("//tbody//tr[1]");
	By recordTitle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]");
	By changePassword = By.xpath("//a[contains(text(),'Change password')]");
	By currentPassword = By.xpath("//input[@id='ts-ValidationInput-44']");
	
	
	
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
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement record;
		Actions actions = new Actions(driver);
		Boolean bool;
		int row = 1;
		int clickcount = 0;
			
		//using for loop to change the number of the row automatically
			for (int counter = 0; counter < 5; counter++)
			{
				String rowString = Integer.toString(row);
				String xpath = "//tr["+rowString+ "]";
				record = driver.findElement(By.xpath(xpath));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				wait.until(ExpectedConditions.visibilityOf(record));
				actions.moveToElement(record).click().perform();
				bool = driver.findElement(recordTitle).isDisplayed();
				if (bool == true) {
					System.out.println("Record clicked!");
					clickcount = clickcount + 1;
					driver.findElement(By.linkText("Authentications")).sendKeys(Keys.RETURN);
				}
				
				row = row + 1;
			}
	}
	
	
	
	
	public void clickChangePassword() {
		WebElement element = driver.findElement(changePassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		
	}
	
	public boolean isCurrentPasswordPresent() {
		try {
			driver.findElement(currentPassword).isDisplayed();
			return true;
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	
}
