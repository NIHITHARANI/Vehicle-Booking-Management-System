package entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private String Bid;
    private LocalDateTime start;
    private LocalDateTime end;
    private Customer customer;
    private Payment payment;
    private Vehicle vehicle;
    private double amount;

    public Booking(String bid, Customer customer, LocalDateTime start,LocalDateTime end,double amount) {
        Bid = bid;
        this.customer = customer;
        this.start=start;
        this.end=end;
        this.amount=amount;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void display(){
        System.out.println("Booking ID: "+Bid+"\nCustomer ID :"+customer.getCid()+"\nStart Time: "+start+"\nEnd Time: "+end);
    }
}
