package arreglos;

public class Arreglo {
private String datos[];// una sola dimensión vector   

public Arreglo(String[] datos) {
    this.datos = datos;
}



public void setDatos(String[] datos) {
    this.datos = datos;
}

public String getDatos(){
String llenar="Dato\t    posicion\t   No\n";
for(int i=0; i<datos.length; i++){
    llenar= llenar+"\t"+ datos[i]+ "\t"+"Posición"+i+"\n";
}
return ("Los datos son "+llenar+"\n");
}

public String getDatos(int pos){
    String llenar="Dato\t    posicion\t   No\n";
    //for(int i=0; i<datos.length; i++){
        llenar= llenar+"\t"+ datos[pos]+ "\t"+"Posición"+pos+"\n";
    //}
    return ("El dato es "+llenar+"\n");
    }

 public void setModificar(String dato,String nuevodado) {
 for (int i=0; i<datos.length; i++){
     if (datos[i].equals(dato)){
        datos[i] = nuevodado;
        i=datos.length;
     }
 } 

 }   

}// fin de la clase arreglo
