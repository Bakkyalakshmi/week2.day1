package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
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
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DemoCSR");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anif");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 driver.findElement(By.name("submitButton")).click();
		 String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text);
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		// WebElement elementDropdown - driver.findElement(By.id("dropdown"))
		 driver.close();
	}

}
