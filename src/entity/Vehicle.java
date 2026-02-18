package entity;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String Vid;
    private String mileage;
    private String fuel;
    private String no;
    private String type;
    private List<Booking> bookings=new ArrayList<>();

    public Vehicle(String vid, String mileage, String no, String fuel, String type) {
        Vid = vid;
        this.mileage = mileage;
        this.no = no;
        this.fuel = fuel;
        this.type = type;
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
}
