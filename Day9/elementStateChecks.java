package org.example;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class elementStateChecks {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // 1. isDisplayed() - checks if the email input box is visible on the page
        WebElement emailBox = driver.findElement(By.cssSelector("#sI1XGe"));
        boolean isVisible = emailBox.isDisplayed();
        System.out.println(isVisible);

        // 2. isEnabled() - checks if the email input box is active and ready for input
        boolean isActive = emailBox.isEnabled();
        System.out.println(isActive);

        // 3. isSelected() - checks if a checkbox or radio button is checked (returns false for an input box)
        boolean isChecked = emailBox.isSelected();
        System.out.println(isChecked);

        driver.quit();
    }
}
