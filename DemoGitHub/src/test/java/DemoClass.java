import java.awt.Window;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void searachone() {
		driver.get("https://www.google.com/");
		driver.manage().window().setSize(new Dimension(1296, 696));
		driver.findElement(By.name("q")).sendKeys("laptops");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".bkWMgd:nth-child(1) .g:nth-child(3) .ellip")).click();
	}
}
