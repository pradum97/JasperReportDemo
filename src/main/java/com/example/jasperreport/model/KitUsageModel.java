package com.example.jasperreport.model;

import java.util.Date;

public class KitUsageModel {
    private long kitNumber;
    private Date testDate;
    private String testResult;

    public KitUsageModel(long kitNumber, Date testDate, String testResult) {
        this.kitNumber = kitNumber;
        this.testDate = testDate;
        this.testResult = testResult;
    }

    public long getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(long kitNumber) {
        this.kitNumber = kitNumber;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}
