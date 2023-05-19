package com.swaglabs.models;

import java.util.List;

public class PurchaseModels {
    private String productName;
    private String firstName;
    private String lastName;
    private String postalCode;

    public PurchaseModels(List<String> logData) {
        this.productName = logData.get(0);
        this.firstName = logData.get(1);
        this.lastName = logData.get(2);
        this.postalCode = logData.get(3);
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
