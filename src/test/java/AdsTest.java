import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AdsTest {

    @Test
    public void adsTesting() {
        FacebookLogInTest fcLogin = new FacebookLogInTest();
        fcLogin.facebookLogIn();

        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement adsManagerButton =  FacebookLogInTest.getDriver().findElement(By.xpath("//span[text()='Ads Manager']"));
        adsManagerButton.click();
        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement createAdButton =  FacebookLogInTest.getDriver().findElement(By.xpath("//*[@id='pe_toolbar']/div/div/div/div[1]/div/div/div[1]/div/span/div/div/div[2]"));
        createAdButton.click();
        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement chooseAdType =  FacebookLogInTest.getDriver().findElement(By.xpath("//span[text()='Вовлеченность']"));
        chooseAdType.click();
        WebElement continueButton = FacebookLogInTest.getDriver().findElement(By.xpath("//*[@id='facebook']/body/div[6]/div[1]/div[1]/div/div/div/div/div[3]/div[2]/div[2]/div[1]/span/div/div/div"));
        continueButton.click();
        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement nextButton = FacebookLogInTest.getDriver().findElement(By.xpath("//*[@id='ads_pe_container']/div[1]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/button/div/div"));
        nextButton.click();
        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement anotherNextButton = FacebookLogInTest.getDriver().findElement(By.xpath("//*[@id='AdsPECampaignEditor']/div/div[2]/div/div/div/div/div[2]/div/div[2]/button/div/div"));
        anotherNextButton.click();
        FacebookLogInTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement publishButton = FacebookLogInTest.getDriver().findElement(By.xpath("//*[@id='ads-editor-primary-btn']/span/div/div/div"));
        publishButton.click();
    }
}
