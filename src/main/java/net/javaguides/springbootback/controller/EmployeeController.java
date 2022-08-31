package net.javaguides.springbootback.controller;

import net.javaguides.springbootback.model.Employee;
import net.javaguides.springbootback.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee inputEmployee){
       Employee employee = employeeRepository.findById(id).get();

       employee.setFirstName(inputEmployee.getFirstName());
        employee.setLastName(inputEmployee.getLastName());
        employee.setEmailId(inputEmployee.getEmailId());
        employee.setTitle(inputEmployee.getTitle());
        employee.setPhone(inputEmployee.getPhone());
        return employeeRepository.save(employee);
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
