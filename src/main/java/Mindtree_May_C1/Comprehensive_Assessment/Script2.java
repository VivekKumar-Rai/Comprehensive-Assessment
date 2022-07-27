package Mindtree_May_C1.Comprehensive_Assessment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//User Sign-in

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.get("https://tide.com/en-us");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/signup/tide-coupons/']")).click();
        
        Set <String> ids=driver.getWindowHandles();
        Iterator <String> it=ids.iterator();
		String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        
        driver.findElement(By.xpath("//button[@class='underline text-primaryCta lg:text-base leading-light font-montserratSemiBold font-semibold']")).click();
        
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("vkr@gmail.com");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ABCabc123!@");
        
        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
	}

}
