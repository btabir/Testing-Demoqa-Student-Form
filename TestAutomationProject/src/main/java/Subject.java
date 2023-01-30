import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Subject extends BasePage{
    WebDriver driver;

    private final By subjectLocator = By.id("subjectsInput");

    public Subject(WebDriver driver) {
        super(driver);
    }

    public void sendText(String letter){
        sendKeys(subjectLocator,letter);
    }

    public void pickWord(String word){
        textMatch(word,subjectLocator);
    }

   }
