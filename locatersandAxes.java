
package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatersandAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		
		// child 
		driver.findElement(By.xpath("//div [@class='container']/child::input[1]")).sendKeys("Sidd");

		// following-sibling
		driver.findElement(By.xpath("//input[@name = 'name'] /following-sibling :: input[1]")).sendKeys("Nee");
		
		//preceding-sibling
		driver.findElement(By.xpath("//td[text()='Germany']/preceding-sibling::td/child::input")).click();
		
		//preceding
		driver.findElement(By.xpath("//label[text()='Password']/preceding::input[1]")).sendKeys("sidd@123");

		//following
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("abcd@1234");
		
		//descendant
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[2]")).click();
		
	}

}



