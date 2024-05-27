package Semester3Java.LearningJava.JavaQAP2;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    //Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    //Methods per attribute
    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Address getHome() {
        return this.home;
    }

    //Method to convert object to string
    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.home.toString();
    }
}
