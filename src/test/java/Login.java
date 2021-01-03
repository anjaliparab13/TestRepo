import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Login {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		d.get("https://www.flipkart.com/");
		String title = d.getTitle();
		System.out.println("The enterd url title is " + title);

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebElement login_button = d
				.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		login_button.click();

		WebElement user_number = d
				.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input"));
		user_number.sendKeys("9892393100");

		WebElement user_password = d
				.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input"));
		user_password.sendKeys("Loopmobile@05");

		WebElement loginbtn = d
				.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
		loginbtn.click();

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement cart = d.findElement(By.xpath("/*[@id='container']/div/div[1]/div[1]/div[2]/div[5]/div/div/a"));
		Actions act5 = new Actions(d);
		act5.moveToElement(cart).build().perform();
		act5.click().build().perform();

	}

}
