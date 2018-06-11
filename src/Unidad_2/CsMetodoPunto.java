package Unidad_2;
import java.util.ArrayList;
public class CsMetodoPunto {
    
    public ArrayList<csFilaPunto> Punto(double xo, double error, int ite) {

       // double fxi = this.funcionPuntoFijo(xo);
        double errorCalculado = 1;
        //double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaPunto> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaPunto>();
        while (i < ite && errorCalculado > error) {
            csFilaPunto fila = new csFilaPunto();
            fila.setIteraciones(ite); //Asignar contador a primera columna titulo
            fila.setxInicial(xo); //Asignar el parametro del metodo a Xo
            fila.setGxi(this.funcionPuntoFijo(fila.getxInicial()));
            //xanterior = fxi; //Clonar el calculo de Fxi a xanterior
            xo = fila.getGxi(); //Darle el nuevo valor de          
            if (i > 1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((this.funcionPuntoFijo(fila.getxInicial()) - fila.getxInicial()) / this.funcionPuntoFijo(fila.getxInicial()));
                fila.setError(errorCalculado);
            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        return lista;
        
        
    }
        public double funcionPuntoFijo(double x) {
        return Math.pow(2.7182818284590452353602874713527, -x);
    }
    
}
