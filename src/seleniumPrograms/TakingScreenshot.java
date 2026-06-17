package seleniumPrograms;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TakingScreenshot {
	private static void screenshotWithRobo() throws AWTException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.accuweather.com/en/in/kolkata/206690/weather-forecast/206690");
		
		Robot robo=new Robot();
		Rectangle rect=new Rectangle();
		rect.height=1920;
		rect.width=720;
		BufferedImage img= robo.createScreenCapture(rect);
//		File output=new File("output.png");
        ImageIO.write(img, "png", new File("output.png"));
        System.out.println("screenshot saved perfectly");
	}
	private static void takeScreenShotInterface() throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.accuweather.com/en/in/kolkata/206690/weather-forecast/206690");
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot1.png"));
		System.out.println("Screenshot ho geya");
	}
	
	private static void fullScreenShotWithFirefox() throws IOException {
		// TODO Auto-generated method stub
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--start-maximized");
		
		FirefoxDriver driver=new FirefoxDriver(option);
		driver.get("https://www.accuweather.com/en/in/kolkata/206690/weather-forecast/206690");
		
		File src=driver.getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("fullPageScreenshot.png"));
	}
	public static void main(String[] args) throws AWTException, IOException {
//		screenshotWithRobo();
//		takeScreenShotInterface();
		fullScreenShotWithFirefox();
}
}
