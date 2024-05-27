package Semester3Java.LearningJava.JavaQAP2;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    //Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //Methods for each attribute
    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    //Method to convert this object to string
    public String toString() {
        return this.street + ", " + this.city + ", " + this.state + " " + this.zip;
    }
}
