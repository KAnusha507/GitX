import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessLogin {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);
}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;
List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
for(int i=0;i<products.size();i++)
{
//Brocolli - 1 Kg
//Brocolli,    1 kg
String[] name=products.get(i).getText().split("-");
String formattedName=name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
List itemsNeededList = Arrays.asList(itemsNeeded);
if(itemsNeededList.contains(formattedName))

{
j++;
//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
if(j==itemsNeeded.length)

{
break;

}
}
}
}
}



