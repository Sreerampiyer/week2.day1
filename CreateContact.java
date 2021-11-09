package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Sree");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title=driver.getTitle();
		System.out.println("The title = " +title);
		
		String fname=driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText();
		System.out.println("The First name is ="  +fname);
		
		driver.close();
		 
		 
		 
		 

	}

}
