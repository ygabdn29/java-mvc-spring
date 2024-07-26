package com.example.demo.models;

/**
 * UserModel
 */
public class UserModel {
  private Integer id;
  private String username;
  private String password;
  private Integer employee_id;
  
  public UserModel(Integer id, String username, String password, Integer employee_id) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.employee_id = employee_id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }
}