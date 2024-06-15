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
 * 
 */
    
public class DBDelete {
    Statement stmt;
    
    
    public void deleteIssuebooktable(String memberid){
        try{
                    
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("DELETE FROM `issuebook` WHERE `issuebook`.`memberid` ='"+memberid+"'");
        
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
}
    
    public void deletebook(String bookid){
        try{
                    
            stmt = DBConnection.getStatmentConnection();
            JOptionPane.showMessageDialog(null,"If you delet,Unrecoverable data were selected","Error",JOptionPane.ERROR_MESSAGE);
            stmt.executeUpdate("DELETE FROM `book` WHERE `book`.`isbn` ='"+bookid+"'");
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
}
    
    public void deletemember(String memberid){
        try{
                    
            stmt = DBConnection.getStatmentConnection();
            JOptionPane.showMessageDialog(null,"If you delet,Unrecoverable data were selected","Error",JOptionPane.ERROR_MESSAGE);
            stmt.executeUpdate("DELETE FROM `member` WHERE `member`.`memberid` ='"+memberid+"'");
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
}
   }
