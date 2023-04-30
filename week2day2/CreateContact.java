package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.className("x-panel-header")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Test");
		driver.findElement(By.id("lastNameField")).sendKeys("Leaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("A step");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ahead");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Switch to change from non-it to it");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		WebElement Storing = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select method=new Select(Storing);
		method.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Sample text");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
