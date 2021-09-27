package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeValidatorTest {

    EmployeeValidator employee = new EmployeeValidator("John", "Johnson", "55555", "TK-4321");

    @Test
    void validateFirstTest() {
        String expected = "";
        String actual = employee.validateFirst();

        assertEquals(expected, actual);
    }

    @Test
    void validateLastTest() {
        String expected = "";
        String actual = employee.validateLast();

        assertEquals(expected, actual);
    }

    @Test
    void validateZipTest() {
        String expected = "";
        String actual = employee.validateZip();

        assertEquals(expected, actual);
    }

    @Test
    void validateIDTest() {
        String expected = "";
        String actual = employee.validateID();

        assertEquals(expected, actual);
    }

    @Test
    void validateInputTest() {
        String expected = "";
        String actual = employee.validateInput();

        assertEquals(expected, actual);
    }

}