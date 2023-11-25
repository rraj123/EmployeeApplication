package com.sarp.employee.EmployeeApplication.service;

import com.sarp.employee.EmployeeApplication.entity.Employee;
import com.sarp.employee.EmployeeApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "John","San jose"),
            new Employee(2, "Mike","San Diego"),
            new Employee(3, "Kevin","Farmington")
    ));
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getAnEmployee(int id) {
        return employeeList.stream().filter(e ->(e.getEmployeeId() == id )).findFirst().get();
    }

    public void createEmployee(Employee employee) {
//        employeeList.add(employee);
        employeeRepository.save(employee);
    }
    public void updateEmployee(Employee employee) {
//        List<Employee> tempEmployee = new ArrayList<>();
//        for (Employee emp: employeeList) {
//            System.out.println( employee.toString());
//            if (emp.getEmployeeId() == employee.getEmployeeId()) {
//                emp.setEmployeeName(employee.getEmployeeName());
//                emp.setEmployeeCity(employee.getEmployeeCity());
//            }
//            tempEmployee.add(emp);
//        }
//        this.employeeList = tempEmployee;
        employeeRepository.save(employee);
    }

    public void  deleteEmployee(int id) {
//        List<Employee> tempEmployee = new ArrayList<>();
//        for (Employee emp: employeeList) {
//            if (emp.getEmployeeId() == id) {
//                continue;
//            }
//            tempEmployee.add(emp);
//        }
//        this.employeeList = tempEmployee;
        employeeRepository.delete(employeeRepository.getById(id));
    }
}
