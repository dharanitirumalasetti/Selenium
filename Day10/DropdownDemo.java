
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[.='Dropdown']")).click();

        Select course = new Select(driver.findElement(
                By.xpath("//select[@id='dropdown']")));

        // Select by visible text
        course.selectByVisibleText("Option 1");
        Thread.sleep(2000);

        // Select by value
        course.selectByValue("2");
        Thread.sleep(2000);

        // Select by index
        course.selectByIndex(1);
        Thread.sleep(2000);

        System.out.println("Selected option: " +
                course.getFirstSelectedOption().getText());

        driver.quit();
    }
}
