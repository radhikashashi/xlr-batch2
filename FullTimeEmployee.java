package PS001;
class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private String address;

   
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    
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

    
    public String getFullName() {
        return firstName + " " + lastName;
    }
}


class FullTimeEmployee extends Employee {
    
    private double basic;
    private double bonus;

   
    public FullTimeEmployee() {
        super(); 
        this.basic = 0.0;
        this.bonus = 0.0;
    }

   
    public FullTimeEmployee(int id, String firstName, String lastName, String address, double basic, double bonus) {
        super(id, firstName, lastName, address); 
        this.basic = basic;
        this.bonus = bonus;
    }

    
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

  
    public double computeSal() {
        return basic + bonus;
    }

    
    public void showDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + getAddress());
        System.out.println("Basic Salary: $" + basic);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Gross Salary: $" + computeSal());
    }

    
    public static void main(String[] args) {
       
        FullTimeEmployee emp1 = new FullTimeEmployee(1, "John", "Doe", "123 Main St", 5000.0, 1000.0);
        emp1.showDetails();

       
        FullTimeEmployee emp2 = new FullTimeEmployee();
        emp2.setId(2);
        emp2.setFirstName("Jane");
        emp2.setLastName("Smith");
        emp2.setAddress("456 Elm St");
        emp2.setBasic(4500.0);
        emp2.setBonus(800.0);
        emp2.showDetails();
    }
}
