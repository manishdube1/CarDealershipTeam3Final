package com.ist242.team3;

/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author: Team 3
Date Developed: 3/14/19
Last Date Changed: 3/27/19
Rev: 2
 */

import java.util.ArrayList;

public class dealership {
    /**
     * Hold all the vehicle information
     *
     * @param dealAddress     variable
     * @param dealPhoneNumber  variable
     * @param dealEmail  variable
     * @param dealHours   variable
     * @author Virginia Hoffman
     * @version 1.0
     * @since 2019-04-30
     */
    private String dealAddress;
    private String dealPhoneNumber;
    private String dealEmail;
    private String dealHours;


    public dealership(String _Address, String _PhoneNumber, String _Email, String _Hours) {
        this.dealAddress = _Address;
        this.dealPhoneNumber = _PhoneNumber;
        this.dealEmail = _Email;
        this.dealHours = _Hours;
    }

    public String getAddress() {
        return dealAddress;
    }

    public void setAddress(String newAddress) {
        this.dealAddress = newAddress;
    }

    public String getPhoneNumber() {
        return dealPhoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.dealPhoneNumber = newPhoneNumber;
    }

    public String getEmail() {
        return dealEmail;
    }

    public void setEmail(String newEmail) {
        this.dealEmail = newEmail;
    }

    public String getHours() {
        return dealHours;
    }

    public void setHours(String newHours) {
        this.dealHours = newHours;
    }

    public static void dealInfo(ArrayList<dealership> dList) {
        for (dealership dealership : dList) {
            System.out.println("Address " + dealership.getAddress());
            System.out.println("Phone Number: " + dealership.getPhoneNumber());
            System.out.println("Email: " + dealership.getEmail());
            System.out.println("Hours: " + dealership.getHours());

        }
    }
}