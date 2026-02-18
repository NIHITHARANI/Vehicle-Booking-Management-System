package entity;

import java.awt.print.Book;

public class Payment {
    private String Pid;
    private String book;
    private double amount;

    public Payment(String pid, String  bid, double amount) {
        Pid = pid;
        book = bid;
        this.amount = amount;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        Pid = pid;
    }

    public String getBid() {
        return book;
    }

    public void setBid(String bid) {
        book = bid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void display(){
        System.out.println("Payment ID: "+Pid+"\nAmount: "+amount+"\nBooking ID: "+ book);
    }
}
