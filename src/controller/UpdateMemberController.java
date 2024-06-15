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
public class UpdateMemberController {
    
    public static void UpdateMember(String memberid,String firstname,String lastname,String gender,String dfb,String age,String tel,String address,String email ){
        
        new Model.DBUpdate().UpdateMember(memberid, firstname, lastname, gender, dfb, age, tel, address, email);
       JOptionPane.showMessageDialog(null,"Update Succeddfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
