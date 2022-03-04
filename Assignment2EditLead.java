package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment2EditLead {

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
		 
		 //Enter first name
		 driver.findElement(By.xpath("//input [@name = 'firstName']")).sendKeys("sabari1");
		 
		 //Click Find leads button
		 driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		 
		 Thread.sleep(2000);
		 //Click on first resulting lead
		 driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		 
		 //Verify title of the page
		 System.out.println(driver.getTitle());
		 
		 //Click Edit
		 driver.findElement(By.xpath("//a [text() = 'Edit']")).click();
		 
		 //Change the company name
		 driver.findElement(By.xpath("//input [@id = 'updateLeadForm_companyName']")).clear();
		 String companyNamechange = "UAE Petroleum";
		 driver.findElement(By.xpath("//input [@id = 'updateLeadForm_companyName']")).sendKeys(companyNamechange);
		 
		 //Click Update
		 driver.findElement(By.xpath("(//input [@class = 'smallSubmit'])[1]")).click();
		 
		 //Confirm the changed name appears
		 String upatedCompanyName = driver.findElement(By.xpath("(//span [text() = 'Company Name']/following::span)[1]")).getText();
		 
		 if (upatedCompanyName.contains(companyNamechange) == true) {
			 System.out.println("The changed Company Name " +companyNamechange +" is confirmed");
		 }
		 
		 
		 //Close the browser (Do not log out)
		 driver.close();
	}

}
