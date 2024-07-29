package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tr_asset_detail")
public class AssetDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer id;

  @Column(name = "componentName")
  private String componentName;
  
  @Column(name = "componentPercentage")
  private Integer componentPercentage;
  
  @Column(name= "isBroken")
  private Boolean isBroken;
  
  @ManyToOne
  @JoinColumn(name ="asset_id", referencedColumnName = "id")
  private Asset asset;
  
  public AssetDetail(){}

  public AssetDetail(Integer id, String componentName, Integer componentPercentage, Boolean isBroken, Asset asset) {
    this.id = id;
    this.componentName = componentName;
    this.componentPercentage = componentPercentage;
    this.isBroken = isBroken;
    this.asset = asset;
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

  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }
  
}
