package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Muthukumaran");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Jothiswaran");
		driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]")).sendKeys("812470212");
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])")).sendKeys("Password");
		WebElement Day = driver.findElement(By.xpath("(//select[contains(@name,'day')])[1]"));
		WebElement Month = driver.findElement(By.xpath("(//select[contains(@name,'month')])[1]"));
		WebElement Year = driver.findElement(By.xpath("(//select[contains(@name,'year')])[1]"));
		Select obj1=new Select(Day);
		Select obj2=new Select(Month);
		Select obj3=new Select(Year);
		obj1.selectByIndex(20);
		obj2.selectByValue("08");
		obj3.selectByVisibleText("1997");
//		Select obj1=new Select(Day, Month, Year);
//		obj1.selectByIndex(20);
//		obj1.selectByValue("08");
//		obj1.selectByVisibleText("1997");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
	}



	}


