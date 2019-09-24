package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.MainPage;

public class SampleTest {

	
	WebDriver driver;
	Actions actions;
	String adminPanelLink = "https://corn-staging-stepup.truststamp.net/N20NFsfb9-admin.html";
	
	
	@BeforeTest
	public void setup() {
		
		//String projectPath =  System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	/*
	@Test(description = "Test login correct username and password")
	public void LoginCorrect() {
		
		
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		Assert.assertTrue(mainpage.ispageTitlePresent()); //checks an element inside mainpage
	}
	
	@Test(description = "Test login incorrect username but correct password")
	public void LoginIncorrectUsername() {
		
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("user");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		Assert.assertFalse(mainpage.ispageTitlePresent());//checks an element inside mainpage
		
		
	}
	
	@Test(description = "Test login correct username but incorrect password")
	public void LoginIncorrectPassword() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("abcd12345");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		Assert.assertFalse(mainpage.ispageTitlePresent());
	}
	
	@Test(description = "Test login incorrect username and password")
	public void LoginIncorrectUsernamePassword() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("user");
		logintest.setPassword("abcd12345");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		Assert.assertFalse(mainpage.ispageTitlePresent());
	}
	
	@Test(description = "Test login blank username and password")
	public void LoginBlank() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("");
		logintest.setPassword("");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		Assert.assertFalse(mainpage.ispageTitlePresent());
		//String text = String.valueOf(mainpage.ispageTitlePresent());
		//System.out.println(text);
	
	}
	

	
	@Test(description = "Click first record")
	public void ViewRecord() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		mainpage.clickFirstRecord();
		Assert.assertTrue(mainpage.isRecordsTitlePresent());
		driver.navigate().back();
		
		
	}*/
	/*
	@Test(description = "Click Change Password")
	public void ClickPassword() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		mainpage.clickChangePassword();
		
		
	}*/
	
	@Test(description = "Succesfully click 5 records")
	public void ClickFiveRecords()
	{
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		mainpage.clickFiveRecords();
		
		
	}

	
	/*
	@Test(description = "Log out")
	public void LogOut() {
		LoginPage logintest = new LoginPage(driver);
		driver.get(adminPanelLink);
		logintest.setUsername("agent");
		logintest.setPassword("4H0vk7&#RW7y");
		logintest.clickLogin();
		MainPage mainpage = new MainPage(driver);
		mainpage.clickLogout();
		Assert.assertTrue(logintest.isPageTitleVisible());
		
	}*/
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
	
}
