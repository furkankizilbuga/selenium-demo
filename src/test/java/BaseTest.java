import org.example.entity.NameEmail;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    protected NameEmail nameEmail;

    @BeforeAll
    public void setup() {
        System.out.println("Test started.");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        nameEmail = new NameEmail(driver);
    }

    @AfterAll
    public void tearDown() {
        System.out.println("Test finished.");
        //driver.quit();
    }



}
