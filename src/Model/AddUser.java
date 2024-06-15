/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class AddUser {
    
    Statement stmt;
    
    public void Registration(String firstname,String lastname,String email,String username,String password){
         
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("INSERT INTO login VALUES ('"+firstname+"','"+lastname+"','"+email+"','"+username+"','"+password+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        
    
}
