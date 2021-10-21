package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
public class Calculadora extends JFrame{
JLabel lbln1,lbln2;
JTextField txtn1,txtn2,txtres;
JButton btncancel,btnresta,btnmultiplica,btnsuma,btnregresar,
btndivide1,btndivide2;
Font letra = new Font("Agency FB", Font.BOLD, 50);

public Calculadora() {
setLayout(null); //
setTitle("Caculadora ax-z100");
setSize(400, 500);
setLocationRelativeTo(this);
lbln1= new JLabel("Número 1");
lbln2= new JLabel("Número 2");
txtn1=new JTextField("");

btncancel= new JButton("C");
//lbln1.setFont(letra);
txtn1.setFont(letra);
lbln1.setBounds(20, 20, 100, 40);
txtn1.setBounds(130, 20, 100, 40);

add(txtn1);

add(lbln1);
setVisible(true);// siempre de última
}// fin del constructor

    public static void main(String[] args) {
   
        new Calculadora(); //llamar al constructor
   
    }// fin del main

}// fin de la clase