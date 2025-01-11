package PS005;

import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee emp3 = new Employee(3, "Alice Johnson", 55000);

        
        CollectionMap collectionMap = new CollectionMap();

       
        System.out.println("Add emp1: " + (collectionMap.addEmployee(emp1) == 0 ? "Success" : "Error"));
        System.out.println("Add emp2: " + (collectionMap.addEmployee(emp2) == 0 ? "Success" : "Error"));
        System.out.println("Add emp3: " + (collectionMap.addEmployee(emp3) == 0 ? "Success" : "Error"));
        System.out.println("Add duplicate emp1: " + (collectionMap.addEmployee(emp1) == 0 ? "Success" : "Duplicate"));

       
        System.out.println("\nFind emp1: " + collectionMap.findEmployee(1));
        System.out.println("Find non-existent emp4: " + collectionMap.findEmployee(4));

        
        System.out.println("\nRemove emp2: " + (collectionMap.removeEmployee(2) == 0 ? "Success" : "Error"));
        System.out.println("Remove non-existent emp4: " + (collectionMap.removeEmployee(4) == 0 ? "Success" : "Not Found"));

      
        System.out.println("\nEmployee List:");
        List<Employee> employeeList = collectionMap.getEmployeeList();
        if (employeeList != null && !employeeList.isEmpty()) {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No employees found.");
        }

        
        CollectionMap emptyMap = new CollectionMap();
        System.out.println("\nEmpty Map Check:");
        if (emptyMap.getEmployeeList() == null) {
            System.out.println("No employees found in the map.");
        }
    }
}
