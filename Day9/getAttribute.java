package org.example;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class getAttribute {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement veeva = driver.findElement(By.cssSelector("#identifierId"));
        veeva.sendKeys("arun");
        Thread.sleep(3000);

        String as = veeva.getAttribute("value");
        //String sa = "arun";
        Assert.assertEquals(as, "arun");
        //System.out.println();
    }
}
