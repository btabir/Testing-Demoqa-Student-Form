import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile extends BasePage {
    public UploadFile(WebDriver driver) {
        super(driver);
    }

    private final By uploadFileLocator = By.id("uploadPicture");

    public void sendPath(String path){
        driver.findElement(uploadFileLocator).sendKeys(path);
    }

}
