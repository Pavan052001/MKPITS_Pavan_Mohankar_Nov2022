import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JRadiodemo extends JFrame implements ItemListener
{
JRadioButton shirtbut,pantsbut,sareesbut,brownbut,graybut,creambut;

public JRadiodemo()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());

ButtonGroup group1 = new ButtonGroup();
ButtonGroup group2 = new ButtonGroup();

shirtbut  = new JRadioButton("Shirt");
pantsbut  = new JRadioButton("pant");
sareesbut = new JRadioButton("sarees");
brownbut  = new JRadioButton("brown");
graybut   = new JRadioButton("gray");
creambut =  new JRadioButton("cream");

group1.add(shirtbut);
group1.add(pantsbut);
group1.add(sareesbut);

group2.add(brownbut);
group2.add(graybut);
group2.add(creambut);


c.add(shirtbut);
c.add(pantsbut);
c.add(sareesbut);
c.add(brownbut);
c.add(graybut);
c.add(creambut);


shirtbut.addItemListener(this);
pantsbut.addItemListener(this);
sareesbut.addItemListener(this);
brownbut.addItemListener(this);
graybut.addItemListener(this);
creambut.addItemListener(this);
setTitle("Learning radio buttons");
setSize(250,200);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
String name ="",color ="";
if(shirtbut.isSelected())
name = "Shirt";
else
if(pantsbut.isSelected())
name = "pant";
else
if(sareesbut.isSelected())
name = "sarres";
else
if(brownbut.isSelected())
name = "brown";
else
if(graybut.isSelected())
name = "gray";
else
if(creambut.isSelected())
name = "cream";
JOptionPane.showMessageDialog(null,"you wanted"+name+"in color"+color,"Selection Applications",JOptionPane.INFORMATION_MESSAGE);
}
public static void main(String args[])
{
new JRadiodemo();
}
}





