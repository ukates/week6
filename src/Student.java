/*
    Derrick Cates
    CIS 402A - 305J
    Student.java
    12/11/2019
    The purpose of this program is to create a class called Student with a
    constructor that requires a string first name and last name and an integer
    for student ID.  This class should be tested with a ClassRoster class with
    a main method.
 */

//student class
public class Student {
    //data fields
    private String firstName;
    private String lastName;
    private int studentID;
    //default constructor
    public Student(){

    }
    //constructor with parameters
    public Student(String firstName, String lastName, int studentID) {
        //call setter methods to assign values to data fields
        setFirstName(firstName);
        setLastName(lastName);
        setStudentID(studentID);
    }
    //getters and setters for data fields
    public String getFirstName(String firstName){
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID(int studentID){
        return this.studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String toString() {
        return ("\n\nFirst name: " + firstName +
                "\nLast name : " + lastName +
                "\nID Number : " + studentID);
    }
}
