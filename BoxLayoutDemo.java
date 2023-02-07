import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BoxLayoutDemo extends JFrame
{
public BoxLayoutDemo()
{
Container contentPane= getContentPane();
contentPane.setLayout(new FlowLayout());

Box horbox = Box.createHorizontalBox();
Box verbox = Box.createVerticalBox();

horbox.add(new JButton("button 1"));
horbox.add(new JButton("button 2"));
horbox.add(new JButton("button 3"));

verbox.add(new JButton(new ImageIcon("dog.jfif")));
verbox.add(new JButton(new ImageIcon("dog.jfif")));
verbox.add(new JButton(new ImageIcon("dog.jfif")));

contentPane.add(horbox);
contentPane.add(verbox);

pack();
setVisible(true);
}
public static void main(String args[])
{
new BoxLayoutDemo();
}
}