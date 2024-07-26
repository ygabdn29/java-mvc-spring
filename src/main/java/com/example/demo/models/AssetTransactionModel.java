package com.example.demo.models;

public class AssetTransactionModel {
  private Integer id;
  private String requestSubmissionTime;
  private String outTime;
  private String returnTime;
  private boolean isApprovedManager;
  private boolean isApprovedAdmin;
  private Integer user_id;
  private Integer admin_id;
  private Integer asset_id;
  
  public AssetTransactionModel(Integer id, String requestSubmissionTime, String outTime, String returnTime,
      boolean isApprovedManager, boolean isApprovedAdmin, Integer user_id, Integer admin_id, Integer asset_id) {
    this.id = id;
    this.requestSubmissionTime = requestSubmissionTime;
    this.outTime = outTime;
    this.returnTime = returnTime;
    this.isApprovedManager = isApprovedManager;
    this.isApprovedAdmin = isApprovedAdmin;
    this.user_id = user_id;
    this.admin_id = admin_id;
    this.asset_id = asset_id;
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

  public boolean isApprovedManager() {
    return isApprovedManager;
  }

  public void setApprovedManager(boolean isApprovedManager) {
    this.isApprovedManager = isApprovedManager;
  }

  public boolean isApprovedAdmin() {
    return isApprovedAdmin;
  }

  public void setApprovedAdmin(boolean isApprovedAdmin) {
    this.isApprovedAdmin = isApprovedAdmin;
  }

  public Integer getUser_id() {
    return user_id;
  }

  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Integer getAdmin_id() {
    return admin_id;
  }

  public void setAdmin_id(Integer admin_id) {
    this.admin_id = admin_id;
  }

  public Integer getAsset_id() {
    return asset_id;
  }

  public void setAsset_id(Integer asset_id) {
    this.asset_id = asset_id;
  }

  
}
