package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		 driver.get("https://robu.in/cart/");
	}

}
