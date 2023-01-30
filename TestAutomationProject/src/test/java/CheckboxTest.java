import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxTest extends BaseTest{
    private final By checkBox1Locator =By.cssSelector("label[for='hobbies-checkbox-1']");
    private final By checkBox2Locator =By.cssSelector("label[for='hobbies-checkbox-2']");
    private final By checkBox3Locator =By.cssSelector("label[for='hobbies-checkbox-3']");



    @Test
    void test_isEnableSportsCB(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().isEnable(checkBox1Locator);
    }

    @Test
    void test_isEnableReadingCB(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().isEnable(checkBox1Locator);
    }

    @Test
    void test_isEnableMusicCB(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().isEnable(checkBox1Locator);
    }
    @Test
    public void test_SportsCheckBox() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().clickCheckBox(checkBox1Locator);
    }

    @Test
    public void test_ReadingCheckBox(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().clickCheckBox(checkBox2Locator);
    }

    @Test
    public void test_MusicCheckBox(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.checkbox().clickCheckBox(checkBox3Locator);
    }


}
