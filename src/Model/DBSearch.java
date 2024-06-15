/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import view. IssueBook;


/**
 *
 * @author Dell
 */
public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
    
    public ResultSet searchLogin(String usName){
        try{
          stmt = DBConnection.getStatmentConnection();
          String name = usName;
          
          rs = stmt.executeQuery("SELECT * FROM login where username='" +name + "'");
        }
        catch(Exception e){
        }
        return rs;
    }
    
    public ResultSet searchIssueBook(){//use to search for book table 
        try{
          stmt = DBConnection.getStatmentConnection();
          
          
          rs = stmt.executeQuery("SELECT * FROM book");
          
        }
        catch(Exception e){            
            e.printStackTrace();        
        }
        
        return rs;
    }
    
    
    public ResultSet searchMember(){
        try{
           stmt = DBConnection.getStatmentConnection(); 
           rs = stmt.executeQuery("SELECT * FROM member");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
}
    
    public ResultSet searchIssuebooktable(){//use to search issue book table in database for return book form.
        try{
           stmt = DBConnection.getStatmentConnection(); 
           rs = stmt.executeQuery("SELECT * FROM issuebook"); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
}
    
    public ResultSet searchBook(){
        try{
          stmt = DBConnection.getStatmentConnection();                  
          rs = stmt.executeQuery("SELECT * FROM book");
        }
        catch(Exception e){
        }
        return rs;
    }
    
    public ResultSet searchReturnbooktable(){//use to search issue book table in database for return book form.
        try{
           stmt = DBConnection.getStatmentConnection(); 
           rs = stmt.executeQuery("SELECT * FROM returnbook"); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs; 
    
    
}
    
     public ResultSet searchEvent(){ 
        try{
          stmt = DBConnection.getStatmentConnection();
          
          
          rs = stmt.executeQuery("SELECT * FROM event");
          
        }
        catch(Exception e){            
            e.printStackTrace();        
        }
        
        return rs;
    }
    


}
