package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.manage().window().maximize();
		driver.findElement(By.id("form-group--1")).sendKeys("SiddBond007@mindmax.com");
		driver.findElement(By.name("password")).sendKeys("forgetpassword");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//otherway of button type =  driver.findElement(By.xpath("//button[text()='Submit']"));//
		
	}
}