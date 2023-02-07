import java.awt.*;
import javax.swing.*;

 class Dailog_boxes
 {
 JFrame f;
 Dailog_boxes()
 {
   f=new JFrame();
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container c=f.getContentPane();
  c.setLayout(new FlowLayout());


 // JOptionPane.showMessageDialog(c,"alert","alert",JOptionPane.ERROR_MESSAGE);

 // JOptionPane.showInternalMessageDialog(c,"information","information",JOptionPane.INFORMATION_MESSAGE);

 //   JOptionPane.showConfirmDialog(null,"choose one","choose one",JOptionPane.YES_OPTION);

  String inputValue = JOptionPane.showInputDialog("Please input the value");

  f.setSize(200,400);
  f.setVisible(true);
 }
 public static void main(String args[])
 {
  new Dailog_boxes();
 }

 }