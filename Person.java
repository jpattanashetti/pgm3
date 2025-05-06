

public class Person {

    String name;
    String dob;
    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
    
    public void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("date of birth: " + dob);
    }
}
