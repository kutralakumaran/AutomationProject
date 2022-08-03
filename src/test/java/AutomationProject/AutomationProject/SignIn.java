package AutomationProject.AutomationProject;

import org.testng.annotations.Test;


import dProvider.SignInDP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn extends Generic{
	

@Test(dataProvider="mobile",dataProviderClass = SignInDP.class)
public void signin(String username,String password) {
	/*
	 * System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 * WebDriver driver=new ChromeDriver();
	 * driver.get("https://mobileworld.azurewebsites.net/");
	 */
	driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//a[text()='Log In']")).click();	
	driver.close();
}
}
