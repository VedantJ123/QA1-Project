package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Find the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type "Selenium" into the search box
        searchBox.sendKeys("Selenium");

        // Submit the search form
        searchBox.submit();

        // Wait for the search results to load (you might need to add explicit waits in a real-world scenario)
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to wait for the results to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the search result count element
        WebElement searchResultStats = driver.findElement(By.id("result-stats"));

        // Get the text of the search result count element
        String searchResultCountText = searchResultStats.getText();

        // Print out the search result count
        System.out.println("Search results count: " + searchResultCountText);

        // Close the browser
        driver.quit();
    }
}
