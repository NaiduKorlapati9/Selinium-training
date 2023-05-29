package selenium.jira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://selinium//Crome//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//String baseUrl = "https://www.youtube.com/";
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("Test1234");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement Submit = driver.findElement(By.name("submit"));
		Submit.click();
	}
}
