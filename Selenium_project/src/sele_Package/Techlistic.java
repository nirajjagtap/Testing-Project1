package sele_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\OneDrive\\Desktop\\workspace1\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Niraj");
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Jagtap");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-1")).click();
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("8/11/1997");
        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//*[@id=\"continents\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]")).sendKeys(Keys.ENTER);
	}

}
