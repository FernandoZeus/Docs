import java.util.Date;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;


public class Botones{
    public static void main(String[] args) {
      
       JRadioButton boton1=new JRadioButton("NÚMERO 1");
       JRadioButton boton2=new JRadioButton("NÚMERO 2");
     
        ButtonGroup group = new ButtonGroup();
        group.add(boton1);
        group.add(boton2);
      
        JPanel panel = new JPanel();
        JButton button = new JButton("Ir");
        panel.add(button);
        panel.setVisible(true);
           
         JFrame frame = new JFrame();
         frame.setSize(200, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setLayout(null);
      
       ArrayList  suma = new ArrayList ();

          final int NumeroMaximo = 5;
          int numero=0;
          
          
          while(numero != 5){
            suma.add(numero);
            numero++;
            
            System.out.print(suma.size());
          }