package pgm3;

public class Employee extends Person{
    int empID;
    double salary;
    public Employee(String name, String dob, int empID, double salary) {
        super(name, dob);
        this.empID = empID;
        this.salary = salary;
    }

    public void displayDetails(){
        displayPerson();
        System.out.println("Employee ID: " + empID);
        System.out.println("salary:"+salary);
    }
public static void main(String[] args) {
    Employee emp = new Employee("John", "1990-01-01", 101,800000);
    emp.displayDetails();
}
}