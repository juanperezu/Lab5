
package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import users.Usuarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    String ruta = "/imagenes/";
    Usuarios miUsuario = new Usuarios();
    // 1. Declaraciones
    JLabel lblUsuario, lblClave;
    JTextField txtUsuario;
    JPasswordField txtClave;
    JButton btnAceptar, btnCancelar;

    ImageIcon IconOK, IconCancel, IconFondo;

    public Login() {
        setTitle("Ingreso al sistema");
        setLayout(null);// Ignora distribuciones automàticas y aceptar coordenadas definidas
        setSize(600, 400);

        setLocationRelativeTo(this);
        // 2.Inicialar objetos con los contructores de cada clase
        IconOK = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        IconCancel = new ImageIcon(getClass().getResource(ruta + "cancel.png"));

        // fondo
        IconFondo = new ImageIcon(getClass().getResource(ruta + "fondo.png"));
        ((JPanel) getContentPane()).setOpaque(false);
        JLabel lblfondo = new JLabel(IconFondo);
        lblfondo.setBounds(-1, -1, IconFondo.getIconWidth(), IconFondo.getIconHeight());
        getLayeredPane().add(lblfondo, JLayeredPane.FRAME_CONTENT_LAYER);

        lblUsuario = new JLabel("Usuario");
        lblClave = new JLabel("Clave");
        txtUsuario = new JTextField("");
        txtClave = new JPasswordField("");
        btnAceptar = new JButton(IconOK);
        btnCancelar = new JButton(IconCancel);
        // 3. Agregar coordenadas y tamaños a los objetos creados

        lblUsuario.setBounds(10, 20, 100, 20);
        txtUsuario.setBounds(110, 20, 100, 20);
        btnAceptar.setBounds(220, 20, 100, 20);

        lblClave.setBounds(10, 50, 100, 20);
        txtClave.setBounds(110, 50, 100, 20);
        btnCancelar.setBounds(220, 50, 100, 20);

        add(lblUsuario);
        txtUsuario.setToolTipText("Ingrese el usuario asignado");
        add(txtUsuario);
        add(lblClave);
        add(txtClave);

        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);

        add(btnAceptar);
        add(btnCancelar);
        txtClave.setToolTipText("Ingrese el usuario asignado");

        setVisible(true);
    } // constructor de la class Login

    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnCancelar) {
            setBorrar();
        }
        if (boton.getSource() == btnAceptar) {
            setValidarIngreso();
        }

    }// fin actionPerformed

    public void setBorrar() {
        txtClave.setText("");
        txtUsuario.setText("");
        setTitle("Operación cancelada");
    }

    public void setValidarIngreso() {
        String u = txtUsuario.getText();
        String c = txtClave.getText();

        miUsuario.setId(u);
        miUsuario.setClave(c);
        if (miUsuario.getValidarUsuario()) {// true
            setTitle("Bienvenido " + miUsuario.getNombre());
            Menu  m = new Menu(miUsuario.getNombre());   
                 m.lblusuario.setText(m.lblusuario.getText()+ " otro texto static" );
            hide();
        } else {
            setTitle("Error ");// false

        }

    }
}// fin de la clase

