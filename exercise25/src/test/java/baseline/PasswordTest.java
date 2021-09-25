package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    @Test
    void hasNumberTest() {
        Password validator = new Password();

        String password = "batbatman24!";

        boolean actual = validator.hasNumber(password);

        assertTrue(actual);
    }

    @Test
    void hasLetterTest() {
        Password validator = new Password();

        String password = "batbatman24!";

        boolean actual = validator.hasLetter(password);

        assertTrue(actual);
    }

    @Test
    void hasSpecialTest() {
        Password validator = new Password();

        String password = "batbatman24!";

        boolean actual = validator.hasSpecial(password);

        assertTrue(actual);
    }

    @Test
    void passwordValidatorTest() {
        Password validator = new Password();

        String password = "batbatman24!";

        int expected = 4;
        int actual = validator.passwordValidator(password);
        assertEquals(expected, actual);

        password = ("batbatman24");
        expected = 3;
        assertEquals(expected, actual);

        password = ("batman");
        expected = 2;
        assertEquals(expected, actual);

        password = ("1337");
        expected = 1;
        assertEquals(expected, actual);

        password = ("j0k3r");
        expected = 0;
        assertEquals(expected, actual);
    }
}