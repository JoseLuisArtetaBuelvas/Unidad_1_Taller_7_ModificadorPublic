package Unidad_2_Taller_7_AccesoPublic;

public class ProbarUtilidades {
    public static void main(String[] args){
        Utilidades utilidades = new Utilidades();
        int suma = utilidades.suma(5, 10);
        int resta = utilidades.resta(20, 12);
        int multiplicacion = utilidades.multiplicacion(40, 3);
        int division = utilidades.division(300, 5);
        System.out.println("Suma: " + suma + " " + "Resta: " + resta + " " + "Multiplicacion: " + multiplicacion + " " + "Division: " + division);
    }
}
