/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Lelu Dallas
 */
public class chatClientGUI extends JFrame implements ActionListener{
   
    JButton connect;
    JButton send;
    
    public chatClientGUI(){
        
        super("Chat Client");
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                
        getContentPane();
        
        connect = new JButton( "start");
        connect.addActionListener(this);
        send = new JButton( "stop");
        send.addActionListener(this);
        
        
        
        
        add(connect);
        add(send);

        
        StyledDocument doc = new DefaultStyledDocument();
        JTextPane pane = new JTextPane(doc) {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawLine(125, 0, 125, getHeight());
        }
        };
        
        setContentPane( new JScrollPane(pane) );

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
