/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class AddBook {
    
    Statement stmt;
    
    public void AddBook(String isbn,String bname,String aname,String category,String copies,String rackno,String status){
        
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("INSERT INTO book VALUES('"+isbn+"','"+bname+"','"+aname+"','"+category+"','"+copies+"','"+rackno+"','"+status+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
