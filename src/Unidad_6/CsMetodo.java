
package Unidad_6;

import java.util.ArrayList;

public class CsMetodo {
    
    public ArrayList<CsFila>paso(double y,double inicio, double fin){
        
        double ANTERIOR=y;
        double RESTA=(fin-inicio);
        double f=RESTA*2;
        //double DIVISION=inicio/2;
       // double DIVISION=inicio/2;
        ArrayList<CsFila>lista;
        int i=1;
      // double x=0/2;
        double h=0.5;
        lista = new ArrayList<CsFila>();
        
        while(i<=f){
            CsFila fila = new CsFila();
            fila.setI(i);
            System.out.println(" iteracion:"+fila.getI());
            fila.setX(inicio/2);

            fila.setFuncion(ANTERIOR+h*(this.funcion(inicio/2)));             
            System.out.println(" f:"+this.funcion(inicio/2));
            System.out.println(" funcion:"+fila.getFuncion());
            
            ANTERIOR=fila.getFuncion();
 inicio++;
 /*
            if(i>1){
            fila.setFuncion((fila.getFuncion()+h)*(this.funcion(x)));
                System.out.println(" calculo::"+this.funcion(x));
                System.out.println(" funcion1:"+fila.getFuncion());
            }else{
            fila.setFuncion(y+h*(this.funcion(inicio)));   
                System.out.println(" funcion:"+fila.getFuncion());
            }
*/
          //  x++;
            i++;
            
            
            lista.add(fila);
        }
        return lista;
    }
 
    private double funcion(double x){
     return (-2*(Math.pow(x, 3)))+(12*(Math.pow(x, 2)))-(20*(x))+(8.5);
    }
    
}
