package com.example.demo.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tr_asset_transaction")
public class AssetTransaction {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer id;

  
  @Column(name = "requestSubmissiontime")
  private LocalDateTime requestSubmissionTime;
  
  @Column(name = "outTime")
  private LocalDateTime outTime;
  
  @Column(name = "returnTime")
  private LocalDateTime returnTime;
  
  @Column(name = "isApprovedManager")
  private Boolean isApprovedManager;
  
  @Column(name = "isApprovedAdmin")
  private Boolean isApprovedAdmin;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;
  // private Integer userId;

  @ManyToOne
  @JoinColumn(name = "admin_id", referencedColumnName = "id")
  private User admin;

  @ManyToOne
  @JoinColumn(name = "asset_id", referencedColumnName = "id")
  private Asset asset;

  public AssetTransaction(){}

  public AssetTransaction(Integer id, LocalDateTime requestSubmissionTime, LocalDateTime outTime,
      LocalDateTime returnTime, Boolean isApprovedManager, Boolean isApprovedAdmin, User user, User admin,
      Asset asset) {
    this.id = id;
    this.requestSubmissionTime = requestSubmissionTime;
    this.outTime = outTime;
    this.returnTime = returnTime;
    this.isApprovedManager = isApprovedManager;
    this.isApprovedAdmin = isApprovedAdmin;
    this.user = user;
    this.admin = admin;
    this.asset = asset;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getRequestSubmissionTime() {
    return requestSubmissionTime;
  }

  public void setRequestSubmissionTime(LocalDateTime requestSubmissionTime) {
    this.requestSubmissionTime = requestSubmissionTime;
  }

  public LocalDateTime getOutTime() {
    return outTime;
  }

  public void setOutTime(LocalDateTime outTime) {
    this.outTime = outTime;
  }

  public LocalDateTime getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(LocalDateTime returnTime) {
    this.returnTime = returnTime;
  }

  public Boolean getIsApprovedManager() {
    return isApprovedManager;
  }

  public void setIsApprovedManager(Boolean isApprovedManager) {
    this.isApprovedManager = isApprovedManager;
  }

  public Boolean getIsApprovedAdmin() {
    return isApprovedAdmin;
  }

  public void setIsApprovedAdmin(Boolean isApprovedAdmin) {
    this.isApprovedAdmin = isApprovedAdmin;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getAdmin() {
    return admin;
  }

  public void setAdmin(User admin) {
    this.admin = admin;
  }

  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }

}
