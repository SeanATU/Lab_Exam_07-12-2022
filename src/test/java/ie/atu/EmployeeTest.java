package ie.atu;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee myEmployee;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myEmployee = new Employee();
    }

    @Test
    public void testName(){
        for(int x =3; x<25; x++){
            assertEquals(x,myEmployee.getName().length());
        }
    }

    @Test
    public void testPPS_ID(){
        for(int x =0; x<11; x++){
            assertEquals(x,myEmployee.getPPS_ID().length());
        }
    }

    @Test
    public void testEmploymentTypeFullTime(){
        assertEquals("Full-time",myEmployee.getName());
    }
    public void testEmploymentTypePartTime(){
        assertEquals("Part-time",myEmployee.getName());
    }
    public void testEmploymentTypeContract(){
        assertEquals("Contract",myEmployee.getName());
    }

    @Test
    public void testGenderMan(){
        assertEquals("Man",myEmployee.getName());
    }
    @Test
    public void testGenderWoman(){
        assertEquals("Woman",myEmployee.getName());
    }
    @Test
    public void testGenderNon_Binary(){
        assertEquals("Non-Binary",myEmployee.getName());
    }

    @Test
    public void testAge(){
        if(myEmployee.getAge()<16){
            System.out.println("Age must be over 16");
        }
        else if (myEmployee.getAge()>66){
            System.out.println("Age must be under 66");
        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}