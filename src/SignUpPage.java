import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends PageObject {

    @FindBy(id = "select_8")
    private WebElement city;

    @FindBy(id = "select_option_25")
    private WebElement poznan;

    @FindBy(id = "select_12")
    private WebElement level;

    @FindBy(id = "select_option_31")
    private WebElement postgraduate;

    @FindBy(id = "select_12")
    private WebElement subject;

    @FindBy(id = "select_option_31")
    private WebElement academy;

    @FindBy(id = "#select_8")
    private WebElement formOfStudy;

    @FindBy(id = "#select_8")
    private WebElement fillRecruitmentForm;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return city.isDisplayed();
    }

    public void enterEmail(String email) {
  /*      this.email.clear();
        this.email.sendKeys(email);
        this.signup.click();*/
    }
}
