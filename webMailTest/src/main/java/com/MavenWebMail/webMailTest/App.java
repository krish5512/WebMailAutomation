package com.MavenWebMail.webMailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
	
    public void launchBrowser()
    {
 	   System.setProperty("webdriver.chrome.driver","C:\\Users\\krk55\\Desktop\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
    	driver.get("https://webmail.qainfotech.com:8443/");
    }
    public void closeBrowser()
    {
    	driver.quit();
    }
	public void enterCredentials() {
driver.findElement(By.id("username")).sendKeys("prkrishnakumar");
driver.findElement(By.id("password")).sendKeys("Krishna@321#");
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
	}
	public void newMail() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("zb__NEW_MENU_title")).click();
		driver.findElement(By.id("zv__COMPOSE-1_to_control")).sendKeys("prkrishnakumar@qainfotech.com");
		driver.findElement(By.id("zv__COMPOSE-1_to_control")).sendKeys(Keys.RETURN);
		driver.findElement(By.id("zv__COMPOSE-1_subject_control")).sendKeys("Test Mail");
		driver.switchTo().frame("ZmHtmlEditor1_body_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("HEllo this is a test generated message");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("zb__COMPOSE-1__SEND_title")).click();		
		
	}
}
