package com.example.jasperreport.model;

public class DoctorDetailsModel {

    private String fullAddress ;

    public DoctorDetailsModel(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
