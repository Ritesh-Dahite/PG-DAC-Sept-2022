package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	ChromeDriver driver;
	
	//to open a browser
	public void open() {
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\SDM 2\\Selenium Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");		//open
		driver.manage().window().maximize();			//maximize
		//driver.close();								//close
		//driver.quit();								//close browser and all tabs
	}
	
	public void login() {
		WebElement usnm = driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr474806");
		
		driver.findElement(By.name("password")).sendKeys("uhUnYre");		//function chaining
		
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.findElement(By.partialLinkText("Log")).click();
	}
	
	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Tony Stark");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
//		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.name("dob")).sendKeys("04/04/1965");
		driver.findElement(By.name("addr")).sendKeys("10880 Malibu Point, Florida");
		driver.findElement(By.name("city")).sendKeys("Orlando");
		driver.findElement(By.name("state")).sendKeys("Florida");
		driver.findElement(By.name("pinno")).sendKeys("32789");
		driver.findElement(By.name("telephoneno")).sendKeys("4074385389");
		driver.findElement(By.name("emailid")).sendKeys("tonystark@starkinc.com");
		driver.findElement(By.name("password")).sendKeys("Mark32");
		driver.findElement(By.name("sub")).click();
	}
	
	public static void main(String[] args) {
		Script2 s = new Script2();
		s.open();
		
		s.login();
		
		s.addCustomer();
	}
}