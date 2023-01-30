import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UploadFileTest extends BaseTest{
    @Test
    public void test_UploadFile(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.uploadFile().sendPath("C:\\Users\\tabir\\Desktop\\pp.jpg");
    }
}
