package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.models.Role;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RoleService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
  // kenapa yang dipake bukan employeeserviceimpl?
  @Autowired
  private EmployeeService employeeService;
  @Autowired
  private DepartmentService departmentService;
  @Autowired
  private RoleService roleService;

  @GetMapping
  public String index(Model model){
    List<Employee> employees = employeeService.get();
    model.addAttribute("employees", employees);

    return "employee/index";
  }

  @GetMapping("create")
  public String create(Model model){
    List<Role> roles = roleService.get();
    List<Employee> managers = new ArrayList<>();
    managers.add(employeeService.get(1));
    managers.add(employeeService.get(4));
    managers.add(employeeService.get(6));

    model.addAttribute("employee", new Employee());
    model.addAttribute("departments", departmentService.get());
    model.addAttribute("roles", roles);
    model.addAttribute("managers", managers);
    
    return "employee/create";
  }

  @GetMapping("{id}/update")
  public String update(@PathVariable Integer id, Model model){
    List<Role> roles = roleService.get();
    List<Employee> managers = new ArrayList<>();
    managers.add(employeeService.get(1));
    managers.add(employeeService.get(4));
    managers.add(employeeService.get(6));

    model.addAttribute("employee", employeeService.get(id));
    model.addAttribute("departments", departmentService.get());
    model.addAttribute("roles", roles);
    model.addAttribute("managers", managers);

    return "employee/update";
  }

  @PostMapping("save")
  public String save(Employee employee){
    return employeeService.save(employee) ? "redirect:/employee" : "error";
  }

  @PostMapping("{id}/delete")
  public String delete(@PathVariable Integer id){
    return employeeService.delete(id) ? "redirect:/employee" : "error";
  }
}
