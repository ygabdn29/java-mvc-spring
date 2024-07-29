package com.example.demo.models;

/**
 * AssetTypeModel
 */
public class AssetType {
  private Integer id;
  private String type;

  public AssetType(Integer id, String type) {
    this.id = id;
    this.type = type;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}