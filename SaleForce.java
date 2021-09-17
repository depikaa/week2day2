package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("deep");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='UserLastName']"));
		lastname.sendKeys("parthiban");
		
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("testleaf123@gmail.com");
		
		WebElement jobtitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select job = new Select(jobtitle);
		job.selectByVisibleText("Sales Manager");
		
		WebElement cmpname = driver.findElement(By.xpath("//input[@name='CompanyName']"));
		cmpname.sendKeys("testleaf");
		
		WebElement emop = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select drop2 = new Select(emop);
		drop2.selectByValue("9");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='UserPhone']"));
		phone.sendKeys("9941646436");

		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select drop3 = new Select(country);
		drop3.selectByVisibleText("United States");
		WebElement box = driver.findElement(By.xpath("//div[@class='checkbox-ui']"));
		box.click();

	}
}
