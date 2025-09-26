package Unidad_2_Taller_7_AccesoPublic;
public class ProbarEmpleado {
    public static void main(String[] args){
        Empleado empleado = new Empleado();
        empleado.setSalario(20000);
        empleado.nombre = "Jose";
        String nombre = empleado.nombre;
        double salario = empleado.getSalario();
        System.out.println(nombre + " " + salario);
    }
}
