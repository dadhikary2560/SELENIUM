package seleniumPrograms;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

    public static void dropdown() {

        ChromeDriver driver = new ChromeDriver();
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[contains(@aria-describedby,\"searchDropdownDescription\")]")));
        WebElement web = driver.findElement(By.xpath("//select[contains(@aria-describedby,\"searchDropdownDescription\")]"));
        Select select = new Select(web);
     //  select.selectByIndex(10);
     //  select.selectByValue("search-alias=beauty");

        
        List<WebElement> options=select.getOptions();
        for (WebElement webElement : options) {
			if(webElement.getText().equalsIgnoreCase("Beauty"))
			{
				System.out.println("element mil geya: "+webElement.getText());
			}
		}

        // driver.quit();
    }

    public static void main(String[] args) {

        dropdown();
    }
}