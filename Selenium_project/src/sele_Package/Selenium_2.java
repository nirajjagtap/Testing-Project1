package sele_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Selenium_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\OneDrive\\Desktop\\workspace1\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/account&member_token=cba4fd442dcb4da02d0d437b9c99acaf");
        driver.manage().window().maximize();
        /*driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
        driver.findElement(By.className("email")).click();
        driver.findElement(By.className("email")).sendKeys("jagtapniraj1997@gmail.com");
        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.className("input-password")).sendKeys("Jd@12345");
        driver.findElement(By.xpath("//*[@id=\"short-cut\"]/div[1]/div[1]/div/div[2]/h4/a")).click();
      /*  WebElement element= driver.findElement(By.id("country_id"));
        Select dropdown =new Select(element);
        dropdown.selectByVisibleText("India");
        driver.findElement(By.id("input-username")).click();
        driver.findElement(By.className("email")).click();
        driver.findElement(By.className("email")).click();
        driver.findElement(By.className("email")).click();
        driver.findElement(By.className("email")).click();
        driver.findElement(By.className("email")).click();
        //driver.manage().window().s*/
        
	}  
	

}
