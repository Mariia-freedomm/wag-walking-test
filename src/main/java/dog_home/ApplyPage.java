package dog_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class ApplyPage extends BasePage{

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=email]")
    private WebElement emailField;
    public void inputEmailField() {
        emailField.sendKeys("test@test.com");
    }

    @FindBy(css = "input[name=password]")
    private WebElement passwordFields;
    public void inputPasswordField() {
        passwordFields.sendKeys("123Pass");
    }

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;
    public void inputFirstNameField() {
        firstNameField.sendKeys("John");
    }

    @FindBy(css = "input[name=lastName]")
    private WebElement lastNameField;
    public void inputLastNameField() {
        lastNameField.sendKeys("Smith");
    }

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement phoneField;
    public void inputPhoneField() {
        phoneField.sendKeys("1234567890");
    }



}
