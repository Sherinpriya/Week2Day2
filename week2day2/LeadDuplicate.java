package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadDuplicate {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("heelo@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("(//div[contains(@class,'firstName')]/a)[2]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[contains(@class,'firstName')]/a)[2]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
		String title2 = driver.getTitle();
		
		if(title2.contains("Duplicate Lead")) {
			System.out.println("Title is verified");
			
		}
		else
		{
			System.out.println("Title mismatches");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(text2==text)
		{
			System.out.println("The duplicated lead name is same as captured name");
		}
		else {
			System.out.println("The duplicated lead name is not same as captured name");
		}	
		driver.close();

	}

}
