package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.an.Y;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
		WebElement logbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		logbutton.click();
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("AP");
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("deepika");
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("deeps.parthi@yahoo.com");
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("deepika");
		WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		Select drop1=new Select(dropdown1);
		drop1.selectByValue("5");
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select drop2=new Select(dropdown2);
		drop2.selectByIndex(3);
		WebElement dropdown3 = driver.findElement(By.name("birthday_year"));
		Select drop=new Select(dropdown3);
		drop.selectByVisibleText("1993");
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex']"));
		radio.click();
	}
}
		
		
		
		
		
		
		

	


