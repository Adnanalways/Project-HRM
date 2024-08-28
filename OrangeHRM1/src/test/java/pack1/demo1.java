package pack1;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		
		//System.out.println(pagesource);
		
		String windowhandle=driver.getWindowHandle();
		
		System.out.println(windowhandle);
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Set<String>WindowHandles =driver.getWindowHandles();
		
		for(String window1 :WindowHandles)
		{
		System.out.println(window1);
		
		}
		
		driver.quit();
		
		
		

	}

}
