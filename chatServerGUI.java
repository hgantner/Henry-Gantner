/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Lelu Dallas
 */
public class chatServerGUI extends JFrame implements ActionListener{

    JButton start;
    JButton stop;
            
            
    public chatServerGUI(){
        super( "Chat Server" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout(new FlowLayout());
        getContentPane();
        
        start = new JButton( "start");
        start.addActionListener(this);
        stop = new JButton( "stop");
        stop.addActionListener(this);
        
        
        
        
        add(start);
        add(stop);

        setSize(300, 300);
       
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    
    public static void main(String args[]){
        chatServerGUI server = new chatServerGUI();
       //       server.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton temp = 
        
    }
    
}
