/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author LENOVO V310
 */
public class Jframe extends JFrame{
    public void jframe(){
         new Jframe().setVisible(true);
    }
    public Jframe(){
        super("Frame");
        setSize(600, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton butt= new JButton("click me");
        add(butt);
        
        
        
        
        
        
    } 
    
}
