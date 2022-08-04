package AutomationProject.AutomationProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import dProvider.SignUpDP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {

	@Test(dataProvider = "signup",dataProviderClass = SignUpDP.class)
	public static void signup(String first_name,String last_name,String email_id,String password,String date,String mobile,String bio) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(first_name);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(last_name);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(email_id);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
		driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys(mobile);
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		String text=driver.switchTo().alert().getText();
		Assert.assertEquals("Hai,"+first_name+"! Go To SingIn", text);
	    driver.switchTo().alert().accept();
		driver.close();
		    
	}
	
}
