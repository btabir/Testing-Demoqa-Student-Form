import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{

    WebDriver driver;
    private final By firstNameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By userEmailLocator = By.id("userEmail");
    private final By mobileNumberLocator = By.id("userNumber");
    private final By currentAddressLocator = By.id("currentAddress");
    private GenderSection genderSection;
    private DatePicker datePicker;
    private Subject subject;
    private Checkbox checkbox;
    private UploadFile uploadFile;



    public PracticeFormPage(WebDriver driver) {
        super(driver);
        driver.get(baseURL.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
        datePicker = new DatePicker(driver);
        subject = new Subject(driver);
        checkbox = new Checkbox(driver);
        uploadFile = new UploadFile(driver);

        driver.manage().window().maximize();
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }
    public DatePicker datePicker(){
        return this.datePicker;
    }

    public Subject subject(){
        return this.subject;
    }
    public Checkbox checkbox(){
        return this.checkbox;
    }
    public UploadFile uploadFile(){
        return this.uploadFile;
    }

    public void setFirstName(String name){
        sendKeys(firstNameLocator,name);
    }

    public void setLastName(String surname){
        sendKeys(lastNameLocator,surname);
    }

    public void setEmail(String email){
        sendKeys(userEmailLocator,email);
    }

    public void setMobileNumber(String number){
        sendKeys(mobileNumberLocator,number);
    }

    public void setCurrentAddress(String address){
        sendKeys(currentAddressLocator,address);
    }

    public String getFirstName(){
        return find(firstNameLocator).getAttribute("value");
    }

    public String getLastName(){
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail(){
        return find(userEmailLocator).getAttribute("value");
    }

    public String getMobileNumber(){
        return find(mobileNumberLocator).getAttribute("value");
    }

    public String getCurrentAddress(){
        return find(currentAddressLocator).getAttribute("value");
    }
}
