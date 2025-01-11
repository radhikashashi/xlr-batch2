package  PS005;

import java.util.*;

public class CollectionMap {
    private Map<Integer, Employee> employeeMap;

   
    public CollectionMap() {
        this.employeeMap = new HashMap<>();
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }


    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

   
    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; 
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2;
        }
        employeeMap.put(emp.getId(), emp);
        return 0; 
    }

    
    public int removeEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            return 2; 
        }
        employeeMap.remove(employeeId);
        return 0; 
    }

    
    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null);
    }

    
    public List<Employee> getEmployeeList() {
        if (employeeMap.isEmpty()) {
            return null; 
        }
        return new ArrayList<>(employeeMap.values());
    }
}
