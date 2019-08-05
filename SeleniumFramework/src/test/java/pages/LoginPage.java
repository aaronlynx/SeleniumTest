package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	
	//Objects or Elements
	By textUser = By.id("ts-ValidationInput-20");
	By textPassword = By.id("ts-ValidationInput-22");
	By loginBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]");
	By pageTitle = By.xpath("//h1[contains(text(),'Login to Synchrony Administration Panel')]");
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//methods
	public void setUsername(String username) {
		driver.findElement(textUser).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(textPassword).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).sendKeys(Keys.RETURN);
	}
	
	public boolean isPageTitleVisible() {
		//return driver.findElement(pageTitle).isDisplayed();
		Boolean isPresent = driver.findElements(pageTitle).size()>0;
		return isPresent;
		
	}
}
