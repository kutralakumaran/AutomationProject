package AutomationProject.AutomationProject;

import org.testng.annotations.Test;

import dProvider.Cont;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {
	
@Test(dataProvider = "contact",dataProviderClass = Cont.class)
public void Contact(String name,String email,String mobile,String message) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.findElement(By.xpath("//a[contains(text(),'Support')]")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> win = windows.iterator();
	String parent = win.next();
	String child = win.next();
    driver.switchTo().window(child);
    driver.findElement(By.name("name")).sendKeys(name);
    driver.findElement(By.name("email")).sendKeys(email);
    driver.findElement(By.name("phone")).sendKeys(mobile);
    driver.findElement(By.name("message")).sendKeys(message);
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.quit();
}
}
