package com.example.demo.models;

import java.time.LocalDateTime;

public class AssetTransaction {
  private Integer id;
  private LocalDateTime requestSubmissionTime;
  private LocalDateTime outTime;
  private LocalDateTime returnTime;
  private Boolean isApprovedManager;
  private Boolean isApprovedAdmin;
  private Integer userId;
  private Integer adminId;
  private Integer assetId;

  public AssetTransaction(Integer id, LocalDateTime requestSubmissionTime, LocalDateTime outTime,
      LocalDateTime returnTime, Boolean isApprovedManager, Boolean isApprovedAdmin, Integer userId, Integer adminId,
      Integer assetId) {
    this.id = id;
    this.requestSubmissionTime = requestSubmissionTime;
    this.outTime = outTime;
    this.returnTime = returnTime;
    this.isApprovedManager = isApprovedManager;
    this.isApprovedAdmin = isApprovedAdmin;
    this.userId = userId;
    this.adminId = adminId;
    this.assetId = assetId;
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

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getAdminId() {
    return adminId;
  }

  public void setAdminId(Integer adminId) {
    this.adminId = adminId;
  }

  public Integer getAssetId() {
    return assetId;
  }

  public void setAssetId(Integer assetId) {
    this.assetId = assetId;
  }
  
  
 

  
  
}
