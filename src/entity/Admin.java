package entity;

import javax.swing.text.DefaultEditorKit;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String Aid;
    private String name;
    private String password;
    private String phone;
    private List<Customer> customers=new ArrayList<>();
    private List<Booking> bookings=new ArrayList<>();
    private List<Vehicle> vehicles=new ArrayList<>();

    public Admin(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public String getAid() {
        return Aid;
    }

    public void setAid(String aid) {
        Aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("Admin ID: "+Aid+"Name: "+name+"Phone: "+phone);
    }
}
