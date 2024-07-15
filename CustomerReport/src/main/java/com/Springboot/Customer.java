package com.Springboot;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerContact;
    private Address customerAddress;

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nCustomer Name: " + customerName +
               "\nCustomer Contact: " + customerContact + "\nCustomer Address: " + customerAddress;
    }
}

