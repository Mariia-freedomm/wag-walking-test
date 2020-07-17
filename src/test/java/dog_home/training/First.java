package dog_home.training;

import dog_home.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First extends BaseTest {

    @Test
    public void testFirst() throws InterruptedException {

        System.out.println("First Test starts");

        WebElement buttonBook = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        buttonBook.click();

        Thread.sleep(10000);

        WebElement fieldEmail = driver.findElement(By.cssSelector("input[name=email]"));

        fieldEmail.sendKeys(user.getEmail());

        WebElement fieldPassword = driver.findElement(By.cssSelector("input[name=password]"));

        fieldPassword.sendKeys(user.getPassword());

        WebElement fieldName = driver.findElement(By.cssSelector("input[name=firstName]"));

        fieldName.sendKeys(user.getFirstName());

        WebElement fieldLastName = driver.findElement(By.cssSelector("input[name=lastName]"));

        fieldLastName.sendKeys(user.getLastName());

        WebElement fieldPhone = driver.findElement(By.cssSelector("input[name=phone]"));

        fieldPhone.sendKeys(user.getPhone());

    }
}
