/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ReturnBookController {
    
    public static void ReturnForm(String memberid,String membername,String bookid,String bookname,String issuedate,String returndate,String fineamount,String finemetheod ){
    
            new Model.ReturnBook().ReturnForm(memberid, membername, bookid, bookname, issuedate, returndate, fineamount, finemetheod);
            JOptionPane.showMessageDialog(null,"Update Successfull","Successfull",JOptionPane.INFORMATION_MESSAGE);
            
    }
    public static void deleteIssuebooktable(String memberid){
        
        new Model.DBDelete().deleteIssuebooktable(memberid);
        //JOptionPane.showMessageDialog(null,"New Book Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void UpdateBook(String isbn,String state) {
        new Model.DBUpdate().UpdateBook(isbn,state);
    }
    

}
