package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		 
		 //Enter User name
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 
		 //Enter Password
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 
		 //Click on Login Button
		 WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		 elementLoginButton.click();
		 
		 //Click on CRMSFA
		 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 
		 //Click on Leads
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 
		 //Click Find leads
		 driver.findElement(By.xpath("//a [text() = 'Find Leads']")).click();
		 
		 //Click on Phone
		 driver.findElement(By.xpath("//span [text() = 'Phone']")).click();
		 
		 //Enter phone number
		 driver.findElement(By.xpath("//input [@name = 'phoneCountryCode']")).clear();
		 driver.findElement(By.xpath("//input [@name = 'phoneCountryCode']")).sendKeys("1");
		 driver.findElement(By.xpath("//input [@name = 'phoneAreaCode']")).clear();
		 driver.findElement(By.xpath("//input [@name = 'phoneNumber']")).clear();
		 
		 //Click find leads button
		 driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		 
		 Thread.sleep(2000);
		 //Capture lead ID of First Resulting lead
		 WebElement elementLeadId = driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		 String text = elementLeadId.getText();
		 System.out.println(text);
		 
		 Thread.sleep(2000);
		 //Click First Resulting lead
		 driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();

		 //Click Delete
		 driver.findElement(By.xpath("//a [@class = 'subMenuButtonDangerous']")).click();
		 
		//Click Find leads
		 driver.findElement(By.xpath("//a [text() = 'Find Leads']")).click();
		 
		 //Enter captured lead ID
		 driver.findElement(By.xpath("(//div [@class = 'x-form-element'])[18]/input")).sendKeys(text);
		 
		 //Click find leads button
		 driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		 
		 //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		 String text2 = driver.findElement(By.xpath("//div [text() = 'No records to display']")).getText();
		 
		 if (text2.contains("No records to display") == true) {
		 System.out.println("The message \"No records to display\" in the Lead List . This message confirms the successful deletion.");
		 }
		 
		 //Close the browser (Do not log out)
		 driver.close();
		

	}

}
