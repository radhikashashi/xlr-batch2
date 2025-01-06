package PS001;
class Employee {
    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and Setter methods for instance variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using the parameterized constructor
        Employee emp1 = new Employee(1, "John", "Doe", "123 Main St");
        System.out.println("Employee 1 Full Name: " + emp1.getFullName());

        // Using the default constructor and setter methods
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setFirstName("Jane");
        emp2.setLastName("Smith");
        emp2.setAddress("456 Elm St");
        System.out.println("Employee 2 Full Name: " + emp2.getFullName());
    }
}
