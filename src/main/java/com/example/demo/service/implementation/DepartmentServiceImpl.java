package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
  @Autowired
  private DepartmentRepository departmentRepository;

  // @Autowired
  // public DepartmentServiceImpl(DepartmentRepository departmentRepository){
  //   this.departmentRepository = departmentRepository;
  // }
  
  @Override
  public List<Department> get() {
    return departmentRepository.findAll();
  }

  @Override
  public Department get(Integer id) {
    return departmentRepository.findById(id).orElse(null);
  }

  @Override
  public Boolean save(Department entity) {
    // Department department = departmentRepository.save(entity);
    departmentRepository.save(entity);
    // return department.getId().equals(null);
    return departmentRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    departmentRepository.deleteById(id);
    return departmentRepository.findById(id).isEmpty();
  }
  
}

