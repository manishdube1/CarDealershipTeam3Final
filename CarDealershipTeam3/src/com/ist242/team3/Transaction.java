package com.ist242.team3;
import java.util.ArrayList;

/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author: Chris Lemmo
Date Developed: 3/14/19
Last Date Changed: 3/26/19
Rev: 2
 */

enum PaymentType {cash, credit}

public class Transaction {
    /**
     * Hold all the vehicle information
     *
     * @param transactionId    variable
     * @param order variable
     * @param pType variable
     * @author              Manish
     * @version             1.0
     * @since               2019-04-30
     */

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType pType;

    //Constructor Method
    public Transaction(int _transactionId, Order _order, PaymentType _pType){
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public Order getOrder() { return order; }
    public void setOrder(Order _order) {this.order = _order;}

    public PaymentType getPaymentType() { return pType; }
    public void setPaymentType(PaymentType _pType) {this.pType = _pType;}

    public static void listTransactions(ArrayList<Transaction> tList){
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Order:" + trans.getOrder());  //TODO: Print order
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }
}



