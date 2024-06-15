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
public class ReturnBook {
    
    Statement stmt;
    public void ReturnForm(String memberid,String membername,String bookid,String bookname,String issuedate,String returndate,String fineamount,String finemetheod ){
            try{
                stmt = DBConnection.getStatmentConnection();
                stmt.executeUpdate("INSERT INTO returnbook VALUES('"+memberid+"','"+membername+"','"+bookid+"','"+bookname+"','"+issuedate+"','"+returndate+"','"+fineamount+"','"+finemetheod+"')");
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
