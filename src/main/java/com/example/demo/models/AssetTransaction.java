package com.example.demo.models;

public class AssetTransaction {
  private Integer id;
  private String requestSubmissionTime;
  private String outTime;
  private String returnTime;
  private Boolean isApprovedManager;
  private Boolean isApprovedAdmin;
  private Integer userId;
  private Integer adminId;
  private Integer assetId;
  

  public AssetTransaction(Integer id, String requestSubmissionTime, String outTime, String returnTime,
      Boolean isApprovedManager, Boolean isApprovedAdmin, Integer userId, Integer adminId, Integer assetId) {
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


  public String getRequestSubmissionTime() {
    return requestSubmissionTime;
  }


  public void setRequestSubmissionTime(String requestSubmissionTime) {
    this.requestSubmissionTime = requestSubmissionTime;
  }


  public String getOutTime() {
    return outTime;
  }


  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }


  public String getReturnTime() {
    return returnTime;
  }


  public void setReturnTime(String returnTime) {
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
