package org.example;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App {

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(5000);
        JavascriptExecutor siri=(JavascriptExecutor) driver;
        siri.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);
        driver.findElement(By.name("roll_no")).sendKeys("Dharani");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ABC");
        Thread.sleep(5000);
        driver.quit();
    }
}
