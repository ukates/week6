/*
    Derrick Cates
    CIS 402A - 305J
    ClassRoster.java
    12/11/2019
    The purpose of this program is to test the Student class.  This program
    should create a linked list of 20 student objects, display that list in the
    original created order, and display the reversed version of the list.
 */
// import iterator and linkedList
import java.util.Iterator;
import java.util.LinkedList;
//ClassRoster class
public class ClassRoster {
    //main method
    public static void main(String[] args){
        //create linked list of student objects
        LinkedList<Student> students = new LinkedList<>();
        //add new student object to linked list with the student constructor
        students.add(new Student("Derrick", "Cates", 3256));
        students.add(new Student("Evelyn", "Torrellas", 1291));
        students.add(new Student("Daniel", "Burlew", 4867));
        students.add(new Student("Ryan", "Klein", 6578));
        students.add(new Student("Steven", "Falgout", 9876));
        students.add(new Student("Kristina", "Wiley", 2345));
        students.add(new Student("Erica", "Watson", 5645));
        students.add(new Student("Tony", "Stark", 2413));
        students.add(new Student("David", "Banner", 8907));
        students.add(new Student("Steve", "Rodgers", 7957));
        students.add(new Student("Nicholas", "Cage", 1986));
        students.add(new Student("Bob", "Barker", 1928));
        students.add(new Student("Finneus", "Fistofferson", 2938));
        students.add(new Student("Billy", "BluJean", 4634));
        students.add(new Student("Timmy", "Turner", 8956));
        students.add(new Student("Billy", "Jean", 1114));
        students.add(new Student("Michael", "Jackson", 8833));
        students.add(new Student("Terry", "Wilson", 4738));
        students.add(new Student("Benny", "Snell", 1818));
        students.add(new Student("Alfred", "Thompson", 2222));
        //display linked list with for loop
        System.out.print("\t***CLASS ROSTER***");
        for (Student student : students) {
            System.out.print(student);
        }

        System.out.print("\n\n\t***REVERSED CLASS ROSTER***");
        //reverse students linked list with iterator
        Iterator rev = students.descendingIterator();
        //print reversed linked list
        while(rev.hasNext()){
            System.out.print(rev.next());
        }
    }
}
