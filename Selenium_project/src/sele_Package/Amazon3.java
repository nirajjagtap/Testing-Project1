package sele_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/log-in/s?k=log+in");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"p_89/Adidas\"]/span/a/div/label/i")).click();
        driver.findElement(By.linkText("Mens Adistound M Running Shoe")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("quantity")).click();
        
    //   WebElement addTocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
      // addTocart.click();
       // driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).click();*/
	}

}
