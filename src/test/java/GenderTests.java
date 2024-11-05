import org.example.entity.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class GenderTests extends BaseTest {

    protected Gender gender;

    @BeforeEach
    public void genderSetup() {
        gender = new Gender(driver);
    }

    @Test
    public void test_setMaleRadio() {
        WebElement radio = gender.getMaleRadio();
        gender.setMaleRadio();
        Assertions.assertTrue(gender.isChecked(radio));
    }

    @Test
    public void test_setFemaleRadio() {
        WebElement radio = gender.getFemaleRadio();
        gender.setFemaleRadio();
        Assertions.assertTrue(gender.isChecked(radio));
    }

    @Test
    public void test_setOtherRadio() {
        WebElement radio = gender.getOtherRadio();
        gender.setOtherRadio();
        Assertions.assertTrue(gender.isChecked(radio));
    }

}
