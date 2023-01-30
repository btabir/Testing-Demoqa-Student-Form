import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)//Bunu ekledikten sonra alttaki metodlarin statik olmasina gerek yok
public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "ChromeWebDriver/chromedriver");
        System.out.println("Test initiated");
    }

    @BeforeEach
    public void beforeMethod() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterMethod(){
        //driver.quit();
    }

    @AfterAll
    public void tearDown() {
        //driver.quit();
        System.out.println("Test finished");
    }
}
