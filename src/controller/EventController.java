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
public class EventController {
    
    public static void Event(String event,String date,String time,String special){
        
        new Model.AddEvent().Event(event, date, time, special);
        JOptionPane.showMessageDialog(null,"New Event Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
