package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3 {

	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
		 WebDriver driver1= (WebDriver) new ChromeDriver();
		 //ChromeDriver driver = new ChromeDriver();
		 driver1.get("https://google.com");

	}

}
