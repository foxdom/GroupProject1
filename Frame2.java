import java.awt.*;
import javax.swing.*;

public class Frame2 extends JFrame {
   
   public void paint(Graphics g){
   super.paint(g); 
    
   //Left Object
   g.setColor(new Color(120,170,200));
   
   g.drawOval(125,90,80,80);
   g.fillOval(125,90,80,80);
   g.drawOval(210,90,80,80);
   g.fillOval(210,90,80,80);
   
   g.drawOval(80,165,80,80);
   g.fillOval(80,165,80,80);
   g.drawOval(255,165,80,80);
   g.fillOval(255,165,80,80);
   
   g.drawOval(125,240,80,80);
   g.fillOval(125,240,80,80);
   g.drawOval(210,240,80,80);
   g.fillOval(210,240,80,80);
   
   g.setColor(new Color(200,120,50));
   
   g.drawOval(188,184,40,40);
   g.fillOval(188,184,40,40);
   
   //Right Object
   g.drawOval(498,186,40,40);
   g.fillOval(498,186,40,40);
   
   g.setColor(new Color(120,170,200));
   
   g.drawOval(508,160,20,20);
   g.fillOval(508,160,20,20);
   g.drawOval(508,234,20,20);
   g.fillOval(508,234,20,20);
   
   g.drawOval(473,197,20,20);
   g.fillOval(473,197,20,20);
   g.drawOval(543,197,20,20);
   g.fillOval(543,197,20,20);
   
   g.drawOval(533,170,20,20);
   g.fillOval(533,170,20,20);
   g.drawOval(533,222,20,20);
   g.fillOval(533,222,20,20);
   g.drawOval(483,170,20,20);
   g.fillOval(483,170,20,20);
   g.drawOval(483,222,20,20);
   g.fillOval(483,222,20,20);
       
 }

   public static void main(String [] args) {

   Frame2 a = new Frame2();
   a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   a.setSize(700,400);   
   a.setVisible(true); 
    
 }
}