package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import utilidades.Operaciones;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Font;
public class Calculadora extends JFrame implements ActionListener{
JLabel lbln1,lbln2;
JTextField txtn1,txtn2,txtres;
JButton btncancel,btnresta,btnmultiplica,btnsuma,btnregresar,
btndivide1,btndivide2;
Font letra = new Font("Arial", Font.BOLD,40);

public Calculadora() {
setLayout(null); //
setTitle("Caculadora ax-z100");
setSize(400, 500);
setLocationRelativeTo(this);
lbln1= new JLabel("Número 1");
lbln2= new JLabel("Número 2");
txtn1=new JTextField("");
txtn2=new JTextField("");
txtres=new JTextField("");
btncancel= new JButton("C");
btnsuma= new JButton("+");
//lbln1.setFont(letra);

lbln1.setBounds(20, 20, 100, 40);
txtn1.setBounds(130, 20, 100, 40);
txtn2.setBounds(130, 70, 100, 40);
txtres.setBounds(130, 110, 100, 40); 
txtres.setFont(letra);
btnsuma.setBounds(240, 20, 80, 40);
//txtn1.setText(""+Operaciones.getRedondear(""+Operaciones.getSuma(),6));
btnsuma.addActionListener(this);
add(txtres);
add(txtn1);
add(txtn2);
add(btnsuma);
add(lbln1);
setVisible(true);// siempre de última
}// fin del constructor
public void actionPerformed(ActionEvent boton) {
String sn1 = txtn1.getText();  
String sn2 = txtn2.getText(); 


    double n2=0.0;
    double n1=0.0;
try {
     n1= Double.parseDouble(sn1);  
} catch (Exception en1) {
   n1=0.0;
} 
try {
    n2= Double.parseDouble(sn2);  
} catch (Exception en1) {
  n2=0.0;
  txtn2.requestFocus();
} 

Operaciones.setN1(n1);
Operaciones.setN2(n2);

if (boton.getSource()==btnsuma){
    if(!(n1==0) && !(n2==0)){
        txtres.setText(""+Operaciones.getSuma());
    } 
 

}

}
    public static void main(String[] args) {
     //   Operaciones.setN1(1.22);
     //   Operaciones.setN2(1.255);
        new Calculadora(); //llamar al constructor
     
     //System.out.println(Operaciones.getSuma());

    }// fin del main

}// fin de la clase