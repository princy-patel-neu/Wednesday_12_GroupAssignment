/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminManagement;

import java.util.ArrayList;
import model.Business.Business;
import model.Personnel.Person;

/**
 *
 * @author Swara
 */
public class AdminDirectory {
    Business business;
    ArrayList<AdminProfile> adminlist;
    
    public AdminDirectory(Business d){
        business = d;
        adminlist = new ArrayList();
    }
    
    public AdminProfile newAdminProfile(Person p){
        AdminProfile ap = new AdminProfile(p);
        adminlist.add(ap);
        return ap;
    }
}
