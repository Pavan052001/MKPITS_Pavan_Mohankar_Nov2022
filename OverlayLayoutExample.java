import javax.swing.*;
import java.awt.*;

public class OverlayLayoutExample extends JFrame
{
JPanel p1;
JButton btn1,btn2,btn3;
public OverlayLayoutExample()
{
Container c = getContentPane();

p1 = new JPanel();

OverlayLayout overlay= new OverlayLayout(p1);
p1.setLayout(overlay);

btn1 =new JButton("ok");
Dimension d1 = new Dimension(75,50);
btn1.setMaximumSize(d1);
btn1.setBackground(Color.cyan);


p1.add(btn1);

btn2 =new JButton("retry");
Dimension d2 = new Dimension(125,75);
btn2.setMaximumSize(d2);
btn2.setBackground(Color.blue);

p1.add(btn2);

btn3 =new JButton("cancel");
Dimension d3 = new Dimension(150,100);
btn3.setMaximumSize(d3);
btn3.setBackground(Color.red);

p1.add(btn3);

c.add(p1,"Center");
setSize(300,300);
setVisible(true);
}
public static void main(String args[])
{
new OverlayLayoutExample();
}
}

