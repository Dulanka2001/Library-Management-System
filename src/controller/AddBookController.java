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
public class AddBookController {
    
    public static void AddBook(String isbn,String bname,String aname,String category,String copies,String rackno,String status){
            
        new Model.AddBook().AddBook(isbn, bname, aname, category, copies, rackno,status);
        JOptionPane.showMessageDialog(null,"New Book Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
