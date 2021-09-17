package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUIPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://acme-test.uipath.com/login");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
String title=driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("Log Out")).click();
driver.close();
}

}
