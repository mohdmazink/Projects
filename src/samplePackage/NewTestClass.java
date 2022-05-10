package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestClass {
	
	WebDriver driver;
  @Test(priority = 1)
  public void f() {
	System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.co.in");
		driver1.findElement(By.name("q")).sendKeys("flowers");
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.findElement(By.name("btnK")).click();
	}
	
	@Test(priority = 2)
	public void test2() {
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.co.in");
		driver2.findElement(By.name("q")).sendKeys("rain");
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver2.findElement(By.name("btnK")).click();
	}
	@Test(priority = 3)
	public void test3() {
		
		ChromeDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("http://demo.guru99.com/v3/");
		driver3.findElement(By.name("uid")).sendKeys("mngr343174");
		driver3.findElement(By.name("password")).sendKeys("EsevYqy");
		driver3.findElement(By.name("btnLogin")).click();
	}
	@Test(priority = 4)
	public void test4() {
		
		ChromeDriver driver4 = new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.get("http://demo.medlablive.in");
		driver4.findElement(By.name("userid")).sendKeys("demo");
		driver4.findElement(By.name("password")).sendKeys("demo1212");
		driver4.findElement(By.name("Login")).click();
  }
}
