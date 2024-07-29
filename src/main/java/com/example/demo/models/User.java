package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * UserModel
 */

@Entity
@Table(name = "tb_m_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer id;
  
  @Column
  private String username;
  
  @Column
  private String password;

  @OneToOne
  @JoinColumn(name = "employee_id", referencedColumnName = "id")
  private Employee employee;

  @OneToMany(mappedBy = "user")
  // @JsonIgnore
  private List<AssetTransaction> assetTransactions;

  // public User(){}

  public User(Integer id, String username, String password, Employee employee,
      List<AssetTransaction> assetTransactions) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.employee = employee;
    this.assetTransactions = assetTransactions;
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

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public List<AssetTransaction> getAssetTransactions() {
    return assetTransactions;
  }

  public void setAssetTransactions(List<AssetTransaction> assetTransactions) {
    this.assetTransactions = assetTransactions;
  }

}