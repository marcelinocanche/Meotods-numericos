package Unidad_2;

import java.util.ArrayList;

public class csMetodoSecante {
    public ArrayList<csFilaSecante> Secante(double x1, double x2, double errorDeseado) {

        double errorI = 1;
        double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaSecante> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaSecante>();
        //i < iteraciones && 
        while (errorI > errorDeseado) {
            csFilaSecante fila = new csFilaSecante();
            
            fila.setIteraciones(i); //Asignar contador a primera columna titulo
            
            fila.setXinicial(x1);  // A
            
            fila.setXi(x2);  // B
            
            double funC = this.funNormal(fila.getXinicial());
            fila.setFx3(funC); // 3
            
            double restD = fila.getXinicial()- fila.getXi();
            fila.setFx2(restD);  //2
            
            double funE = this.funNormal(fila.getXi());
            fila.setFx1(funE);  //1
            
            double ProdF = fila.getFx1()* fila.getFx2(); //  1* 2
            fila.setNumerador(ProdF); // numerador
            
            double restG = fila.getFx3()- fila.getFx1(); // 3-1
            fila.setDenominador(restG); // Denominador 
            double raizH = fila.getXi()- fila.getNumerador()/ fila.getDenominador(); //  xi- num/ dem
            fila.setRaiz(raizH); // raiz

            
                errorI = Math.abs((fila.getRaiz()- fila.getXi()) / fila.getRaiz());  // raiz -xi /raiz
                fila.setError(errorI);
            

            //Intercambios ACTUALIZAR
            // Xi-1 igual a Xi
           x1 = fila.getXi();  // xi

            //Xi igual a F(Xi)*[(Xi-1)-(Xi)]
            x2 = fila.getRaiz();  // raiz
            lista.add(fila);
            i++;
        }
        /*if (errorI > errorDeseado) {
            return lista;
        } else {
            return null;
        }*/
         return lista;
    }
    //////////////////////////////////////////////////////////////////////////

    public double funNormal(double x) {
        return Math.pow(2.7182818284590452353602874713527, -Math.pow(x, 2)) - x;
    }
}
