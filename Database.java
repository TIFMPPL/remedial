    
* List all the persons currently in the database on standard out.
     
*/

public void listAll () {
        
for (Iterator i = persons.iterator(); i.hasNext();) {
            
System.out.println(i.next());
        
}
    
}


    

/**
     
* main method.
     
* Kerjakan tugas anda dengan menambahkan statement yang sesuai dengan
     
* petunjuk soal
     
*/
    
public static void main(String args[]) {
        
Database db = new Database();

	

Student dosen = new Student ("Anung", 1998, "064001600014");
	
db.addPerson(dosen);
	
db.listAll();
    
}


}

/**
 * A person class for a simple BlueJ demo program. Person is used as
 * an abstract superclass of more specific person classes.
 *
 * @author  Michael Kolling
 * @version 1.0, January 1999
 */

abstract class Person
{
    private String name;
    private int yearOfBirth;

    /**
     * Create a person with given name and age.
     */
    Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Set a new name for this person.
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Return the name of this person.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set a new birth year for this person.
     */
    public void setYearOfBirth(int newYearOofBirth) {
        yearOfBirth = newYearOofBirth;
    }

    /**
     * Return the birth year of this person.
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Object"
    {
        return "Name: " + name + "\n" +
               "Year of birth: " + yearOfBirth + "\n";
    }
}

/**
 * A class representing staff members for a simple BlueJ demo program.
 *
 * @author  Michael Kolling
 * @version 1.0, January 1999
 */
class Staff extends Person
{
    private String room;

    /**
     * Create a staff member with default settings for detail information.
     */
    Staff() {
        super("(unknown name)", 0000);
        room = "(unknown room)";
    }

    /**
     * Create a staff member with given name, year of birth and room
     * number.
     */
    Staff(String name, int yearOfBirth, String roomNumber) {
        super(name, yearOfBirth);
        room = roomNumber;
    }

    /**
     * Set a new room number for this person.
     */
    public void setRoom(String newRoom) {
        room = newRoom;
    }

    /**
     * Return the room number of this person.
     */
    public String getRoom() {
        return room;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Staff member\n" +
               "Room: " + room + "\n";
    }
}

/**
 * A class representing students for a simple BlueJ demo program.
 *
 * @author  Michael Kolling
 * @version 1.0, January 1999
 */

class Student extends Person
{
    private String SID;    // student ID number

    /**
     * Create a student with default settings for detail information.
     */

    Student() {
    	super("(unknown name)", 0000);
    	SID = "(unknown ID)";
    }
 

    /**
     * Create a student with given name, year of birth and student ID
     */
    Student(String name, int yearOfBirth, String studentID) {
        super(name, yearOfBirth);
        SID = studentID;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID() {
       return SID;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Student\n" +
               "Student ID: " + SID + "\n";
    }

}

