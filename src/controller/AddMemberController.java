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
public class AddMemberController {
    
    public static void AddMember(String mid,String mfname,String mlname,String gender,String dfb,String age,String tel,String address,String email){
        
        new Model.AddMember().AddMember(mid, mfname, mlname, gender, dfb, age, tel, address, email);
        JOptionPane.showMessageDialog(null,"New Member Added Successfull","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
