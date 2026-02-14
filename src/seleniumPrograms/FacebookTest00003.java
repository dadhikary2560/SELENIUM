package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest00003 {

	public static void m1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,\"email\")]")).sendKeys("d.adhikary2560@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("As01bp2556@");
		
		driver.findElement(By.xpath("//button[contains(@name,\"login\")]")).click();
		
	}
	public static void main(String[] args) {
	m1();
}
}
