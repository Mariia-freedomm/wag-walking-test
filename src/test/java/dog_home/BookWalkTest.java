package dog_home;

import org.junit.Test;

public class BookWalkTest extends BaseTest {

    @Test
    public void testBookWalk() throws InterruptedException {

        HomePage homepage = new HomePage(driver);


        homepage.bookWalkButtonClick();

        Thread.sleep(5000);

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmailField();

        applyPage.inputPasswordField();

        applyPage.inputFirstNameField();

        applyPage.inputLastNameField();

        applyPage.inputPhoneField();

        //test test branch
        //method
    }

}
