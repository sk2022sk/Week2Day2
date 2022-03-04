package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		
		int xvalue = driver.findElement(By.xpath("//button[contains(text(),'Get Position')]")).getLocation().getX();
		System.out.println("The value of x:" + xvalue);
		
		int yvalue = driver.findElement(By.xpath("//button[contains(text(),'Get Position')]")).getLocation().getY();
		System.out.println("The value of y:" + yvalue);
		
		String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(buttonColor);
		
		org.openqa.selenium.Dimension dis = driver.findElement(By.xpath("//button[contains(text(),'What is')]")).getSize();
		System.out.println(dis);

	}

}
