package Unidad_2_Taller_7_AccesoPublic;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }else{
            System.out.println("El saldo no puede ser igual a 0");
        }
    }

    public void detallesCuenta(){
        System.out.println("Numero de cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", tipoCuenta: " + tipoCuenta);
    }
}
