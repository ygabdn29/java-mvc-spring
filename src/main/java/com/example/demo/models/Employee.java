package com.example.demo.models;

/**
 * EmployeeModel
 */
public class Employee {
  private Integer id;
  private String name;
  private String dob;
  private String gender;
  private String email;
  private String phone;
  private String address;
  private Integer departmentId; 
  private Integer roleId;
  private Integer employeeManagerId;
  
  public Employee(Integer id, String name, String dob, String gender, String email, String phone, String address,
      Integer departmentId, Integer roleId, Integer employeeManagerId) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.gender = gender;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.departmentId = departmentId;
    this.roleId = roleId;
    this.employeeManagerId = employeeManagerId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Integer getEmployeeManagerId() {
    return employeeManagerId;
  }

  public void setEmployeeManagerId(Integer employeeManagerId) {
    this.employeeManagerId = employeeManagerId;
  }
  
  
  
  
}