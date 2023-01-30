import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFillTest extends BaseTest{
    @Test
    public void test_setFirstName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setFirstName("Bugra");
        Assertions.assertEquals("Bugra",practiceFormPage.getFirstName(),"Text does not match");
    }

    @Test
    public void test_setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Tabir");
        Assertions.assertEquals("Tabir",practiceFormPage.getLastName(),"Text does nat match");
    }

    @Test
    public void test_Email(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("tabirbugra@gmail.com");
        Assertions.assertEquals("tabirbugra@gmail.com",practiceFormPage.getEmail(),"Text does not match");
    }

    @Test
    public void test_mobileNumber(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setMobileNumber("572727168");
        Assertions.assertEquals("572727168",practiceFormPage.getMobileNumber(),"Text does not match");
    }
    @Test
    public void test_currentAddress(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setCurrentAddress("Jozefa Bema 5/2");
        Assertions.assertEquals("Jozefa Bema 5/2",practiceFormPage.getCurrentAddress(),"Text does not match");
    }
}
