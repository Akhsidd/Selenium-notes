package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dominos.com/en/?utm_campaign=12899946141|c|GG|Google_BR_Brand_Top&utm_source=Google&utm_medium=p_search&utm_content=kwd-24470291|12899946141|122001614375&utm_term=dominos&matchtype=e&gad_source=1&gclid=Cj0KCQjwiuC2BhDSARIsALOVfBKlQFNIZpygbG7wAxZguypfkHDdiSBrkgv7VCHPx5BQ1vHboU_GpY0aAplLEALw_wcB");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a [@class = 'css-14js2j3'] ")).click();
		Thread.sleep(3000L);
	
		WebElement Address = driver.findElement(By.id("Type"));
		Select drpdwn = new Select(Address);
		drpdwn.selectByIndex(1);
		Thread.sleep(3000L);
		
		//To scroll page//
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // IN inspect - Console ( use command Window.ScrollBy to test )
        js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.name("LocationName")).sendKeys("Alien 51");
		driver.findElement(By.name("Street")).sendKeys("Brundhavanam Colony");
		
		driver.findElement(By.xpath("//input [@id = 'UnitNumber']")).sendKeys("7/G");
		
		driver.findElement(By.xpath("//input [@data-quid = 'PostalCode']")).sendKeys("30067");
		driver.findElement(By.id("City")).sendKeys("Marietta");
		WebElement State = driver.findElement(By.name("Region"));
		Select StateID = new Select(State);
		StateID.selectByVisibleText("GA");
		driver.findElement(By.xpath("//button [@type = 'submit']")).click();
		
//		JavascriptExecutor sc = (JavascriptExecutor)driver;
//	      sc.executeScript("window.scrollBy(0,1200)"); 
//  
//      //  driver.findElement(By.xpath(" //span [contains(text(),' Domino's Carside Delivery®")).click();
//		
		Thread.sleep(5000L);
		
	     JavascriptExecutor scw = (JavascriptExecutor)driver;
	     scw.executeScript("window.scrollBy(0,1200)");   
	      
	//Thread.sleep(1000L);
			//driver.findElement(By.xpath("//button [text() = 'ADD']")).click();
			driver.findElement(By.xpath("//button [@class = 'recent-items-card__button']")).click();


}
