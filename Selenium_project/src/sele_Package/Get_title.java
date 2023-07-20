package sele_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_signin");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        String url=driver.getCurrentUrl();
        System.out.println("URL =" +url);
        
        String title = driver.getTitle();
        if(title.equals("Your Account")) {
        	System.out.println("passed");
        }
        else {
        	System.out.println("fail");
        }
	}

}
