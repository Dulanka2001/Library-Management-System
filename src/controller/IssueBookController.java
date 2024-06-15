/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;



/**
 *
 * @author Dell
 */
public class IssueBookController {
    
    public static void IssueBook(String bookid,String bookname,String memberid,String membername,String issuedate,String duedate){
        
        new Model.IssueBook().Issue(bookid,bookname,memberid,membername,issuedate,duedate);
        JOptionPane.showMessageDialog(null,"Successfully Update","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }    

    public static void UpdateBook(String isbn,String state) {
        new Model.DBUpdate().UpdateBook(isbn,state);
    }
       
}
