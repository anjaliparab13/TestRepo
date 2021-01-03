package pkg;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class AddToCart {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		d.get("https://www.flipkart.com/");
		String title = d.getTitle();
		System.out.println("The enterd url title is " + title);

		WebElement closebtn = d.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		Actions act = new Actions(d);
		act.moveToElement(closebtn).build().perform();
		act.click().build().perform();

		WebElement women = d.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[4]"));
		Actions act1 = new Actions(d);
		act1.moveToElement(women).build().perform();

		WebElement sari = d.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div/div[2]/a[1]"));
		Actions act2 = new Actions(d);
		act2.moveToElement(sari).build().perform();
		act2.click().build().perform();

		WebElement sari_Product = d
				.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[4]/div/div[2]"));
		Actions act3 = new Actions(d);
		act3.moveToElement(sari_Product).build().perform();
		act3.click().build().perform();

		ArrayList<String> Whid = new ArrayList<String>(d.getWindowHandles());
		d.getWindowHandles();

		for (int i = 1; i <= Whid.size() - 1; i++)
			;
		{

			int i = 1;
			String window = Whid.get(i);
			d.switchTo().window(window);
			String a = d.getTitle();
			System.out.println("The name of the window is : " + a);
		}
		d.switchTo().window(Whid.get(1));

		// Thread.sleep(9000);
		WebElement addbtn = d
				.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]"));
		Actions act4 = new Actions(d);
		act4.moveToElement(addbtn).build().perform();
		act4.click().build().perform();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement removebtn = d.findElement(
				By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]"));
		Actions act6 = new Actions(d);
		act6.moveToElement(removebtn).build().perform();
		act6.click().build().perform();

		WebElement removebtn_confirmation = d
				.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[3]/div/div[2]"));
		Actions act7 = new Actions(d);
		act7.moveToElement(removebtn_confirmation).build().perform();
		act7.click().build().perform();

		String page_name = d.getTitle();
		System.out.println("Finally project executed successfully and cart page title is " + page_name);
	  
  }

}


