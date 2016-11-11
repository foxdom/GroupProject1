import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FrameFour extends JFrame implements ActionListener {
   int labelCount = 0;
   Panel panel;
   FrameFour()
   {
      super();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setSize( 900,900 );
      JButton button = new JButton( "Fork Me" );
      button.addActionListener( this );
      add( button, BorderLayout.CENTER );
      Panel panel = new Panel();
      this.panel = panel;
      panel.setLayout( new FlowLayout() );
      add( panel, BorderLayout.EAST );
      setVisible( true );
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
   public static void main(String[] args)
   {
   FrameFour f4 = new FrameFour();
   }//end main
   
}//end Driver