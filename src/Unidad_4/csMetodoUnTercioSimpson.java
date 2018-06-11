package Unidad_4;

import java.util.ArrayList;

public class csMetodoUnTercioSimpson {

    double Aprox;

    public ArrayList<csFilaUnTercioSimpson> Trapecio(double a, double b, int N) {

        double xa = a;
        double xb = b;
        double h = (xb - xa) / N;

        ArrayList<csFilaUnTercioSimpson> lista;

        int i = 0;
        lista = new ArrayList<csFilaUnTercioSimpson>();
        double sumaX = 0;
        double sumaY = 0;
        //Ciclo
        for (int j = 0; j < (N + 1); j++) {
            csFilaUnTercioSimpson fila = new csFilaUnTercioSimpson();
            fila.setI(i++);
            fila.setH(h);
            fila.setX(xa + fila.getI() * fila.getH());
            fila.setFx(this.integral(fila.getX()));
            if (i < (N + 1)) {
                //double copyFx = fila.getFx();
                if (i % 2 == 0) {
                    sumaX= sumaX + fila.getFx();
                }else {
                    sumaY = sumaY + fila.getFx();
                }
            }
            lista.add(fila);
        }
        //System.out.println("Suma: " + (suma - a));
        //System.out.println("Par: " + 2 * (sumaY - a));
        //System.out.println("Impar: " + 4 * (sumaX));
        Aprox = h / 3 * (this.integral(a) + 2 * (sumaY - a) + 4 * sumaX + this.integral(b));
        return lista;
    }

    //INTEGRAL
    public double integral(double x) {
        return Math.pow(x, 2);
    }
    csFilaUnTercioSimpson a = new csFilaUnTercioSimpson();

    public String e() {
        return String.valueOf(Aprox);
    }
}
