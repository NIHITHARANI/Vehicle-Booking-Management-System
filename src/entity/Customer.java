package entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String Cid;
    private String name;
    private String password;
    private String phone;
    private List<Booking> bookings=new ArrayList<>();

    public Customer(String cid, String phone, String password, String name) {
        Cid = cid;
        this.phone = phone;
        this.password = password;
        this.name = name;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
