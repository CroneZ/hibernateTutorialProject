package springexample.dao;

import springexample.model.Employee;

public interface EmployeeDAO {
     
          void persistEmployee(Employee employee);
           
          Employee findEmployeeById(String id);
           
          void updateEmployee(Employee employee);
           
          void deleteEmployee(Employee employee);
           
}