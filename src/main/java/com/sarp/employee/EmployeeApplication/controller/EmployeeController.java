package com.sarp.employee.EmployeeApplication.controller;

import com.sarp.employee.EmployeeApplication.entity.Employee;
import com.sarp.employee.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
// @RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //@RequestMapping("/employees")
    @GetMapping("/employees")
    public List<Employee> findAllEmployee() {
        return employeeService.getAllEmployees();
    }

//    @RequestMapping("/employees/{id}")
    @GetMapping("/employees/{id}")
    public Employee findAnEmployee(@PathVariable int id) {
        return employeeService.getAnEmployee(id);
    }

//    @RequestMapping( value ="/employees",method= RequestMethod.POST)
    @PostMapping( value ="/employees")
    public void createEmployee(@RequestBody Employee employee) {
         employeeService.createEmployee(employee);
    }

//    @RequestMapping(value ="/employees/{id}",method= RequestMethod.PUT)
    @PutMapping (value ="/employees/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

//    @RequestMapping(value ="/employees/{id}",method= RequestMethod.DELETE)
    @DeleteMapping(value ="/employees/{id}")
    public  List<Employee>  deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return employeeService.getAllEmployees();
    }
}
