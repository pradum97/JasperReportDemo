package com.example.jasperreport.model;

public class KitUsageModel {
    private String kitNumber;
    private String dateOfTest;
    private String result;

    public KitUsageModel(String kitNumber, String dateOfTest, String result) {
        this.kitNumber = kitNumber;
        this.dateOfTest = dateOfTest;
        this.result = result;
    }

    public String getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(String kitNumber) {
        this.kitNumber = kitNumber;
    }

    public String getDateOfTest() {
        return dateOfTest;
    }

    public void setDateOfTest(String dateOfTest) {
        this.dateOfTest = dateOfTest;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
