package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * EmployeeModel
 */
@Entity
@Table(name = "tb_m_employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer id;
  
  @Column
  private String name;
  
  @Column
  private String dob;
  
  @Column
  private String gender;
  
  @Column
  private String email;
  
  @Column
  private String phone;
  
  @Column
  private String address;

  @ManyToOne
  @JoinColumn(name = "department_id", referencedColumnName = "id")
  private Department department; 

  @ManyToOne
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role role;

  @OneToOne
  @JoinColumn(name = "employee_manager_id", referencedColumnName = "id")
  private Employee employee;

  public Employee(Integer id, String name, String dob, String gender, String email, String phone, String address,
      Department department, Role role, Employee employee) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.gender = gender;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.department = department;
    this.role = role;
    this.employee = employee;
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

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
  
}