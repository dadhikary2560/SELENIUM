package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoQIFrame {
	public static void normalFrime() {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String s = driver.findElement(By.xpath("//h1[contains(text(),\"This is a sample page\")]")).getText();
		System.out.println(s);

		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		String s1 = driver.findElement(By.xpath("//h1[contains(text(),\"This is a sample page\")]")).getText();
		System.out.println(s1);

		driver.quit();
	}

	private static void nestedIFrame() {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		String s = driver.findElement(By.tagName("body")).getText();
//		String s = driver.findElement(By.xpath("//body[contains(text(), \"Parent frame\")]")).getText();

		driver.switchTo().frame(0);
		String s2 =driver.findElement(By.tagName("p")).getText();
//		String s2 = driver.findElement(By.xpath("//p[contains(text(), \"Child Iframe\")]")).getText();

		System.out.println(s);
		System.out.println(s2);
		
		driver.quit();
	}

	public static void main(String[] args) {

		nestedIFrame();
	}
}
