package net.javaguides.springbootback.repository;

import net.javaguides.springbootback.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
