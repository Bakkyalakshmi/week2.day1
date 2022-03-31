package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadas {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DemoCSR");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bakkyalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Baks");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi Hello!");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bakkylakshmik@yahoo.com");
		WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleDropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement findElement = driver.findElement(By.id("updateLeadForm_description"));
		findElement.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
