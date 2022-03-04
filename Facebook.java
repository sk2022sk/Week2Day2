package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 //Click Create New Account Button
		 driver.findElement(By.xpath("//a [text() = 'Create New Account']")).click();
		 
		 //Enter First Name
		 driver.findElement(By.xpath("//div [@class ='_5dbb'][1]/input")).sendKeys("Sabari");
		 
		 //Enter Last Name
		 driver.findElement(By.xpath("(//div [@class ='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput'])[1]/input")).sendKeys("Nath");
		 
		 //Enter mobile number
		 driver.findElement(By.xpath("//div [text() ='Mobile number or email address']/following-sibling::input")).sendKeys("9876543210");
		 
		 //Enter password
		 driver.findElement(By.xpath("//div [text() ='New password']//following-sibling::input")).sendKeys("Password");
		 
		 //Handle all the three drop downs
		 WebElement elementDropdownDay = driver.findElement(By.xpath("//select [@id ='day']"));
		 Select ddDay = new Select(elementDropdownDay);
		 ddDay.selectByValue("9");
		 
		 WebElement elementDropdownMonth = driver.findElement(By.xpath("//select [@id ='month']"));
		 Select ddMonth = new Select(elementDropdownMonth);
		 ddMonth.selectByValue("7"); 

		 WebElement elementDropdownYear = driver.findElement(By.xpath("//select [@id ='year']"));
		 Select ddYear = new Select(elementDropdownYear);
		 ddYear.selectByValue("1986"); 
		 
		 //Select the radio button "Male" 
		 driver.findElement(By.xpath("//label [text() = 'Male']/following-sibling::input")).click();
		 
		 //Completed Statement
		 System.out.println("Facebook was Executed Successfully!");

	}

}
