package mppl;

public class Student1 {
    private String name;
    private String title;
    private String address;

    /**
     * Constructor to create Student object
     */
    public Student1() {

    }
    

    /**
     * Constructor with parameter
     *
     * @param name
     */
    public Student1(String name) {
        this.name = name;
    }

    /**
     * Method to get the name of person
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name of person
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the title of person
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to set the title of person
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to get address of person
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method to set the address of person
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method to get name with title of person
     *
     * @return nameTitle
     */
    public String getNameWithTitle() {
        String nameTitle;
        if (title != null) {
            nameTitle = name + ", " + title;
        } else {
            nameTitle = name;
        }
        return nameTitle;
    }

    /**
     * Method used to print the information of person
     */
    public String toString1() {
        return "Info [" +
                "name='" + name + "'" +
                ", title='" + title + "'" +
                ", address='" + address + "'" +
                "]";
    }



    /**
     * Constructor with parameter
     *
     * @param name
     * @return 
     */
    public void Student(String name) {
        this.name = name;
    }

    /**
     * Method used to print the information of person
     */
    @Override
    public String toString() {
        return "Student info [" +
                "name='" + name + "'" +
                ", student ID ='" + NIM + "'" +
                ", study programme ='" + prodi + "'" +
                "]";
    }
}

