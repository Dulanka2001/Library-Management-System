/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Home;
import view.Login;

/**
 *
 * @author Dell
 */
public class LoginController {
    
    public static void login(String usName,String pass){
        try{
          String username = null;
          String password = null; 
          
          ResultSet rs = new DBSearch().searchLogin(usName);
          //methana udin search karala mokakahari value ekak thibboth while loop ekata yanwa
          while(rs.next()){
                username=rs.getString("username");//assing username in the Login table to the variable .ekiyanne database eke Login table eke
                password= rs.getString("password");
            }
            if(username != null && password !=null){
                if(password.equals(pass)){
                    System.out.println("Login Succesfully!!");
                    Login.getFrames()[0].dispose();
                    new Home().setVisible(true);
                }
                 else{
                JOptionPane.showMessageDialog(null,"Please check the credentails","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please cheak the credentials","Error",JOptionPane.ERROR_MESSAGE);
             }
          
          DBConnection.closeCon();

        }
        catch(SQLException ex){
           Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE,null,ex);
             
        }
    }
}
