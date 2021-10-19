package gui;

import javax.swing.JOptionPane;

import arreglos.Arreglo;

public class MostrarArreglo {
  
    byte opcion;
    int elementos;
    Arreglo arreglo;// objeto de tipo arreglo

    public MostrarArreglo() {
        String menu = ("\t\t Bienvenido .\n 1.Cargar Un arreglo.\n 2.Mostrar Un arreglo.\n 3.Buscar.\n 4.Modificar.\n 5.Regresar.\n");
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                elementos = Integer.parseInt(JOptionPane.
                showInputDialog("Digite la longitud del arreglo"));
                String datos[]= new String[elementos];
                for (int i = 0;i<elementos;i++) {
                datos[i] = JOptionPane.showInputDialog("Ingrese dato dato en  pos "+i);

                } // fin para
                arreglo = new Arreglo(datos);
                break;
                
                case 2:
                JOptionPane.showMessageDialog(null,"\n Datos"+arreglo.getDatos());
                    break;
                case 3:
                int pos=0;
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del dato"));
                JOptionPane.showMessageDialog(null, "\n  dato "
                + arreglo.getDatos(pos));   
                break;
                case 4:
                String dato="",nuevodato="";
                dato =JOptionPane.showInputDialog("Ingrese el dato a modificar");
               nuevodato =JOptionPane.showInputDialog("Ingrese el Nuevo dato");
                arreglo.setModificar(dato, nuevodato);
                    break;
                case 5:
                break;    
                default:
                JOptionPane.showMessageDialog(null,"Error 1,2,3 ó 4");
                break;    

            }// fin case

        } while (opcion != 5);
    } // fin constructor
}// fin clase
