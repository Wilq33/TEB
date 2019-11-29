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

    @FindBy(id = "select_option_34")
    private WebElement academy;

    @FindBy(css = ".button")
    private WebElement fillRecruitmentForm;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return city.isDisplayed();
    }

    public void enterData() {
        this.city.click();
        this.poznan.click();
        this.level.click();
        this.postgraduate.click();
        this.subject.click();
        this.academy.click();
        this.fillRecruitmentForm.click();

    }
}
