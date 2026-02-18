package entity;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String Vid;
    private String mileage;
    private String fuel;
    private String no;
    private String type;
    private int price;

    public Vehicle(String vid, String no, String type, String fuel, String mileage,int price) {
        Vid = vid;
        this.mileage = mileage;
        this.no = no;
        this.fuel = fuel;
        this.type = type;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVid() {
        return Vid;
    }

    public void setVid(String vid) {
        Vid = vid;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Vehicle ID: "+Vid+"\nType: "+type+"\nFuel Type: "+fuel+"\nPlate No: "+no+"\nMileage: "+mileage+"\nPrice: "+price);
    }
}
