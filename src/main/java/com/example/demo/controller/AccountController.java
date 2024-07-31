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

import com.example.demo.models.Employee;
import com.example.demo.models.Role;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RoleService;

@Controller
@RequestMapping("account")
public class AccountController {
  @Autowired
  private RoleService roleService;
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("role")
  public String roleIndex(Model model){
    List<Role> roles = roleService.get();

    model.addAttribute("roles", roles);

    return "account/roleManagement";
  }

  @GetMapping("role/create")
  public String roleCreate(Model model){
    Role role = new Role();

    model.addAttribute("role", role);

    return "account/roleCreate";
  }

  @GetMapping("role/{id}/update")
  public String roleUpdate(@PathVariable Integer id, Model model){
    Role role = roleService.get(id);

    model.addAttribute("role", role);

    return "account/roleUpdate";
  }

  @GetMapping("role/employees")
  public String roleEmployess(Model model){
    List<Employee> employees = employeeService.get();

    model.addAttribute("employees", employees);

    return "account/roleEmployees";
  }

  @GetMapping("role/employees/{id}/update")
  public String roleEmployeesUpdate(@PathVariable Integer id, Model model){
    Employee employee = employeeService.get(id);
    List<Role> roles = roleService.get();

    model.addAttribute("employee", employee);
    model.addAttribute("roles", roles);

    return "account/roleEmployeeUpdate";
  }

  @PostMapping("role/save")
  public String roleSave(Role role){
    return roleService.save(role) ? "redirect:/account/role" : "error";
  }

  @PostMapping("role/{id}/delete")
  public String roleDelete(@PathVariable Integer id){
    return roleService.delete(id) ? "redirect:/account/role" : "error";
  }
}
