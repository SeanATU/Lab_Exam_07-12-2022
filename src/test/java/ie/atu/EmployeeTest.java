package ie.atu;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee myEmployee;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myEmployee = new Employee();
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}