package com.example.demo.models;

/**
 * DamageParameterModel
 */
public class DamageParameter {
  private Integer id;
  private String name;
  private Integer value;
  private String notes;

  
  public DamageParameter(Integer id, String name, Integer value, String notes) {
    this.id = id;
    this.name = name;
    this.value = value;
    this.notes = notes;
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

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
  
}