package entity;

import java.awt.print.Book;

public class Payment {
    private String Pid;
    private Booking book;
    private String amount;

    public Payment(String pid, Booking bid, String amount) {
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

    public Booking getBid() {
        return book;
    }

    public void setBid(Booking bid) {
        book = bid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void display(){
        System.out.println("Payment ID: "+Pid+"Amount: "+amount+"Booking ID: "+ book.getBid());
    }
}
