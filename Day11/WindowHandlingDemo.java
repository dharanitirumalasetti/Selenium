import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowHandlingDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://the-internet.herokuapp.com/windows");

        Thread.sleep(4000);

        // Get parent window ID
        String parent = driver.getWindowHandle();

        System.out.println("Parent Window: " + parent);

        // Open child window
        driver.findElement(By.linkText("Click Here")).click();

        Thread.sleep(2000);

        // Get all window IDs
        Set<String> windows = driver.getWindowHandles();

        // Switch to child window
        for (String window : windows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                break;
            }
        }

        System.out.println("Child Title: " + driver.getTitle());

        // Switch back to parent window
        driver.switchTo().window(parent);

        System.out.println("Parent Title: " + driver.getTitle());

        driver.quit();
    }
}