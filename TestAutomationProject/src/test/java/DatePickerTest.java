import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatePickerTest extends BaseTest{

    @Test
    public void test_SelectMonth(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.datePicker().selectDate(3);
        Assertions.assertEquals(3,3,"Index numbers dont match");
    }

    @Test
    public void test_SelectYear(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.datePicker().selectYear(111);
        Assertions.assertEquals(111,111,"Index numbers dont match");
    }

    @Test
    public void test_SelectDay(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.datePicker().selectDay("19");
        Assertions.assertEquals("19","19","Days dont match");
    }
}
