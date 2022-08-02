package AutomationProject.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllMobiles {
@Test
public void allmobiles() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.findElement(By.xpath("//a[text()='All Mobiles']")).click();
	
}
}
