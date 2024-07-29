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
 * AssetTypeModel
 */
@Entity
@Table(name = "tb_m_asset_type")
public class AssetType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer id;

  @Column
  private String type;

  @OneToMany(mappedBy = "assetType")
  // @JsonIgnore
  private List<Asset> assets;

  // public AssetType(){}

  public AssetType(Integer id, String type, List<Asset> assets) {
    this.id = id;
    this.type = type;
    this.assets = assets;
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

  public List<Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

}