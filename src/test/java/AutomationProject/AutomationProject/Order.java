package AutomationProject.AutomationProject;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Order {
@Test
public void Orders() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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
	driver.findElement(By.id(" address1")).sendKeys("1-123");
	driver.findElement(By.id("address2")).sendKeys("M.G road");
	driver.findElement(By.id("inputCity")).sendKeys("Bengaluru");
	WebElement state = driver.findElement(By.id("inputState"));	
	Select sel=new Select(state);
	sel.selectByVisibleText("Karnataka");
	driver.findElement(By.id("inputZip")).sendKeys("560023");
	driver.findElement(By.xpath("//*[@rel='apple']")).click();
	driver.findElement(By.xpath("//*[@rel='samsung']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//input[@rel='apple']")).isSelected());
	WebElement iphone = driver.findElement(By.xpath("(//select[@class='multi_select'])[3]"));
	Select seli=new Select(iphone);
	seli.selectByVisibleText("Apple 13 ");
	driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("2");
	WebElement newcustomer = driver.findElement(By.id("bought"));
	Select selii=new Select(newcustomer);
	selii.selectByValue("0");
	driver.findElement(By.id("gridCheck1")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
	Thread.sleep(1000);
	String order_messagedriver = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	System.out.println(order_messagedriver);
	Assert.assertEquals(order_messagedriver,"Your Order has been Placed Successfully!\nHappy Shopping.........");
}
}
