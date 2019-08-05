package browsertest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {

	public static void main(String[] args) {
		
		//setting project path
		String projectPath = System.getProperty("user.dir");
		
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		
		//IE
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//Edge
		//System.setProperty("webdriver.edge.driver", projectPath+"/drivers/edgedriver/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		
		driver.get("https://corn-dev-stepup.truststamp.net/N20NFsfb9-admin.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ts-ValidationInput-20")).sendKeys("agent");
		driver.findElement(By.id("ts-ValidationInput-22")).sendKeys("3H9vk6&#RW6y");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]")).sendKeys(Keys.RETURN);;
		
		/*driver.findElement(By.xpath("//button[@class='ts-Button ts-Button--theme-link-unstyled ts-Button--medium']")).sendKeys(Keys.RETURN);;
		driver.switchTo().alert().accept();
		Boolean title = driver.findElement(By.xpath("//h1[contains(text(),'Login to Synchrony Administration Panel')]")).isDisplayed();
		System.out.println(String.valueOf(title)); */
		
		
		WebElement record1;
		Actions actions = new Actions(driver);
		Boolean bool;
		int row = 2;
		
					for (int counter = 0; counter < 5; counter++)
					{
						
						String rowsString = Integer.toString(row);
						String xpath = "//tr["+rowsString+ "]";
						record1 = driver.findElement(By.xpath(xpath));
						wait.until(ExpectedConditions.visibilityOf(record1));
						actions.moveToElement(record1).click().perform();
						bool = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]")).isDisplayed();
						if (bool = true) {
							System.out.println("Record clicked!");
							driver.findElement(By.linkText("Authentications")).sendKeys(Keys.RETURN);
							}
					
						row = row + 1;
						
					}
		
		
					/*
					int i = 0;
					while (i < 5) {
						record1 = driver.findElement(By.xpath(xpath));
						wait.until(ExpectedConditions.visibilityOf(record1));
						actions.moveToElement(record1).click().perform();
						bool = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]")).isDisplayed();
						if (bool = true) {
							System.out.println("Element is present");
							driver.findElement(By.linkText("Authentications")).sendKeys(Keys.RETURN);
							
						}
					row = row + 1;
					rowsString = Integer.toString(row);
					xpath = "//tr["+rowsString+ "]";
					i++;
					}*/
					
					actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Change password')]"))).click().perform(); //click change password
					
					
					
					
					
					
					
					
					//driver.close();
		
		
		
		
	}

}
