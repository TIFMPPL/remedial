package remedialmppl;

import java.util.ArrayList;
import java.util.Iterator;


public class Database {

    private ArrayList persons;

    
    public Database() {
        persons = new ArrayList();
    }

    
    public void addPerson(Person p) {
        persons.add(p);
    }

    public void listAll () {
        for (Iterator i = persons.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }


    
    public static void main(String args[]) {
        Database db = new Database();

	Staff dosen = new Staff("Hendra ", 1998, "064001600032");
	db.addPerson(dosen);
	db.listAll();
    }

}


abstract class Person
{
    private String name;
    private int yearOfBirth;

   
    Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

   
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
    
    
    public void setYearOfBirth(int newYearOofBirth) {
        yearOfBirth = newYearOofBirth;
    }

    
    public int getYearOfBirth() {
        return yearOfBirth;
    }

   
    public String toString()    // redefined from "Object"
    {
        return "Name: " + name + "\n" +
               "Year of birth: " + yearOfBirth + "\n";
    }
}

class Staff extends Person
{
    private String room;

    
    Staff() {
        super("(unknown name)", 0000);
        room = "(unknown room)";
    }

   
    Staff(String name, int yearOfBirth, String roomNumber) {
        super(name, yearOfBirth);
        room = roomNumber;
    }

   
    public void setRoom(String newRoom) {
        room = newRoom;
    }

    public String getRoom() {
        return room;
    }

    
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Student\n" +
               "Student NIM: " + room + "\n";
    }
}


class Student extends Person
{
    private String SID;    // student ID number

   
    Student() {
    	super("(unknown name)", 0000);
    	SID = "(unknown ID)";
    }
 

   
    Student(String name, int yearOfBirth, String studentID) {
        super(name, yearOfBirth);
        SID = studentID;
    }

    
    public String getStudentID() {
       return SID;
    }

    
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Student\n" +
               "Student ID: " + SID + "\n";
    }

}

