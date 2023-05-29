package selenium.jira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E://selinium//Crome//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.orangehrm.com/en/orangehrm-30-day-trial";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement name = driver.findElement(By.name("subdomain"));
		name.sendKeys("Test1234");
		WebElement name1 = driver.findElement(By.name("Name"));
		name1.sendKeys("Naidu");
		WebElement name2 = driver.findElement(By.name("Email"));
		name2.sendKeys("naidu@9");
		WebElement name3 = driver.findElement(By.name("Contact"));
		name3.sendKeys("123456");
		WebElement name4 = driver.findElement(By.name("Country"));
		name4.sendKeys("India");


	}

}
