package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadDelete {

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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String Text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(Text);
		driver.findElement(By.xpath("//a[contains(text(),'kkk')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String text2 = driver.findElement(By.className("x-paging-info")).getText();
		if(text2!=null)
		{
			System.out.println("No records to display");
		}
		else
		{
			System.out.println("Record still exists");
		}
		driver.close();

	}

}
