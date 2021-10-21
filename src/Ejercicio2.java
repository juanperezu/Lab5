import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {

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
        System.out.println("Ingrese el nombre");
        nombre = lea.next();
        System.out.println("Ingrese el Número");
        numero = lea.nextInt();
        System.out.println("Ingrese La estatura");
        medida = lea.nextDouble();
        System.out.println("Ingrese El peso");
        peso = lea.nextFloat();
        if (peso>70) {
            sobrepeso="Sí";
        } else {
          sobrepeso="No";    
        }
        datos+="<tr><td>"+nombre+"</td><td>"+numero+"</td><td>"+medida +"</td><td>"+peso+"</td><td>"+sobrepeso+"</td></tr>"  ;
        
        datos += "</table></body></html>";
        JOptionPane.showMessageDialog(null, datos);

    }

}
