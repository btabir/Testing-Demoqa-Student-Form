import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePicker extends BasePage{

    private final By datePickerLocator =By.id("dateOfBirthInput");
    private final By monthPickerLocator =By.className("react-datepicker__month-select");
    private final By yearPickerLocator = By.className("react-datepicker__year-select");
    private final By dayPickerLocator = By.cssSelector("div.react-datepicker__day");


    public DatePicker(WebDriver driver) {
        super(driver);
    }

    public void selectDate(Integer monthIndex){
        selectMonthYear(datePickerLocator,monthPickerLocator,monthIndex);
    }

    public void selectYear(Integer yearIndex){
        selectMonthYear(datePickerLocator,yearPickerLocator,yearIndex);
    }

    public void selectDay(String day){
        selectDay(datePickerLocator,dayPickerLocator,day);
    }





}
