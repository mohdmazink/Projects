package samplePackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MedlabClass {
	
	WebDriver driver;
	
  @Test (priority = 1)
  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://43.225.54.129/medlab/demo/");
	  
	  driver.findElement(By.name("userid")).sendKeys("demo");
	  
	  driver.findElement(By.name("password")).sendKeys("demo1212");
	  
	  driver.findElement(By.name("Login")).click();
  }
  @Test (priority = 2)
  public void billentry() {
	  
	  driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	  
	  driver.findElement(By.name("Patient")).sendKeys("kdfbhv");
	  
	  driver.findElement(By.name("Address")).sendKeys("fegege");
	  
	  driver.findElement(By.xpath("//*[@id=\"BillEntryForm\"]/div[8]/div[6]/input[4]")).click();
	  
  }
}
