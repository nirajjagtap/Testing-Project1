package sele_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Restful_Booker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\OneDrive\\Desktop\\workspace1\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://automationintesting.online/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).sendKeys("Jack");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("jack123@gmail.com");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("919876543210");
        driver.findElement(By.id("subject")).click();
        driver.findElement(By.id("subject")).sendKeys("Restful Booker");
        driver.findElement(By.id("description")).click();
        driver.findElement(By.id("description")).sendKeys("hello Restful Booker");
        driver.findElement(By.id("submitContact")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/span[1]/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[3]/button")).click();
        driver.findElement(By.cssSelector("input[placeholder=Firstname]")).click();
        driver.findElement(By.cssSelector("input[placeholder=Firstname]")).sendKeys("jack");
        driver.findElement(By.cssSelector("input[placeholder=Lastname]")).click();
        driver.findElement(By.cssSelector("input[placeholder=Lastname]")).sendKeys("Jone");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div[2]/div[3]/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div[2]/div[3]/div[3]/input")).sendKeys("jack123@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder=Phone]")).click();
        driver.findElement(By.cssSelector("input[placeholder=Phone]")).sendKeys("919876543210");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div[2]/div[3]/button[1]")).click();
	}

}
