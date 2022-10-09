/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.ArrayList;

/**
 *
 * @author ziyu
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;

    public EmployeeHistory() {
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){ //Create
    Employee employee = new Employee();
    history.add(employee);
    return employee;
}
    
    public void DeleteEmployee(Employee employee){ //Delete
    history.remove(employee);
    }


}
