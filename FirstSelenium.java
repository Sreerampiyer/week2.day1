package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sree");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		 driver.findElement(By.name("submitButton")).click();
		 
		 String title= driver.getTitle();
		 System.out.println("The titleis" +title);
		 
		 String text1=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println("Company name" +text1);
		 String text2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println("Fname" +text2);
		 String text3=driver.findElement(By.id("viewLead_lastName_sp")).getText();
		 System.out.println("Lname is" +text3);
		 
		 driver.close();
		 
		 
		 
		 

	}

}
