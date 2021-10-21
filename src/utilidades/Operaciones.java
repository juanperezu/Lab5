package utilidades;

public class Operaciones {
private static double n1=0.0, n2=0.0;

public static double getSuma() {
    return n1+n2 ;
}
public static double getMultiplica() {
    return n1*n2;
}

public static double getDivide1() {
    return n1/n2; // cifras decimales
}
public static double getDivide2() {
    return n1%n2; // 0 exacta y 1 si no es exacta
}


public static double getResta() {
    return n1-n2;
}
public static void setN1(double n1) {
    Operaciones.n1 = n1;
}
public static void setN2(double n2) {
    Operaciones.n2 = n2;
} 

public static String getRedondear(String value, int precision) {

    double valor = Double.parseDouble(value);
    int scale = (int) Math.pow(10, precision);
    double var = (double) Math.round(valor * scale) / scale;
    return "" + var;
}
    

}
