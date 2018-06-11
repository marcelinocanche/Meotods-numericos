package Unidad_4;

import java.util.ArrayList;

public class csMetodoReglaTrapecio {
    double Aprox;
    public ArrayList<csFilaReglaTrapecio> Trapecio(double a, double b, int N) {
        //Calcular h
        double xa = a;
        double xb = b;
        double h = (xb - xa) / N;
        //Generar tabla
        ArrayList<csFilaReglaTrapecio> lista;

        //Contador i++
        int i = 0;
        lista = new ArrayList<csFilaReglaTrapecio>();
        double suma = 0;
        //Ciclo
        for (int j = 0; j < (N + 1); j++) {
            csFilaReglaTrapecio fila = new csFilaReglaTrapecio();
            fila.setI(i++);
            fila.setH(h);
            fila.setX(xa + fila.getI() * fila.getH());
            fila.setFx(this.integral(fila.getX()));
            if (i < (N + 1)) {
                //double copyFx = fila.getFx();
                suma = suma + fila.getFx();
            }
            lista.add(fila);
        }
        //System.out.println("Suma: " + (suma - a));
        Aprox = h / 2 * (this.integral(a) + 2*(suma - a) + this.integral(b));
        return lista;
    }

    //INTEGRAL
    public double integral(double x) {
        return Math.pow(x, 2);
    }
    csFilaReglaTrapecio a = new csFilaReglaTrapecio();
    public String e() {
        return String.valueOf(Aprox);
    }
}
