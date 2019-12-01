import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends PageObject {

    @FindBy(id = "nameInput")
    private WebElement name;

    @FindBy(id = "lastNameInput")
    private WebElement surname;

    @FindBy(id = "emailInput")
    private WebElement email;

    @FindBy(id = "pesel")
    private WebElement pesel;

    @FindBy(id = "select_27")
    private WebElement countryOfOrigin;

    @FindBy(id = "select_option_800")
    private WebElement poland;

    @FindBy(id = "birthPlace")
    private WebElement birthplace;

    @FindBy(id = "phoneNumber")
    private WebElement phonenumber;

    @FindBy(id = "street")
    private WebElement street;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return email.isDisplayed();
    }

    public void enterData(String name, String surname, String email, String pesel, String birthplace, String phonenumber, String street) throws InterruptedException {

        this.name.clear();
        this.name.sendKeys(name);
        this.surname.clear();
        this.surname.sendKeys(surname);
        this.email.clear();
        this.email.sendKeys(email);
        this.pesel.clear();
        this.pesel.sendKeys(pesel);
/*        this.countryOfOrigin.click();
        this.poland.click();*/
        this.birthplace.clear();
        this.birthplace.sendKeys(birthplace);
        this.phonenumber.clear();
        this.phonenumber.sendKeys(phonenumber);
        this.street.clear();
        this.street.sendKeys(street);


/*        this.name.clear();
        this.name.sendKeys(name);
        this.password.clear();
        this.password.sendKeys(p);*/

    }
}