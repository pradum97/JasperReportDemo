package com.example.jasperreport.model;

public class CustomerDetailsModel {

  private String customerId;
  private String phoneNumber;
  private String faxNumber;

    public CustomerDetailsModel(String customerId, String phoneNumber, String faxNumber) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
}
