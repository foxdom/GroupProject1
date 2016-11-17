import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame3 extends JFrame{
    JButton b;
    Color cArray[] = new Color []{Color.blue, Color.black, Color.black, Color.yellow, Color.red, Color.white};
    Random r = new Random();
    Panel north = new Panel();
    Panel south = new Panel();
    Panel east = new Panel();
    Panel west = new Panel();
    Panel pArray[] = new Panel []{north, south, east, west};
    public Frame3(){
        setSize(500,500);
        b = new JButton();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        add(b, BorderLayout.CENTER);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        setVisible(true);
        for(Panel p : pArray){
            p.setBackground(cArray[r.nextInt(cArray.length)]);
        }
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pArray[r.nextInt(pArray.length)].setBackground(cArray[r.nextInt(cArray.length)]);
            }
        });
    }
    
    
}