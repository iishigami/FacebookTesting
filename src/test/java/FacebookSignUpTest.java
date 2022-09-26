import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookSignUpTest {
    WebDriver driver;

    @Test
    public void facebookSignUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement email = driver.findElement(By.name("reg_email__"));
        WebElement emailConfirm = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement password = driver.findElement(By.name("reg_passwd__"));

        firstName.sendKeys("Hi");
        lastName.sendKeys("World");
        email.sendKeys("s23443535j@gmail.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        emailConfirm.sendKeys("s23443535j@gmail.com");
        password.sendKeys("123Testing-Hello");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("12");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("1");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("2000");
        WebElement gender = driver.findElement(By.xpath("//*[@name='sex' and @value='1']"));
        gender.click();

        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();


    }
}