/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class AddMember {
    
    Statement stmt;
    
    public void AddMember(String mid,String mfname,String mlname,String gender,String dfb,String age,String tel,String address,String email){
        
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("INSERT INTO member VALUES('"+mid+"','"+mfname+"','"+mlname+"','"+gender+"','"+dfb+"','"+age+"','"+tel+"','"+address+"','"+email+"')");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
