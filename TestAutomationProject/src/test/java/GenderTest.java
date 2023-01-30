import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenderTest extends BaseTest{

    @Test
    public void testMaleGender(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not checked");
    }

    @Test
    public void testFeMaleGender(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not checked");
    }


    @Test
    public void testOtherGender(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not checked");
    }
}
