package AutomationProject.AutomationProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Order {
@Test
public void Orders() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.findElement(By.xpath("//a[contains(text(),'Support')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> win = windows.iterator();
	String parent = win.next();
	String child = win.next();
    driver.switchTo().window(child);
    driver.findElement(By.id("inputFirstName")).sendKeys("abcd");
    driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys("abcd");
    driver.findElement(By.id("inputEmail")).sendKeys("abcd@gmail.com");
    driver.findElement(By.id("inputPassword")).sendKeys("abcdefg");
	driver.findElement(By.id("flexRadioDefault1")).click();
	driver.findElement(By.xpath("//input[@placeholder='00000000000']")).sendKeys("9865098650");
	driver.findElement(By.xpath(" address1")).sendKeys("1-123");
	driver.findElement(By.xpath(" address2")).sendKeys("M.G road");
	driver.findElement(By.id("inputCity")).sendKeys("Bengaluru");
	WebElement state = driver.findElement(By.id("inputState"));	
	Select sel=new Select(state);
	sel.selectByVisibleText("Karnataka");
	driver.findElement(By.id("inputZip")).sendKeys("560023");
	driver.findElement(by.id)
}
}
