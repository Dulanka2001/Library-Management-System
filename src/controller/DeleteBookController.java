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
public class DeleteBookController {
    
    public static void deletebook(String bookid){
        
        new Model.DBDelete().deletebook(bookid);        
        JOptionPane.showMessageDialog(null,"Delete Succeddfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
}