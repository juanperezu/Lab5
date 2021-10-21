package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author juanperezu
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String nombre = "";
        int numero = 0;
        double medida = 0;
        float peso = 3;
        boolean respuesta = true;
        String sobrepeso="";
        String datos = "<html><body><table border='1'  >"
                + "<tr><td>Nombre</td><td>Número</td><td>Medida</td><td>Peso</td><td>Sobre Peso</td>  </tr>";
        //System.out.println("Ingrese el nombre");
       // nombre = lea.next();
        String nombres[]={"Juan","Marcos","Pedro","Sacarias"};
       
        //numero = lea.nextInt();
        int numeros[]={11,22,33,44};
        //System.out.println("Ingrese La estatura");
        //medida = lea.nextDouble();
        double medidas[]={1.67,1.45,1.69,1.89};
        double pesos[]={56.1,78.5,45.4,90} ;
       // peso = lea.nextFloat();
       for (int i = 0; i < pesos.length; i++){
        if (pesos[i]>70) {
            sobrepeso="Sí­";
        } else {
          sobrepeso="No";    
        }
        datos+="<tr><td>"+nombres[i]+"</td><td>"+numeros[i]+"</td><td>"+medidas[i] +"</td><td>"+pesos[i]+"</td><td>"+sobrepeso+"</td></tr>"  ;
    }
        datos += "</table></body></html>";
        JOptionPane.showMessageDialog(null, datos);

    }

}
