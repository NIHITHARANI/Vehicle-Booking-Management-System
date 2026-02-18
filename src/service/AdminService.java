package service;

import entity.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Admin> admins=new ArrayList<>();

    public void  addAdmin(String Aid,String name,String password,String phone){
        admins.add(new Admin(Aid,name,password,phone));
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

    public Admin findAdminByID(String id) {
        for(Admin admin:admins){
            if(admin.getAid().equals(id))
                return admin;
        }
        return null;
    }
}
