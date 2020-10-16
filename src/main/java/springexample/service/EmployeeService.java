package springexample.service;

import springexample.model.Employee;

public interface EmployeeService {
 
    void persistEmployee(Employee employee);
 
    Employee findEmployeeById(String id);
 
    void updateEmployee(Employee employee);
 
    void deleteEmployee(Employee employee);
}