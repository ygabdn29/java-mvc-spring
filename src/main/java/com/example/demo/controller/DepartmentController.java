package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Department;
import com.example.demo.service.DepartmentService;
//$-object, @-url, *-property

@Controller
@RequestMapping("department") // url /department
public class DepartmentController {
  @Autowired
  private DepartmentService departmentService;

  @GetMapping // localhost:8080/department
  public String index(Model model){
    List<Department> departments = departmentService.get();
    model.addAttribute("departments", departments);

    return "department/index";
  }

  @GetMapping("form")
  public String form(Model model){// localhost:8080/region/form
    model.addAttribute("department", new Department());

    return "department/form";
  } 

  @GetMapping("{id}/edit")
  public String edit(@PathVariable Integer id, Model model){// localhost:8080/region/form
    model.addAttribute("department", departmentService.get(id));

    return "department/edit";
  } 

  @PostMapping("save")
  public String save(Department department){
    return departmentService.save(department) ? "redirect:/department" : "department/edit";
  }

  @PostMapping("{id}/delete")
  public String delete(@PathVariable Integer id){
    return departmentService.delete(id) ? "redirect:/department" : "error";
  }
}
