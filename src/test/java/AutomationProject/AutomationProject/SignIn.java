package AutomationProject.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn extends Webdriver{
	
	WebDriver driver;
@Test
public void signin() {
    
	driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
	driver.findElement(By.name("password")).sendKeys("abcdefg");
	driver.findElement(By.xpath("//a[text()='Log In']")).click();	
	driver.close();
}
}
