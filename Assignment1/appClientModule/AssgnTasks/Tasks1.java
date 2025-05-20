package AssgnTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanir\\Desktop\\New folder\\softwares for testing\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1. Search the elements by name and by link text
		driver.findElement(By.name("email")).sendKeys("A1@gmail.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//`
		
		
	}

}
