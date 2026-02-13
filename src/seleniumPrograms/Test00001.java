package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test00001 {
	public static void m1() {
		System.out.println("i am a static method");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chatgpt.com/");		//opens chatgpt
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL is: "+currentUrl);	//prints the url in console
		
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);	//prints the title 
		
		driver.quit();
	}
public static void main(String[] args) {
	m1();
}
}
