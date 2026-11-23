
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class allLocators {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://github.com/login");

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.id("login_field")));
            } catch (Exception e) {
                System.out.println("Username field not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.name("password")));
            } catch (Exception e) {
                System.out.println("Password field not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.className("octicon-mark-github")));
            } catch (Exception e) {
                System.out.println("GitHub logo not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.linkText("Forgot password?")));
            } catch (Exception e) {
                System.out.println("Forgot password link not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.partialLinkText("Create an")));
            } catch (Exception e) {
                System.out.println("Create account link not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.tagName("h")));
            } catch (Exception e) {
                System.out.println("Heading not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.xpath(
                        "//label[contains(text(),'Username or email address')]"
                )));
            } catch (Exception e) {
                System.out.println("Username label not found: " + e.getMessage());
            }

            Thread.sleep(3000);

            try {
                highlight(driver, driver.findElement(By.cssSelector(
                        "input[name='commit']"
                )));
            } catch (Exception e) {
                System.out.println("Sign in button not found: " + e.getMessage());
            }

            Thread.sleep(4000);

        } finally {
            driver.quit();
        }
    }

    public static void highlight(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].style.border='3px solid red'",
                element
        );
    }
}
