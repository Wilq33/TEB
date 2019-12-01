import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends PageObject {

    @FindBy(id = "select_8")
    private WebElement city;

    @FindBy(id = "select_option_25")
    private WebElement poznan;

    @FindBy(id = "select_10")
    private WebElement term;

    @FindBy(id = "select_option_29")
    private WebElement march;

    @FindBy(id = "select_12")
    private WebElement level;

    @FindBy(id = "select_option_32")
    private WebElement postgraduate;

    @FindBy(id = "select_14")
    private WebElement subject;

    @FindBy(id = "select_option_37")
    private WebElement inspector;

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
        this.term.click();
        this.march.click();
        this.level.click();
        this.postgraduate.click();
        this.subject.click();
        this.inspector.click();
        this.fillRecruitmentForm.click();

    }
}
