package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFourEdit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// To Get Title
		
		System.out.println("The Title is:" +driver.getTitle());
		
		//To Get URL
		
		System.out.println("The URL is "+driver.getCurrentUrl());
		
		// To Get Source Code
		
		System.out.println("The SourceCode is "+driver.getPageSource());
		
		//Get the Attribute Value of "Get default text entered"
		
		driver.findElement(By.id("email")).sendKeys("sabari@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append']")).sendKeys("Appending Text");
		
		@SuppressWarnings("unused")
		String Attributevalue = driver.findElement(By.xpath("//input='username']")).getAttribute("value");
		System.out.println(Attributevalue);
		
		driver.findElement(By.xpath("//input[@value='clear me']")).clear();
		
		boolean bool = driver.findElement(By.xpath("//label[contains(text(),'Confirm that')]/following::input")).isEnabled();
		System.out.println("The Field is Enabled:" + bool);
		
		
		 //driver.findElement(By.xpath("//h5 [text() = 'Edit']")).click();
		 //System.out.println(driver.findElement(By.xpath("(//input [@name = 'username'])[1]")).getAttribute("value"));
		 

		//Get URL
		 
		 //driver.get("http://testleaf.herokuapp.com/");
			 
		 
		//Get Link name
		 
		// driver.findElement(By.xpath("//h5 [text() = 'HyperLink']")).click();
		 //System.out.println(driver.findElement(By.xpath("//a [text() = 'Find where am supposed to go without clicking me?']")).getAttribute("href"));
		
		//Get URL
		 
		// driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		 
		 Thread.sleep(2000);
		
		//Driver Close
		
		driver.close();
		
		
		
		
		
		

	}

}
