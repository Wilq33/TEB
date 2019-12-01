import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TebTests {

    private String teb;
    private String redButton;
    private String logo;



    @Before
    public void setUp() {

        Driver.driverF = new FirefoxDriver();
        teb = "https://www.wsb.pl/rekrutacja/krok1";
/*      name = "name";
        password = "password";
        redError = "p.error-message";*/

    }

    @Test
    public void testForm1() throws InterruptedException {

        //Test to check if you can add wrong phone number

        Driver.driverF.get(teb);

        SignUpPage signUpPage = new SignUpPage(Driver.driverF);
        Assert.assertTrue(signUpPage.isInitialized());
        signUpPage.enterData();

        /*RegistrationPage registrationPage = new RegistrationPage(Driver.driverF);
        Assert.assertTrue(registrationPage.isInitialized());
        registrationPage.enterData("test@test.pl", "Test Test", "12345678");

        String expectedMessage = "E-mail jest już w użyciu przez niepotwierdzone konto. Możesz zalogować się lub odzyskać hasło, by je zresetować.";
        String errorMessage = Driver.driverF.findElement(By.cssSelector(redError)).getText();
        System.out.println(errorMessage);
        Assert.assertTrue("Your error message", errorMessage.contains(expectedMessage));*/

    }

    @After
    public void tearDown() {

        Driver.driverF.quit();

    }
}
