package com.example.jasperreport.model;

public class SterilizerInfoModel {

  private String brand;
  private String type;
  private String serialNumber;

  public SterilizerInfoModel(String brand, String type, String serialNumber) {
    this.brand = brand;
    this.type = type;
    this.serialNumber = serialNumber;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
}
