package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Asset;
import com.example.demo.models.AssetDetail;
import com.example.demo.models.AssetStatus;
import com.example.demo.models.AssetType;
import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.models.Role;
import com.example.demo.service.AssetDetailService;
import com.example.demo.service.AssetService;
import com.example.demo.service.AssetStatusService;
import com.example.demo.service.AssetTransactionService;
import com.example.demo.service.AssetTypeService;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;

@SpringBootTest
class DemoApplicationTests {

	// Concept AAA
	// Arrange, Act, Assert
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AssetService assetService;
	@Autowired
	private AssetTypeService assetTypeService;
	@Autowired
	private AssetStatusService assetStatusService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userService;
	@Autowired
	private AssetDetailService assetDetailService;
	@Autowired
	private AssetTransactionService assetTransactionService;

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
		Role selectedRole = roleService.get(2);

		Employee employee = new Employee();
		employee.setId(null);
		employee.setName("Test Employee 2");
		employee.setDob("1995-09-08");
		employee.setGender("Male");
		employee.setEmail("Test2@Testmail.com");
		employee.setPhone("085721345678");	
		employee.setAddress("Jln. Mahoni No. 20 Jakarta Barat");
		employee.setRole(selectedRole);
		employee.setDepartment(selectedDepartment);
		employee.setEmployeeManager(employeeManager);

		Boolean result = employeeService.save(employee);

		assertEquals(true, result);
	}

	@Test
	void deleteUser(){
		Integer id = 52;
		Boolean result = userService.delete(52);
		assertEquals(true, result); 
	}

	@Test
	void saveAsset(){
		AssetType assetType = assetTypeService.get(1);
		AssetStatus assetStatus = assetStatusService.get(1);

		Asset asset = new Asset();
		asset.setName("Acer Predator Neo 16");
		asset.setAssetType(assetType);
		asset.setAssetStatus(assetStatus);
		asset.setDamageLevel("Minor");
	
		Boolean result = assetService.save(asset);	
		
		assertEquals(true, result);
	}

	@Test
	void  getEmployee(){
		Employee selectedEmployee = employeeService.get(6);
		Integer department = selectedEmployee.getDepartment().getId();
		
		assertEquals("Gessa", selectedEmployee.getName());
	}

	@Test
	void getAsset(){
		String assetName = assetService.get(1).getName();
		assertEquals("ASUS A46CM", assetName);
	}

	@Test
	void getAssetDetail(){
		Integer assetDetailAssetId = assetDetailService.get(5).getAsset().getId();

		assertEquals(2, assetDetailAssetId);
	}

	@Test
	void getUserIdFromTransaction(){
		Integer userId = assetTransactionService.get(8).getUser().getId();
		assertEquals(33, userId);
	}

	@Test 
	void getDepartmentName(){
		String departmentName = departmentService.get(1).getName();

		assertEquals("HR", departmentName);
	}
}
