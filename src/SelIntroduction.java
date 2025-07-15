import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelIntroduction {

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
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); //close the current window
		//driver.quit(); //quits the driver,closing every associated windows
		 }

}
