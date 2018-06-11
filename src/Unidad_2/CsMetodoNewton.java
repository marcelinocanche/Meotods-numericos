package Unidad_2;
import java.util.ArrayList;

public class CsMetodoNewton {
    
     public ArrayList<csFilaNewton> Newton(double xo, double Error) {

        //double fxo = this.funNormal(xo);
        //double fxdo = this.funDerivado(xo);
        double errorCalculado = 1;
        double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaNewton> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaNewton>();
        while (errorCalculado > Error) {
            csFilaNewton fila = new csFilaNewton();
            fila.setIteracion(i); //Asignar contador a primera columna titulo
            fila.setXinicial(xo); //Asignar el parametro del metodo a Xo
            
            double fxo = this.Funcion(fila.getXinicial());
            double fxdo = this.FuncionDerivada(fila.getXinicial());
            
            fila.setFx(fxo); //Asignar la funcion normal
            fila.setDfx(fxdo); //Asignar la funcion derivada
            fila.setSuma(fila.getXinicial() - (fxo / fxdo)); //Asignar la division de F(x)/FÂ´(x)
            xanterior = fila.getXinicial(); //Clonar el calculo de Fxi a xanterior
            xo = fila.getSuma(); //Darle el nuevo valor de          
            if (i > 1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((fila.getSuma() - fila.getXinicial()) / fila.getSuma());
                fila.setError(errorCalculado);

            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        if (errorCalculado < Error) {
            return lista;
        } else {
            return null;
        }

    }
    //////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////
    public double Funcion(double x) {
        return Math.pow(2.7182818284590452353602874713527, -x) - x;
    }

    public double FuncionDerivada(double x) {
        return -Math.pow(2.7182818284590452353602874713527, -x) - 1;
    }

    
}
