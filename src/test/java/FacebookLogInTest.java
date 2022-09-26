import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogInTest {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }


    @Test
    public void facebookLogIn() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.xpath("//*[@name='login']"));
        username.sendKeys("xxx");
        password.sendKeys("xxx");
        login.click();


    }
}