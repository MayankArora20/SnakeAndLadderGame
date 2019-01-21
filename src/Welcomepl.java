
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;

public class Welcomepl extends Frame implements ActionListener
{

 JLabel lw,lt;//lwelcome ltitle
 Button pl[]=new Button[4];
 Board ob;
 Welcomepl()
 {
   resize(400,400);
   setBackground(Color.yellow);
   addWindowListener(new Close());
   int i;  
   lw=new JLabel("    welcome to");
   lt=new JLabel("  SANKE&LaddERS");
   add(lw);     add(lt);
   for(i=1;i<4;i++)
   {
       pl[i]=new Button("   player    "+(i+1));
       pl[i].addActionListener(this); 
      add(pl[i]);
   }   
   setLayout(null);
   lw.setBounds(100,20,200,30);      lw.setForeground(Color.blue);
   lt.setBounds(100,40,200,30);      lt.setForeground(Color.blue);
   pl[1].setBounds(90,150,100,30);     pl[2].setBounds(100,200,100,30);     pl[3].setBounds(110,250,100,30);
   for(i=1;i<4;i++)
   pl[i].setBackground(Color.red);
   
}
public void actionPerformed(ActionEvent k)
  {
      int m;
    if(k.getSource()==pl[0])
      {m=1;     
          Board b=new Board(m);      
          b.setVisible(true);        setVisible(false);   }
    else
     if(k.getSource()==pl[1])
     {  m=2;          Board b=new Board(m);      b.setVisible(true);       setVisible(false); }
     else
      if(k.getSource()==pl[2])
      { m=3;          Board b=new Board(m);       b.setVisible(true);       setVisible(false); }
      else 
     { m=4;           Board b=new Board(m);      b.setVisible(true);       setVisible(false); }
        

}
}

