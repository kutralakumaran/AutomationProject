package AutomationProject.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {

	@Test
	public static void signup() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10202020");
		driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9856098560");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("abcdefghijk");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	    
	}
	
}
