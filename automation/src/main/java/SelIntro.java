
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) {
		//Set chromedrive path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement searchFli=driver.findElement(By.xpath("//div[contains(text(),'Flights')]"));
		searchFli.click();
		WebElement option=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]"));
		option.click();
		boolean optnSelected=option.isSelected();
		System.out.println(optnSelected);
	}

}
