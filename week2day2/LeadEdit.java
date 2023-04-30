package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadEdit {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("murugan");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'murugan')]")).click();
		String Originaltitle = driver.getTitle();
		if (Originaltitle.contains("View Lead | opentaps CRM")) {
			System.out.println("The title is "+Originaltitle);

		} else {
			System.out.println("The title is false");
		}
		driver.findElement(By.linkText("Edit")).click();
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		System.out.println(text);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updated Company23");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		//String text2 = driver.findElement(By.xpath("(//span[contains(@class,'requiredField')])[1]")).getText();
		System.out.println(text2);
		if(text==text2)
		{
			System.out.println("Updated");
		}
		else
		{
			System.out.println("Not updated");		}
		driver.close();

	}

}
