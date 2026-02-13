package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test00001 {
	public static void m1() {
		System.out.println("i am a static method");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chatgpt.com/");
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL is: "+currentUrl);
		
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.quit();
	}
public static void main(String[] args) {
	m1();
}
}
