package Unidad_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodoFijo {

    public ArrayList<csFilaFijo> Punto(double x1, double x2, double x3, double ED) {
        double AnteX1 = x1;
        double AnteX2 = x2;
        double AnteX3 = x3;

        double Error;
        ArrayList<csFilaFijo> lista;
        int i = 1;
        lista = new ArrayList<csFilaFijo>();
        do {
            csFilaFijo fila = new csFilaFijo();
            fila.setM1(this.forx1(AnteX2, AnteX3));
            fila.setM2(this.forx2(AnteX1, AnteX3));
            fila.setM3(this.forx3(AnteX1, AnteX2));

            double EX1, EX2, EX3;
            EX1 = Math.abs(fila.getM1() - AnteX1);
            EX2 = Math.abs(fila.getM2() - AnteX2);
            EX3 = Math.abs(fila.getM3() - AnteX3);

            fila.setError(Math.max(Math.max(EX1, EX2), EX3));
            Error = fila.getError();

            AnteX1 = fila.getM1();
            AnteX2 = fila.getM2();
            AnteX3 = fila.getM3();

            lista.add(fila);
            fila.setI(i++);
            
        } while (Error > ED);

        return lista;
    }

    public double forx1(double X2, double X3) {
        return (Math.cos(X2 * X3) / 3) + 0.1666666667;
    }
    public double forx2(double X1, Double X3) {
        return 0.1111111 * Math.sqrt(Math.sin(X3) + Math.pow(X1, 2) + 1.06) - 0.1;
    }
    public double forx3(double X1, double X2) {
        return -Math.pow(Math.E, -X1 * X2) / 20 - (10 * Math.PI - 3) / 60;
    }
}
