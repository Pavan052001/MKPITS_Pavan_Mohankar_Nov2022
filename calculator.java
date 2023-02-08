
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

 public class calculator implements ActionListener{

 JFrame f;
 TextField t1,t2,t3;
 JButton b1,b2,b3,b4;
 Container  c;
 JLabel l1,l2,l3;

 calculator(){
 f.setDefaultLookAndFeelDecorated(true);
 f  = new JFrame();
 f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

 l1 = new JLabel("Enter first number");
 l2 = new JLabel("Enter Second number");
 l3 = new JLabel("Result");

 c = f.getContentPane();
 f.setLayout(null);

 t1 = new TextField();
 t2 = new TextField();
 t3 = new TextField();

 b1 = new JButton("+");
 b2 = new JButton("-");
 b3 = new JButton("/");
 b4 = new JButton("*");

 l1.setBounds(200,100,200,30);
 t1.setBounds(200,140,200,30);

 l2.setBounds(200,200,200,30);
 t2.setBounds(200,240,200,30);

 l3.setBounds(200,300,200,30);
 t3.setBounds(200,340,200,30);

 b1.setBounds(100,400,90,30);
 b2.setBounds(200,400,90,30);
 b3.setBounds(300,400,90,30);
 b4.setBounds(400,400,90,30);


c.add(l1);
c.add(l2);
c.add(l3);
c.add(t1);
c.add(t2);
c.add(t3);
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

 f.setVisible(true);
 f.setSize(200,200);

 }
 public static void main(String[] args)
 	{
 		new calculater();
 	}


 	public void actionPerformed(ActionEvent e)
 	{

 		int x,y;
 		String s1=t1.getText();
 		String s2=t2.getText();

 		//try
 		//{
 			 x=Integer.parseInt(s1);
 			 y=Integer.parseInt(s2);
 		//}
 		//catch(NumberFormatException d){
 		//	System.out.println("Invalid Input");
 		//}

 		if(e.getSource()==b1)
 		{
 			int z=x+y;
 			String t=Integer.toString(z);
 			t3.setText(t);
 		}

 		if(e.getSource()==b2)
 		{
 			int z=x-y;
 			String t=Integer.toString(z);
 			t3.setText(t);
 		}

 		if(e.getSource()==b3)
 		{
 			int z=x/y;
 			String t=Integer.toString(z);
 			t3.setText(t);
 		}

 		if(e.getSource()==b4)
 		{
 			int z=x*y;
 			String t=Integer.toString(z);
 			t3.setText(t);
 		}

 	}
 }

