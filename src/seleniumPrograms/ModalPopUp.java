package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ModalPopUp {
	
	public static void modalPop() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://helloskillio.com/assignment/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,780)");
		
		driver.findElement(By.xpath("//a[contains(@href,\"https://helloskillio.com/modal-popup-assignment/\")]")).click();
		driver.findElement(By.xpath("//button[text()=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Username\")]")).sendKeys("Dev");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter Password\")]")).sendKeys("12345");
		WebElement e=driver.findElement(By.xpath("//select[contains(@name,\"role\")]"));
		Select select=new Select(e);
		select.selectByIndex(2);
//		select.getFirstSelectedOption().click();
		String value=select.getFirstSelectedOption().getText();
		
		js.executeScript("window.scrollBy(0,780)");

		Thread.sleep(100);
		driver.findElement(By.xpath("//button[contains(text(),\"Close\")]")).click();
		System.out.println("value is: "+value);
	}
public static void main(String[] args) throws InterruptedException {
	modalPop();
}
}
