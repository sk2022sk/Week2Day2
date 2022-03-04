package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {


		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
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
		 
		 //Click on Email
		 driver.findElement(By.xpath("//span [text() = 'Email']")).click();
		 
		 //Enter Email
		 driver.findElement(By.name("emailAddress")).sendKeys("sabari@gmail.com");
		 
		 
		 //Click find leads button
		 driver.findElement(By.xpath("//button [text() ='Find Leads']")).click();
		 
		 Thread.sleep(2000);
		 //Capture name of First Resulting lead id
		 String Lead = driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		 System.out.println(Lead);
		 
		 //Capture name of First Resulting lead First Name
		 String leadFirstName = driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		 System.out.println(leadFirstName);
		 
		 Thread.sleep(2000);
		 //Click First Resulting lead
		 driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		 
		 //Click Duplicate Lead
		 driver.findElement(By.xpath("//a [text() = 'Duplicate Lead']")).click();
		 
		 //Verify the title as 'Duplicate Lead'
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 if (title.contains("Duplicate Lead") == true) {
			 System.out.println("The title is verified as 'Duplicate Lead' ");
		 }
		 
		 //Click Create Lead
		 driver.findElement(By.xpath("//input [@class ='smallSubmit']")).click();
		 
		 //Confirm the duplicated lead name is same as captured name
		 String duplicateLeadName = driver.findElement(By.xpath("(//span [text() ='First name']/following::span)[1]")).getText();
		 System.out.println(duplicateLeadName);
		 
		 if (duplicateLeadName.contains(leadFirstName) == true) {
			 System.out.println("The duplicated lead name : " +duplicateLeadName +" is same as captured name : " +leadFirstName);
		 }
		 
		 //Close the browser (Do not log out)
		 driver.close();

	}

}
