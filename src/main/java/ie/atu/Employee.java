package ie.atu;

public class Employee {

    private String name;
    private String PPS_ID;
    private String Employment_Type;
    private String Gender;
    private int Age;

    public Employee(){

    }
    public Employee(String Gender){
        this.Gender=Gender;
    }

    public Employee(String name, String PPS_ID, String Employment_Type, String Gender, int Age){
        this.name =name;
        this.PPS_ID=PPS_ID;
        this.Employment_Type=Employment_Type;
        this.Gender=Gender;
        this.Age=Age;
    }

    public String getName() {
        return name;
    }

    public String getPPS_ID() {
        return PPS_ID;
    }

    public String getEmployment_Type() {
        return Employment_Type;
    }

    public String getGender() {
        return Gender;

    }

    public int getAge() {
        return Age;
    }
    public String toString(){
        return name+" "+PPS_ID+" "+Employment_Type+" "+Gender+" "+Age;
    }
}
