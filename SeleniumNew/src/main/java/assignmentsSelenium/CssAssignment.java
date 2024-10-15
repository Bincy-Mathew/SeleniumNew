package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://amazon.in");
	     driver.manage().window().maximize();
	     WebElement SearchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	     SearchBox.sendKeys("Laptop");
	     
	}

}
