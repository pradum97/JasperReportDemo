package com.example.jasperreport.model;

public class KitInfoModel {
    private String kitNumber;
    private String expiryDate;


    public KitInfoModel(String kitNumber, String expiryDate) {
        this.kitNumber = kitNumber;
        this.expiryDate = expiryDate;
    }

    public String getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(String kitNumber) {
        this.kitNumber = kitNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
