import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class color_chooser extends JFrame implements ActionListener
{
   JButton btn;
   Container c;
   Color clr;
   public button_color()
   {
	   c=getContentPane();
	   c.setLayout(new FlowLayout());
	   btn = new JButton("change color");
	   btn.addActionListener(this);
	   c.add(btn);


	   setTitle("creating color pallete");
	   setSize(400,400);
	   setVisible(true);
	   }
       public void actionPerformed(ActionEvent e)
       {
		   clr = JColorChooser.showDialog(this,"choose your color",Color.green);
		   c.setBackground(clr);

	   }
          public static void main(String args[]){
             new color_chooser();
		  }
}