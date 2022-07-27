package Mindtree_May_C1.Comprehensive_Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script3 {

	public static void main(String[] args) {
		
		// Open product description page

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.get("https://tide.com/en-us");
        driver.manage().window().maximize();
        
        Actions ac=new Actions(driver);
        
        WebElement a=driver.findElement(By.xpath("//a[@data-action-detail='Shop Products']"));
        ac.moveToElement(a);
        
        WebElement b=driver.findElement(By.xpath("//div[@class='menu-item hidden-submenu']//a[@data-action-detail='Pacs']"));
        ac.moveToElement(b);
        
        ac.click().build().perform();
        
        driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
        
        driver.findElement(By.xpath("//img[@src='https://images.ctfassets.net/ajjw8wywicb3/3FhPPIHM4zvLRgWgTDbci0/ee023d1a2bd04a3ca004067e4090b95d/Tide_PODS_Spring_Renewal_listing_520x520_most_trusted.png?fm=png']")).click();
	}

}
