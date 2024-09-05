package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akhil/Downloads/table.html");
		
//		WebElement table  = driver.findElement(By.xpath("//table [@ border ='1']"));
//		rowcount = driver.findElement(By.tagName("tr")).getSize();
		// Locate the table element
		WebElement table = driver.findElement(By.xpath("/html/body/table"));

		List < WebElement> rowlist = table.findElements(By.tagName("tr"));
		int rowsize = rowlist.size();
		System.out.println("Size of row: "+ rowsize);
        
		 //USED FLAG to stop LOOP:  if the target cell is found
		boolean flag = false;
		
		for ( int row = 0; row < rowsize; row++)
		{
			WebElement presentrow = rowlist.get(row);
			
			List < WebElement> columnlist = presentrow.findElements(By.tagName("td"));
			int columnsize = columnlist.size();

			   
			System.out.println("number of columns in present row " + row +" is: "+ columnsize +"");

			for (int column =0; column < columnsize; column++) // 0 ; 0<3 ; 0++ // 1 ; 1<3; 1++//
			
			{
				String Text = columnlist.get(column).getText();
				if(Text.trim().equals("Italy"))
				{
					System.out.println( "Present row and column  " + row + ", " + column + " ") ;
					flag =true;
					
				}
			}
			
			if (flag)
			{
				break;
			}
		}
		
	}
}
