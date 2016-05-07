/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectData;

import javax.swing.JFrame;

/**
 *
 * @author samarthmadduru
 */
public class NewClass {
    
    public static void main(String[] args){
        JFrame myFrame = new JFrame("RevMeUp");
    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myFrame.getContentPane().add(new MyPanel());
        
        myFrame.pack();
        
        myFrame.setVisible(true);
    }
    
    
    
    
}
