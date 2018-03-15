/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO V310
 */
public class TicTacToe extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        new TicTacToe().setVisible(true);
    }
    private TicTacToe(){
        super("Tic Tac Taoe - mike");
        setSize(600, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
       JOptionPane.showMessageDialog(this,"choose 'x' or 'o'");
        JButton butt= new JButton("x");
        JOptionPane.showMessageDialog(this,"choose 'x' or 'o'");
        JButton butt2= new JButton("o");
        butt.addActionListener(this);
        butt2.addActionListener(this);
        add(butt);
        
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //To change body of generated methods, choose Tools | Templates.
         String name= e.getActionCommand();
         if(name.equals("x")){
             JOptionPane.showMessageDialog(this, "you chose x");
             JOptionPane.showMessageDialog(this, "welcome to the game");
         }
         else if(name.equals("o")){
              JOptionPane.showMessageDialog(this, "you chose o");
              JOptionPane.showMessageDialog(this, "welcome to the game");
         }
         
    }
}

