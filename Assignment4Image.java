package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Image {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.navigate().back();
		
	 WebElement brklink=	driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
	 if(brklink.getAttribute("naturalWidth").equals("0"))
	 {
		 System.out.println("image is broken");
		 
	 }
	 else
	 {
		System.out.println("image is not broken"); 
	 }
	
	WebElement mouseimg=driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
	
	Actions act= new  Actions(driver);
	
	act.moveToElement(mouseimg).click().build().perform();

	}

}
