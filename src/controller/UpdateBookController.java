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
public class UpdateBookController {
    public static void UpdateBook(String isbn,String bname,String aname,String category,String copies,String rackno){
        
       new Model.DBUpdate().UpdateBook(isbn, bname, aname, category, copies, rackno);
       JOptionPane.showMessageDialog(null,"Update Succeddfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
}
