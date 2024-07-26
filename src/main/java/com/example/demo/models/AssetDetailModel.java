package com.example.demo.models;

public class AssetDetailModel {
  private Integer id;
  private String componentName;
  private Integer componentPercentage;
  private boolean isBroken;
  private Integer asset_id;
  
  public AssetDetailModel(Integer id, String componentName, Integer componentPercentage, boolean isBroken,
      Integer asset_id) {
    this.id = id;
    this.componentName = componentName;
    this.componentPercentage = componentPercentage;
    this.isBroken = isBroken;
    this.asset_id = asset_id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getComponentName() {
    return componentName;
  }

  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  public Integer getComponentPercentage() {
    return componentPercentage;
  }

  public void setComponentPercentage(Integer componentPercentage) {
    this.componentPercentage = componentPercentage;
  }

  public boolean isBroken() {
    return isBroken;
  }

  public void setBroken(boolean isBroken) {
    this.isBroken = isBroken;
  }

  public Integer getAsset_id() {
    return asset_id;
  }

  public void setAsset_id(Integer asset_id) {
    this.asset_id = asset_id;
  }

  
}
