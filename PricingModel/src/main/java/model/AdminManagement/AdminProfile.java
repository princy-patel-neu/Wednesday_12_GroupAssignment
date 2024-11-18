/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminManagement;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author swara
 */
public class AdminProfile extends Profile{
    
    public AdminProfile(Person p){
        super(p);
        
    }
    
    @Override
    public String getRole(){
        return  "Admin";
    }
}
