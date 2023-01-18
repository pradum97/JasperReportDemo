package com.example.jasperreport.model;

import java.util.Date;

public class KitInfoModel {
    private long kitNumber;
    private Date expiryDate;


    public KitInfoModel(long kitNumber, Date expiryDate) {
        this.kitNumber = kitNumber;
        this.expiryDate = expiryDate;
    }

    public long getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(long kitNumber) {
        this.kitNumber = kitNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
