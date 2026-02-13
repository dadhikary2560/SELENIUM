package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test00002 {

	public static void m1() throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://chatgpt.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);						//wait 2 second before opening next
		
		driver.findElement(By.xpath("//div[contains(text(), \"Log in\")]")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
	m1();
}
}
