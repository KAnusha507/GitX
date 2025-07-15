import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;


public class GmailLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking Browser
		// Chrome ->  ChromeDriver  -> Methods
		// Safari ->  SafariDriver  -> Methods
		// Firefox ->  FirefoxDriver -> methods  (geckodriver invokes firefox driver)
		//WebDriver interfaces is directing to the above classes to use common methods
		//invoking chromedriver 
		//when we  use webdriver instead of chromedriver,we will not be able to access chrome specific methods 
		
		WebDriver driver=new ChromeDriver();
		//Positive LogIn test
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

		//Negative username test
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		//Negative password test
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("incorrectPassword");
		driver.findElement(By.id("submit")).click();
		
		
		//driver.close(); //close the current window
		//driver.quit(); //quits the driver,closing every associated windows
		 }

}
