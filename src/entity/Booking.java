package entity;

import java.sql.Date;
import java.sql.Time;

public class Booking {
    private String Bid;
    private Date start_date;
    private Date end_date;
    private Time start_time;
    private Time end_time;
    private Customer customer;
    private Payment payment;
    private Vehicle vehicle;

    public Booking(String bid, Customer customer, Time end_time, Time start_time, Date end_date, Date start_date) {
        Bid = bid;
        this.customer = customer;
        this.end_time = end_time;
        this.start_time = start_time;
        this.end_date = end_date;
        this.start_date = start_date;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
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
        System.out.println("Booking ID: "+Bid+"Customer ID :"+customer.getCid()+"Start Date: "+start_date+"Start Time: "+start_time+"End Date: "+end_date+"End Time: "+end_time+"Vehicle Number: "+vehicle.getNo()+"Vehicle Type: "+vehicle.getType());
    }
}
