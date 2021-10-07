package gui;

import javax.swing.JOptionPane;

import arreglos.Arreglo;

public class MostrarArreglo {
    byte opcion;
    int elementos;
    Arreglo arreglo;// objeto de tipo arreglo

    public MostrarArreglo() {
        String menu = ("\t\t Bienvenido .\n 1.Cargar Un arreglo.\n 2.Mostrar Un arreglo.\n 3.Buscar.\n 4.Regresar.\n");
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                JOptionPane.showMessageDialog(null,"Error 1,2,3 ó 4");
                break;    

            }// fin case

        } while (opcion != 4);
    } // fin constructor
}// fin clase
