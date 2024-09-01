package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkNDchechoxNDradiobox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akhil/Downloads/Democode.html");
		
			
//TASK 1													   			// SEE if its checked or not and if not then select the check Box
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox' and @value = 'option2' ]"));
		
		System.out.println("Checkbox is selcted? : " +Checkbox.isSelected()); 	// should be false since its not selected //
		
		Boolean Status = Checkbox.isSelected();
		
		if( !Status ) 															//if status is false it check the box
		{
			Checkbox.click();
			System.out.println("Checkbox is selcted? : " + Checkbox.isSelected()); 
		}
		
//Task 2 // We gonna list all the radio elements and then select the one we want in the list 
		List <WebElement> RadioButton = driver.findElements(By.xpath("//input[@type = 'radio']"));	
		
		for (int i = 0 ; i<RadioButton.size();i++)
		{
		String value = RadioButton.get(i).getAttribute("value");
			if( value.contentEquals("radio3"))
			{
				RadioButton.get(i).click();
				System.out.println("RadioButton is selcted"); 
		   break;
			}		
		}
		
		driver.findElement(By.linkText("Facebook")).click();
	
	}

}
