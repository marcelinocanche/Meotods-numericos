
package Unidad_5;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CsMetodoN {
    
    double[] b;
    boolean[][] yaCalculado;     // Â¿El valor ya fue calculado?
    double[][] calculoPrevio;    // Valor previamente calculado
    double[] x;
    double[] fx;
    
        
        public double[] solucionar(double[] x, double[] fx) {
        int n = x.length;
        b = new double[n];
        yaCalculado = new boolean[n][n];
        calculoPrevio = new double[n][n];
        
        //Metodos.x = x;
       // Metodos.fx = fx;
        
        b[0] = fx[0];
        diferenciasDivididas(x.length-1, 0);
        return b;
    }
        
        public double diferenciasDivididas(int i, int k) {
            
        if (i == k) return fx[i];
        double f1 = 0;
        if (yaCalculado[i-1][k]) {
            f1 = calculoPrevio[i-1][k];
        } else {
            f1 = diferenciasDivididas(i-1, k);
        }
        double f2 = 0;
        if (yaCalculado[i][k+1]) {
            f2 = calculoPrevio[i][k+1];
        } else {
            f2 = diferenciasDivididas(i, k+1);
        }
        double dd = (f1 - f2) / (x[k] - x[i]);
        yaCalculado[i][k] = true;
        calculoPrevio[i][k] = dd;
        if (k == 0)     // b[i] = f[i,0]
            b[i] = dd;
        return dd;
    }
        
        public double calcularValor(double x, double[] b, double[] xs) {
        double res = 0;
        for (int i = 0; i < b.length; i++) {
            double acum = b[i];
            for (int j = 0; j < i; j++)
                acum *=  (x - xs[j]);
            res += acum;
        }
        return res;
    }
    
    public ArrayList<csFilaN> interpolacionN(int t){
        
        //int i;
        
        this.x= new double[t];
        this.fx= new double[t];
        //------------------------
        double array[];
        array=new double[t];
        this.x=array;
        double array2[];
        array2=new double[t];
        this.fx=array2;

        ArrayList<csFilaN> lista;
        int i=0;
        lista = new ArrayList<csFilaN>();
        
        for(int h=0;h<x.length;h++){
            
            double valor1=Double.parseDouble(JOptionPane.showInputDialog(null," Dame x   "));
            array[h]=valor1;
            double valor2=Double.parseDouble(JOptionPane.showInputDialog(null," Dame f(x)"));
            array2[h]=valor2;
           // array[h]=Double.parseDouble(JOptionPane.showInputDialog(null," Escribe los valores de x"));
           
        csFilaN fila = new csFilaN();
        fila.setI(h);
        fila.setX(valor1);
fila.setY(valor2);
        lista.add(fila);
        }
        
      /*  for(int y=0;y<fx.length;y++){
            //this.fx[y]=Double.parseDouble(JOptionPane.showInputDialog(null," escribe FX"));
            //array2[y]=Double.parseDouble(JOptionPane.showInputDialog(null," Escribe los valores f(x) "));
            double valor2=Double.parseDouble(JOptionPane.showInputDialog(null," Escribe FX"));
            array2[y]=valor2;
                    csFilaN fila = new csFilaN();
                    //fila.setI(i);
                    fila.setY(valor2);
                    lista.add(fila);
        }*/

return lista;
    }

}
