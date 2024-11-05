import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameEmailTests extends BaseTest {

    @Test
    public void test_setName() {
        nameEmail.setFirstName("Test First Name");
        Assertions.assertEquals("Test First Name", nameEmail.getFirstName());
    }

    @Test
    public void test_setLastName() {
        nameEmail.setLastName("Test Last Name");
        Assertions.assertEquals("Test Last Name", nameEmail.getLastName());
    }

    @Test
    public void test_setEmail() {
        nameEmail.setEmail("test@email.com");
        Assertions.assertEquals("test@email.com", nameEmail.getUserEmail());
    }

}
