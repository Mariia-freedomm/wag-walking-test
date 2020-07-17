package dog_home.training;


import dog_home.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Third extends BaseTest {

    @Test
    public void testThird() throws InterruptedException {

        WebElement buttonBook =  driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        buttonBook.click();

        Thread.sleep(15000);

        List<WebElement> fields = driver.findElements(By.cssSelector(".sc-iwsKbI.cCLPOj"));

        fields.get(0). click();
        fields.get(1).click();
        fields.get(2).click();
        fields.get(3).click();
        fields.get(4).click();
        fields.get(0).click();

        List<WebElement> errors = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-bxivhb.laYMsi"));

        String emailError =errors.get(0).getText();

        Assert.assertEquals("required", emailError);

        String firstNameError = errors.get(1).getText();

        Assert.assertEquals("required", firstNameError);

        String lastNameError = errors.get(2).getText();

        Assert.assertEquals("required", lastNameError);

        String phoneError = errors.get(3).getText();

        Assert.assertEquals("required", phoneError);
    }


}
