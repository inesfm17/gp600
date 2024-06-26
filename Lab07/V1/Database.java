package Lab07.V1;

import java.util.Vector;

public class Database { // Data elements
    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        employees.removeIf(x -> x.getEmpNum() == emp_num);
    }

    public Employee[] getAllEmployees() {
        return employees.toArray(new Employee[0]);
    }
}