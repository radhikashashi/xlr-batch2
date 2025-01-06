package PS001;
public class PartTimeEmployee {
    // Instance variables
    private int hoursWorked;
    private double amountPerHour;

    // Default constructor
    public PartTimeEmployee() {
        this.hoursWorked = 0;
        this.amountPerHour = 0.0;
    }

    // Parameterized constructor
    public PartTimeEmployee(int hoursWorked, double amountPerHour) {
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    // Getter and Setter methods
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(double amountPerHour) {
        this.amountPerHour = amountPerHour;
    }

    // Method to compute the salary
    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    // Method to display details
    public void showDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: $" + amountPerHour);
        System.out.println("Salary: $" + computeSal());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using parameterized constructor
        PartTimeEmployee emp1 = new PartTimeEmployee(40, 15.5);
        emp1.showDetails();

        // Using default constructor and setters
        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.setHoursWorked(30);
        emp2.setAmountPerHour(12.75);
        emp2.showDetails();
    }
}
