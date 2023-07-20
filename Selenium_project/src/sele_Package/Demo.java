package sele_Package;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_signin");
        driver.manage().window().maximize();
      /*  driver.findElement(By.cssSelector("input#ap_email")).click();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("9921873811");
        driver.findElement(By.cssSelector("input.a-button-input")).click();
        driver.findElement(By.xpath("//input[@name='password']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Niraj@12345");
        driver.findElement(By.id("signInSubmit")).click();*/
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watches for men");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i")).click();
        driver.findElement(By.linkText("Neo Iv Analog Black Dial Men's Watch-NL1805NM01/NP1805NM01")).click();
        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
       // WebElement element= driver.findElement(By.id("quantity"));
       // Select dropdown =new Select(element);
       // dropdown.selectByValue("3");
       // driver.findElement(By.xpath("//*[@id=\"quantity\"]/option[1]")).click();
       // driver.findElement(By.id("//*[@id=\"quantity\"]/option[1]")).click();
       // driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i")).click();
        
	}

}
