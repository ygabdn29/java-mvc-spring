package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * AssetStatusModel
 */

@Entity
@Table(name = "tb_m_asset_status")
public class AssetStatus {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer id;

  @Column
  private String status;

  
  @OneToMany(mappedBy = "assetStatus")
  // @JsonIgnore
  private List<Asset> assets;


  public AssetStatus(Integer id, String status, List<Asset> assets) {
    this.id = id;
    this.status = status;
    this.assets = assets;
  }


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public List<Asset> getAssets() {
    return assets;
  }


  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  
}