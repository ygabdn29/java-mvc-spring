package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="tb_m_asset")
public class Asset {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer id;

  @Column
  private String name;

  @Column(name = "damage_level")
  private String damageLevel;

  // private Integer assetTypeId;
  @ManyToOne
  @JoinColumn(name="asset_type_id", referencedColumnName ="id")
  private AssetType assetType;

  // private Integer assetStatusId;
  @ManyToOne
  @JoinColumn(name = "asset_status_id", referencedColumnName = "id")
  private AssetStatus assetStatus;

  @OneToMany(mappedBy = "asset")
  // @JsonIgnore
  private List<AssetDetail> assetDetails;

  @OneToMany(mappedBy = "asset")
  // @JsonIgnore
  private List<AssetTransaction> assetTransactions;

  public Asset(){}

  public Asset(Integer id, String name, String damageLevel, AssetType assetType, AssetStatus assetStatus,
      List<AssetDetail> assetDetails, List<AssetTransaction> assetTransactions) {
    this.id = id;
    this.name = name;
    this.damageLevel = damageLevel;
    this.assetType = assetType;
    this.assetStatus = assetStatus;
    this.assetDetails = assetDetails;
    this.assetTransactions = assetTransactions;
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

  public String getDamageLevel() {
    return damageLevel;
  }

  public void setDamageLevel(String damageLevel) {
    this.damageLevel = damageLevel;
  }

  public AssetType getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetType assetType) {
    this.assetType = assetType;
  }

  public AssetStatus getAssetStatus() {
    return assetStatus;
  }

  public void setAssetStatus(AssetStatus assetStatus) {
    this.assetStatus = assetStatus;
  }

  public List<AssetDetail> getAssetDetails() {
    return assetDetails;
  }

  public void setAssetDetails(List<AssetDetail> assetDetails) {
    this.assetDetails = assetDetails;
  }

  public List<AssetTransaction> getAssetTransactions() {
    return assetTransactions;
  }

  public void setAssetTransactions(List<AssetTransaction> assetTransactions) {
    this.assetTransactions = assetTransactions;
  }

}
