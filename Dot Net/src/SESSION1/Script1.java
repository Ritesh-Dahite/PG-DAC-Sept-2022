package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
	ChromeDriver driver;
	
	//to open a browser
	public void open() {
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\SDM 2\\Selenium Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");		//open
		driver.manage().window().maximize();		//maximize
		
		String s = driver.getTitle();
		System.out.println(s);
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		String s2 = driver.getPageSource();
		System.out.println(s2.length());
		System.out.println(s2);
		
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Maha Shivratri");
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		
//		driver.close();								//close only particular tab
//		driver.quit();								//close browser and all tabs
	}
	
	public static void main(String[] args) {
		Script1 s = new Script1();
		s.open();
	}
}