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
public class DBUpdate {
    
     Statement stmt;
     
    public void UpdateBook(String isbn,String bname,String aname,String category,String copies,String rackno){
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("UPDATE `book` SET bname ='"+bname+"',aname = '"+aname+"',category = '"+category+"',copies = '"+copies+"',rackno = '"+rackno+"' WHERE book. isbn = '"+isbn+"'");
            
           // UPDATE `book` SET `bname` = 'Rose', `aname` = 'Mallika' WHERE `book`.`isbn` = '1002'
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void UpdateBook(String isbn,String status){
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("UPDATE `book` SET status ='"+status+"'WHERE book. isbn = '"+isbn+"'");
            
           // UPDATE `book` SET `bname` = 'Rose', `aname` = 'Mallika' WHERE `book`.`isbn` = '1002'
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
  
    public void UpdateMember(String memberid,String firstname,String lastname,String gender,String dfb,String age,String tel,String address,String email ){
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("UPDATE `member` SET membername ='"+firstname+"',memberlastname = '"+lastname+"',gender= '"+gender+"',dfb = '"+dfb+"',age = '"+age+"',telephone = '"+tel+"',address = '"+address+"',email = '"+email+"' WHERE member. memberid = '"+memberid+"'");
            
           // UPDATE `book` SET `bname` = 'Rose', `aname` = 'Mallika' WHERE `book`.`isbn` = '1002'
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

}
