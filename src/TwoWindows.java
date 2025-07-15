import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class TwoWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open first website
        driver.get("https://www.google.com");

        // Open new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Open second website
        driver.get("https://www.bing.com");
    }
}
