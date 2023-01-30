import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox extends BasePage{

    public Checkbox(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox(By locator){
        click(locator);
    }
}
