package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class DemoApplicationTests {
	// Concept AAA
	// Arrange, Act, Assert
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;

	@Test
	void post(){
		// Insert
		// ARRANGE
		Department department = new Department(null, "Test Department", null);
		// department.setName("Test Department");

		// ACT
		Boolean result = departmentService.save(department);

		// ASSERT
		assertEquals(true, result);
	}

	@Test
	void delete(){
		// DELETE
		// ARRANGE
		Integer id = 9;

		// ACT
		Boolean result = departmentService.delete(id);

		// ASSERT
		assertEquals(true, result);
	}

	@Test 
	void saveEmployee(){
		Department selectedDepartment = departmentService.get(10);
		Employee employeeManager = employeeService.get(6);

		Employee employee = new Employee();
		employee.setName("Test Employee");
		employee.setDob("1998-08-09");
		employee.setGender("Male");
		employee.setEmail("Test@Testmail.com");
		employee.setPhone("085719202160");	
		employee.setAddress("Jln. Mahoni No. 15 Jakarta Barat");
		employee.setDepartment(selectedDepartment);
		employee.setEmployeeManager(employeeManager);

		Boolean result = employeeService.save(employee);

		assertEquals(true, result);
	}
}
