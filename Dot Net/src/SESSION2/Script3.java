package SESSION2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	
	ChromeDriver driver;
	
	//to open a browser
	public void open() {
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\SDM 2\\Selenium Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.close();
//		driver.quit();
	}
	
	public void login() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
		
		driver.findElement(By.name("email")).sendKeys("9767687804");
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.name("password")).sendKeys("Dahite@9767");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	public void search() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Laptop");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
	}
	
	public void filter() {
		driver.findElement(By.linkText("ASUS")).click();
		driver.findElement(By.linkText("AMD Ryzen 7")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	}
	
	public void quit() {
		driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		Script3 s = new Script3();
		s.open();
		s.login();
		s.search();
		s.filter();
//		s.quit();
	}
}