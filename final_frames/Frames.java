import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame1 extends JFrame implements ItemListener{
   
   Frame2 f2;
   Frame3 f3;
   Frame4 f4;
   
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
      
      f2 = new Frame2();
      f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      f2.setSize(700,400);
      f3 = new Frame3();
      f4 = new Frame4();
      
   }
   
   /*public static void main (String[] args) {
      Frame1 f1=new Frame1();
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new FlowLayout());
      f1.init();
      f1.setSize(700,400);
      f1.setVisible(true);

      Frame2 f2 = new Frame2();
      f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      f2.setSize(700,400);   
      //f2.setVisible(true); 
      
      Frame3 f3 = new Frame3();

      Frame4 f4 = new FrameFour();
   }*/ 
   
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

class Frame2 extends JFrame {
   
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

   /*public static void main(String [] args) {

   Frame2 a = new Frame2();
   a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   a.setSize(700,400);   
   a.setVisible(true); 
    
 } */
}

class Frame3 extends JFrame{
    JButton b;
    Color cArray[] = new Color []{Color.blue, Color.black, Color.black, Color.yellow, Color.red, Color.white};
    Random r = new Random();
    Panel north = new Panel();
    Panel south = new Panel();
    Panel east = new Panel();
    Panel west = new Panel();
    Panel pArray[] = new Panel []{north, south, east, west};
    public Frame3(){
        setSize(700,400);
        b = new JButton();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        add(b, BorderLayout.CENTER);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        //setVisible(true);
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

class Frame4 extends JFrame implements ActionListener {
   int labelCount = 0;
   Panel panel;
   Frame4()
   {
      super();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setSize( 700,400 );
      JButton button = new JButton( "Fork Me" );
      button.addActionListener( this );
      add( button, BorderLayout.CENTER );
      Panel panel = new Panel();
      this.panel = panel;
      panel.setLayout( new FlowLayout() );
      add( panel, BorderLayout.EAST );
      //setVisible( true );
   }
   
   
   public void actionPerformed( ActionEvent e )
   {
      switch ( labelCount )
      {
         case 0:        
            JLabel expensive = new JLabel( "Too expensive" );
            panel.add( expensive );
            panel.revalidate();
            labelCount++;
            break;
         
         case 1:
            JLabel flimsy = new JLabel( "Too flimsy" );
            panel.add( flimsy );
            panel.revalidate();
            labelCount++;
            break;
            
         case 2:
            JLabel bulky = new JLabel( "Too bulky" );
            panel.add( bulky );
            panel.revalidate();
            labelCount++;
            break;
            
         case 3:
            JLabel feminine = new JLabel( "Too feminine" );
            panel.add( feminine );
            panel.revalidate();
            labelCount++;
            break;
            
         case 4:
            JLabel masculine = new JLabel( "Too masculine" );
            panel.add( masculine );
            panel.revalidate();
            labelCount++;
            break;  
                   
      }//end switch
      
   }//end actionPerformed
   
}//end FrameFour


class Driver {
  public static void main (String[] args) {
      Frame1 f1=new Frame1();
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new FlowLayout());
      f1.init();
      f1.setSize(700,400);
      f1.setVisible(true);

   } //end main
   
}//end Driver