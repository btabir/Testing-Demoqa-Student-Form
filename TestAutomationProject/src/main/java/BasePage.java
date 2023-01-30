import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {
    protected WebDriver driver;

    String baseURL = "https://demoqa.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void sendKeys(By locator,String text){
        find(locator).sendKeys(text);
    }

    public boolean isSelected(By locator){
        return find(locator).isSelected();
    }

    public boolean isEnable(By locator){
        return find(locator).isEnabled();
    }



    public void selectMonthYear(By locator,By locator2,Integer index){
        click(locator);
        Select select = new Select(find(locator2));
        select.selectByIndex(index);
    }

    public void selectDay(By locator,By locator2,String dayText){
        click(locator);
        List<WebElement> chooseDay = findElements(locator2);

        for (WebElement chooseOneDay : chooseDay){
            String text = chooseOneDay.getText();
            if (text.equals(dayText)){
                chooseOneDay.click();
                break;
            }
    }
}

    public void textMatch(String text,By locator){
        List<WebElement> suggestions = findElements(locator);

        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
            if (suggestion.getText().equalsIgnoreCase(text)){
                suggestion.click();
                break;
            }
        }
        suggestions.get(0).click();
    }
}
