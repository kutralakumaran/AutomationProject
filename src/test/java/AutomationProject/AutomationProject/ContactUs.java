package AutomationProject.AutomationProject;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {
	
@Test
public void Contact() {
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
    driver.findElement(By.name("name")).sendKeys("abcd");
    driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
    driver.findElement(By.name("phone")).sendKeys("9865098650");
    driver.findElement(By.name("message")).sendKeys("abcdefgh");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.quit();
}
}
