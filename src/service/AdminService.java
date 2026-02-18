package service;

import entity.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Admin> admins=new ArrayList<>();

    public void  addAdmin(String name,String password,String phone){
        admins.add(new Admin(name,password,phone));
        System.out.println("Admin Added Successfully");
    }

    public void vieweAdmin(){
        if(admins.isEmpty()) {
            System.out.println("No Admin found");
            return;
        }
        for(Admin admin:admins)
            admin.display();
        System.out.println("Admins displayed successfully");
    }

}
