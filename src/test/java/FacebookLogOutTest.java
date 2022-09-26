import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FacebookLogOutTest {

    @Test
    public void facebookLogOut() {
        FacebookLogInTest fbLogin = new FacebookLogInTest();
        fbLogin.facebookLogIn();

        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement profileButton = FacebookLogInTest.getDriver().findElement(By.xpath(("//*[@aria-label='Ваш профиль']")));
        profileButton.click();
        WebElement logoutButton = FacebookLogInTest.getDriver().findElement(By.xpath("//span[text()='Выйти']"));
        logoutButton.click();
    }
}
