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
public class AddEvent {
    
    Statement stmt;
    
    public void Event(String event,String date,String time,String special){
        
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("INSERT INTO event VALUES('"+event+"','"+date+"','"+time+"','"+special+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
