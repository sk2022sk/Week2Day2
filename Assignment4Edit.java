package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Edit {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("Sabari@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("appending text");
		
		String Attributevalue = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println(Attributevalue);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		boolean b = driver.findElement(By.xpath("//label[contains(text(),'Confirm that')]/following::input")).isEnabled();
		System.out.println("The Field is Enabled:" + b);

	}

}
