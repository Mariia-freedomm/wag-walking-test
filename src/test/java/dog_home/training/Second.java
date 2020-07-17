package dog_home.training;

import dog_home.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Second extends BaseTest {

    @Test
    public void testSecond() throws InterruptedException {

        WebElement buttonBook =  driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        buttonBook.click();

        Thread.sleep(10000);

        List<WebElement> fields = driver.findElements(By.cssSelector(".sc-iwsKbI.cCLPOj"));

        fields.get(0).sendKeys(user.getEmail());

        fields.get(1).sendKeys(user.getPassword());

        fields.get(2).sendKeys(user.getFirstName());

        fields.get(3).sendKeys(user.getLastName());

        fields.get(4).sendKeys(user.getPhone());
    }
}

