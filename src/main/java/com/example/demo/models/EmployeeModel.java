package com.example.demo.models;

/**
 * EmployeeModel
 */
public class EmployeeModel {
  private Integer id;
  private String name;
  private String dob;
  private String gender;
  private String email;
  private String phone;
  private String address;
  private Integer department_id; 
  private Integer role_id;
  private Integer employee_manager_id;
  
  public EmployeeModel(Integer id, String name, String dob, String gender, String email, String phone, String address,
      Integer department_id, Integer role_id, Integer employee_manager_id) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.gender = gender;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.department_id = department_id;
    this.role_id = role_id;
    this.employee_manager_id = employee_manager_id;
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

  public Integer getDepartment_id() {
    return department_id;
  }

  public void setDepartment_id(Integer department_id) {
    this.department_id = department_id;
  }

  public Integer getRole_id() {
    return role_id;
  }

  public void setRole_id(Integer role_id) {
    this.role_id = role_id;
  }

  public Integer getEmployee_manager_id() {
    return employee_manager_id;
  }

  public void setEmployee_manager_id(Integer employee_manager_id) {
    this.employee_manager_id = employee_manager_id;
  }
  
  
}