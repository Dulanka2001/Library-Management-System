/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class RegistrationController {
    
    public static void Registration(String firstname,String lastname,String email,String username,String password){
        
        new Model.AddUser().Registration(firstname, lastname, email, username, password);
        JOptionPane.showMessageDialog(null, "You registration is done ","Successfully",JOptionPane.INFORMATION_MESSAGE);
      
        
        
    }
     
    
}
