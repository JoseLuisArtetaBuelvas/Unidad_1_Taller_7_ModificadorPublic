package Unidad_2_Taller_7_AccesoPublic;

public class Empleado {
    public String nombre;
    double salario;


    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }else{
            System.err.println("El salario no puede ser menor a cero");
        }
    }
}
