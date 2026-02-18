package entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Booking {
    private String Bid;
    private int duration;
    private Customer customer;
    private Payment payment;
    private Vehicle vehicle;

    public Booking(String bid, Customer customer,int duration) {
        Bid = bid;
        this.customer = customer;
        this.duration=duration;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
        System.out.println("Booking ID: "+Bid+"Customer ID :"+customer.getCid()+"Duration: "+duration);
    }
}
