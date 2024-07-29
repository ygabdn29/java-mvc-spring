package com.example.demo.models;

public class Asset {
  private Integer id;
  private String name;
  private Integer damageLevel;
  private Integer assetTypeId;
  private Integer assetStatusId;
  
  public Asset(Integer id, String name, Integer damageLevel, Integer assetTypeId, Integer assetStatusId) {
    this.id = id;
    this.name = name;
    this.damageLevel = damageLevel;
    this.assetTypeId = assetTypeId;
    this.assetStatusId = assetStatusId;
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

  public Integer getDamageLevel() {
    return damageLevel;
  }

  public void setDamageLevel(Integer damageLevel) {
    this.damageLevel = damageLevel;
  }

  public Integer getAssetTypeId() {
    return assetTypeId;
  }

  public void setAssetTypeId(Integer assetTypeId) {
    this.assetTypeId = assetTypeId;
  }

  public Integer getAssetStatusId() {
    return assetStatusId;
  }

  public void setAssetStatusId(Integer assetStatusId) {
    this.assetStatusId = assetStatusId;
  }

}
