package sele_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\OneDrive\\Desktop\\workspace1\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("See an example alert")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.switchTo().alert().accept();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.linkText("See a sample prompt")).click();
        driver.findElement(By.linkText("See a sample prompt")).clear();
        driver.findElement(By.linkText("See a sample prompt")).sendKeys("selenium");
        
	}

}
