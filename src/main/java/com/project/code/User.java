/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author fatin
 */
public class User {
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String phone;
   

    public User(String fullname, String usename, String email, String phone) {
        this.fullname=fullname;
        this.username=usename;
        this.email=email;
        this.phone=phone;
      
    }


   
   /* public String getFullname() {
        return fullname;
    }*/
    
    public String getUsername() {
        return username;
                
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    
    public String getFullName() {
       return fullname;
    }

   
           

    public User(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        show();
    }
    

    private void show() {
        System.out.println("Welcome "+fullname);
    }

   /* public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    public boolean CheckUser (String username, String password){
        if(username.equals(this.username) && password.equals(this.password)){
            System.out.println("Success");
            return true;
        }
        else 
            return false;
    }
    
    public  boolean CheckPassword(String password){
        
        if(password.equals(this.password))
            return true;
        else 
            return false;
    }

    
}
