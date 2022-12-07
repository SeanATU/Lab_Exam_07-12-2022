package ie.atu;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Exception exMessage = assertThrows(IllegalArgumentException.class()->{myEmployee.getEmployment_Type();});
        assertEquals("Full-time",myEmployee.getEmployment_Type());
    }
    @Test
    public void testEmploymentTypePartTime(){
        Exception exMessage = assertThrows(IllegalArgumentException.class ()->{myEmployee.getEmployment_Type();});
        assertEquals("Part-time",myEmployee.getEmployment_Type());
    }
    @Test
    public void testEmploymentTypeContract(){
        Exception exMessage = assertThrows(IllegalArgumentException.class()->{myEmployee.getEmployment_Type();});
        assertEquals("Contract",myEmployee.getEmployment_Type());
    }

    @Test
    public void testGenderMan(){
        Exception exMessage = assertThrows(IllegalArgumentException.class()->{myEmployee.getGender();});
        assertEquals("Man",myEmployee.getGender());
    }
    @Test
    public void testGenderWoman(){
        Exception exMessage = assertThrows(IllegalArgumentException.class()->{myEmployee.getGender();});
        assertEquals("Woman",myEmployee.getGender());
    }
    @Test
    public void testGenderNon_Binary(){
        Exception exMessage = assertThrows(IllegalArgumentException.class()->{myEmployee.getGender();});
        assertEquals("Non-Binary",myEmployee.getGender());

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