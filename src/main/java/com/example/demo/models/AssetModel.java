package com.example.demo.models;

public class AssetModel {
  private Integer id;
  private String name;
  private Integer damageLevel;
  private Integer asset_type_id;
  private Integer asset_status_id;


  public AssetModel(Integer id, String name, Integer damageLevel, Integer asset_type_id, Integer asset_status_id) {
    this.id = id;
    this.name = name;
    this.damageLevel = damageLevel;
    this.asset_type_id = asset_type_id;
    this.asset_status_id = asset_status_id;
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


  public Integer getAsset_type_id() {
    return asset_type_id;
  }


  public void setAsset_type_id(Integer asset_type_id) {
    this.asset_type_id = asset_type_id;
  }


  public Integer getAsset_status_id() {
    return asset_status_id;
  }


  public void setAsset_status_id(Integer asset_status_id) {
    this.asset_status_id = asset_status_id;
  }

  
}
