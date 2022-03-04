package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[contains(text(),'Select the')]/following::div[1]/input")).click();
		boolean checkBoxSelected = driver
				.findElement(By.xpath("//label[contains(text(),'Confirm Selenium')]/following-sibling::div"))
				.isSelected();
		System.out.println("the check box is selected:" + checkBoxSelected);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'I am Selected')]/input")).click();

		Thread.sleep(7000);
		

		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Option 1')]/input"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Option 2')]/input"));
		element2.click();
		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Option 3')]/input"));
		element3.click();
		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'Option 4')]/input"));
		element4.click();
		WebElement element5 = driver.findElement(By.xpath("//div[contains(text(),'Option 5')]/input"));
		element5.click();

	}

}
