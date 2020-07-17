package dog_home;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static User user;
    protected static User userFemale;
    protected static User userMale;
    protected static User userInvalid;
    protected static User userValid;



    @BeforeClass
    public static void setUP() throws InterruptedException {

        System.out.println("SetUp starts");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Freedom\\Desktop\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        String url = "https://wagwalking.com/";

        driver.get(url);

        driver.manage().window().maximize();

        String expectedTitle = "WagWalking.com | Trusted Local Dog Walkers, Pet Sitters, Trainers and More";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        user = new User("test@test.com", "123tewst", "John", "Smith", "1234567890");
        userFemale = new User("ab1@gmail.com", "Abc123", "Anna", "Brown", "5674356");
        userMale = new User("sb345@gmail.com", "Qwe123", " John", "Smith", "456990909");
        userInvalid = new User("ghghg@test", "76757657575", "LOOOOONG", "NAMEEEEEEEE", "5767687676767%^&^&(*_)");
        userValid = new User("user@gmail.com", "123Abc", "Tony", "Canada", "1234567");

    }

    @AfterClass
    public static void tearDown() {

        //     System.out.println("TearDown Starts");
        //      driver.quit();
    }

}
