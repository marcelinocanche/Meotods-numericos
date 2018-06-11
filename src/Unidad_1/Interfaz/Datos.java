package Interfaz;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Datos {
    public double valorR;
    public double valorA;
    public double opcion;
    public double redondear;
    public double resultado;
    public double decimales;
    public double truncar;

    public double truncar(){
        resultado=valorR-valorA;
        return (valorR-valorA);
    }
    public double redondear(){
        return truncar()/valorR;
    }
    public double nada(){
        return redondear()*100;
    }




    

}
