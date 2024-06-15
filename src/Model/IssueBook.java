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
public class IssueBook {
    
    Statement stmt;
    
    public void Issue(String bookid,String bookname,String memberid,String membername,String issuedate,String duedate){
        
        try{
            stmt = DBConnection.getStatmentConnection();
            stmt.executeUpdate("INSERT INTO issuebook VALUES('"+bookid+"','"+bookname+"','"+memberid+"','"+membername+"','"+issuedate+"','"+duedate+"')");
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
