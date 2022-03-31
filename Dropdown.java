package week2.day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement eleDropdown = driver.findElement(By.id("dropdown"));
		Select dd = new Select(eleDropdown);
		dd.selectByVisibleText("Selenium");
		
		List <WebElement> options = dd.getOptions();
		int size = dd.getOptions().size();
		dd.selectByIndex(size-2);
		WebElement selected = dd.getFirstSelectedOption();
		System.out.println(selected);
		
	}

}
