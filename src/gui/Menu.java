package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    public static JLabel lblusuario = new JLabel("Usuario"); // static
    JButton btn1, btn2, btnSalir;

    public Menu(String nombre) {
        setLayout(null); // "" , null(objetos)
        setSize(400, 400);
        setLocationRelativeTo(this);
        setTitle("Menu Principal Bienvenido " + nombre);
        btn1 = new JButton("Operaciones vectores");
        btnSalir = new JButton("Salir");
        btn2 = new JButton("Otros");
        btn1.setBounds(20, 60, 200, 20);
        btn2.setBounds(20, 100, 200, 20);
        btnSalir.setBounds(20, 150, 200, 20);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btnSalir.addActionListener(this);

        add(btn1);
        add(btn2);
        add(btnSalir);

        lblusuario.setText("Usuario :" + nombre);
        lblusuario.setBounds(20, 20, 200, 30);
        add(lblusuario);

        setVisible(true);
    } // fin del constructor
      // public void actionPerformed(ActionEvent boton)

    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btn1) {
            System.out.println("btn1");
        }
        if (boton.getSource() == btn2) {
            System.out.println("btn2");
        }
        if (boton.getSource() == btnSalir) {
            System.out.println("btnSalir");
            new Login();
            dispose();
        }

    }
}// fin clase
