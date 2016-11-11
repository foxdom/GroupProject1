import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame1 extends JFrame implements ItemListener{
   
   JFrame f2;
   JFrame f3;
   JFrame f4;
   
   public void init() {
      CheckboxGroup cbg = new CheckboxGroup();
      Checkbox cb1 = new Checkbox("Circles", cbg, false);
      cb1.addItemListener(this);
      
      Checkbox cb2 = new Checkbox("Regions", cbg, false);
      cb2.addItemListener(this);
      
      Checkbox cb3 = new Checkbox("Labels", cbg, false);
      cb3.addItemListener(this);
      
      add(cb1);
      add(cb2);
      add(cb3);
      
      f2 = new JFrame();
      f3 = new JFrame();
      f4 = new JFrame();
      
   }
   
   public static void main (String[] args) {
      Frame1 f1=new Frame1();
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new FlowLayout());
      f1.init();
      f1.setSize(300,100);
      f1.setVisible(true);
     
   }
   
   public void itemStateChanged(ItemEvent ie){
      Checkbox cb = (Checkbox)ie.getItemSelectable();
      String text=cb.getLabel();
      
      f2.setVisible(false);
      f3.setVisible(false);
      f4.setVisible(false);
      
      if (text=="Circles"){
         f2.setVisible(true);
      }
      if (text=="Regions"){
         f3.setVisible(true);
      }
      if (text=="Labels"){
         f4.setVisible(true);
      }
   }
}