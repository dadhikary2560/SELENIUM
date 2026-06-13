package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_implicit_explicit {
	public static void implicit() {
		// TODO Auto-generated method stub
		//findElements findelements top me
		//60sec
		//1-500ms | 500-1000-------6000ms
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options option=driver.manage();		//driver.manage returns Options interface instance
		Timeouts t=option.timeouts();				//timeout method is from Options interface
		t.implicitlyWait(Duration.ofSeconds(10));	//implicit method of timeouts interface
		driver.findElement(By.xpath("//a[contains(text(),\"Sign in securely\")]")).click();
	}
	
	public static void implicit2() {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://helloskillio.com/implicit-wait-demo-assignment/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e= driver.findElement(By.xpath("//input[@placeholder=\"Enter your name\"]"));
		e.sendKeys("Manish");
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
	}
	public static void explicit() {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://helloskillio.com/implicit-wait-demo-assignment/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement e= driver.findElement(By.xpath("//input[@placeholder=\"Enter your name\"]"));
		e.sendKeys("Manish");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Submit\"]"))).click();
//		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();

	}
public static void main(String[] args) {
	explicit();
}
}
