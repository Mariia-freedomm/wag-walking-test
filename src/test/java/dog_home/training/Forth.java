package dog_home.training;

import dog_home.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Forth extends BaseTest {

    @Test
    public void forthTest() {

        List<WebElement> upperMenuBar = driver.findElements(By.cssSelector(".sc-bxivhb.lonzbf"));

        upperMenuBar.get(2).click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=email]"));

        emailField.sendKeys("test@test.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=password]"));

        emailField.sendKeys("123Pass!");

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-block"));

        submitButton.click();

        WebElement authenticationError =  driver.findElement(By.cssSelector(".WagLoginForm_alert__1AnhH.bootstrap_alert__micD4.bootstrap_alert-warning__3CyDn"));

        String authenticationErrorText = authenticationError.getText();

        Assert.assertEquals("Authentication Failed", authenticationErrorText);






    }
}
