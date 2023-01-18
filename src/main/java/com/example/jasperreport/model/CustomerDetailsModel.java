package com.example.jasperreport.model;

public class CustomerDetailsModel {

  private long customerId;
  private String phoneNumber;
  private String faxNumber;
  private String doctorDetails;

    public CustomerDetailsModel(long customerId, String phoneNumber, String faxNumber, String doctorDetails) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.doctorDetails = doctorDetails;
    }

    public String getDoctorDetails() {
        return doctorDetails;
    }

    public void setDoctorDetails(String doctorDetails) {
        this.doctorDetails = doctorDetails;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
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
