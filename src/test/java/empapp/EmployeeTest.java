package empapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void initEmployee() {
        employee = new Employee("John Doe", 1970);
    }

    @Test
    void testGetAge() {
        assertAll(
                () -> assertEquals("John Doe", employee.getName()),
                () -> assertEquals(30, employee.getAge(2000))
        );
    }

    @Test
    void testGetAgeWithZero() {
        assertEquals(0,
                employee.getAge(1970));
    }

    @Test
    void testCreateEmployeeWithYearOfBirth1700() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Employee("John Doe", 1700));

        assertEquals("Year: 1700", ex.getMessage());
    }

}