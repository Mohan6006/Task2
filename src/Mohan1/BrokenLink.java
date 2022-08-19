package Mohan1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
	    System.out.println(links.size());
	    for (int i = 0; i < links.size(); i++); {
	    String Attribute =links.get(i); getattribute 
			
		}

	}

}
