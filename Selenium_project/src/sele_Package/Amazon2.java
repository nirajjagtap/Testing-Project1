package sele_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/log-in/s?k=log+in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[4]/a/span[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[3]/div/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[5]/a/span[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).click();
	}

}
