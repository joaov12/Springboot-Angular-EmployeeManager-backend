package tech.joaovitor.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.joaovitor.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}