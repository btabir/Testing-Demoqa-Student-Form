import org.junit.jupiter.api.Test;

public class SubjectTest extends BaseTest{

    @Test
    public void test_sendLetter(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.subject().sendText("English");
    }

    @Test
    public void test_pickWord(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.subject().pickWord("English");
    }
}
