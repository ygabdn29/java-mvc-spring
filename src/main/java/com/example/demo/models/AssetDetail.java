package com.example.demo.models;

public class AssetDetail {
  private Integer id;
  private String componentName;
  private Integer componentPercentage;
  private Boolean isBroken;
  private Integer assetId;
  
  public AssetDetail(Integer id, String componentName, Integer componentPercentage, Boolean isBroken, Integer assetId) {
    this.id = id;
    this.componentName = componentName;
    this.componentPercentage = componentPercentage;
    this.isBroken = isBroken;
    this.assetId = assetId;
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

  public Boolean getIsBroken() {
    return isBroken;
  }

  public void setIsBroken(Boolean isBroken) {
    this.isBroken = isBroken;
  }

  public Integer getAssetId() {
    return assetId;
  }

  public void setAssetId(Integer assetId) {
    this.assetId = assetId;
  }
  
  

  
}
