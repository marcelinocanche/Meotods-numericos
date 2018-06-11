package Unidad_3;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MetodoGaussSeidel {
    public ArrayList<CsFilaGaussSeidel> Seidel(double x1, double x2, double x3, double x4, double ErrorDes) {

        double ER;
        double VarAnX1 = x1;
        double VarAnX2 = x2;
        double VarAnX3 = x3;
        double VarAnX4 = x4;

        ArrayList<CsFilaGaussSeidel> lista;
        int i = 1;
        lista = new ArrayList<CsFilaGaussSeidel>();
        do {
            CsFilaGaussSeidel fila = new CsFilaGaussSeidel();
            fila.setX1(this.PrimeraForm(VarAnX2, VarAnX3));
           
            fila.setX2(this.SegundaForm(fila.getX1(), VarAnX3, VarAnX4));
            fila.setX3(this.TerceraForm(fila.getX1(), fila.getX2(), VarAnX4));
            fila.setX4(this.CuartaForm(fila.getX2(), fila.getRX3()));
            
            double RestX1, RestX2, RestX3, RestX4;
            RestX1 = Math.abs(fila.getX1() - VarAnX1);
            fila.setRX1(RestX1);
            
            RestX2 = Math.abs(fila.getX2() - VarAnX2);
            fila.setRX2(RestX2);
    
            RestX3 = Math.abs(fila.getX3() - VarAnX3);
            fila.setRX3(RestX3);
      
            RestX4 = Math.abs(fila.getX4() - VarAnX4);
            fila.setRX4(RestX4);
        
            VarAnX1 = fila.getX1();
            VarAnX2 = fila.getX2();
            VarAnX3 = fila.getX3();
            VarAnX4 = fila.getX4();
            
            double maxRest = Math.max(RestX1, Math.max(RestX2, Math.max(RestX3, RestX4)));

            double maxXk = Math.max(Math.abs(fila.getX1()), Math.max(Math.abs(fila.getX2()), Math.max(Math.abs(fila.getX3()), Math.abs(fila.getX4()))));

            ER = maxRest / maxXk;
            lista.add(fila);
            fila.setK(i++);
            a.setER(ER);
            
        } while (ErrorDes <= ER);
        
        return lista;
    }
    CsFilaGaussSeidel a = new CsFilaGaussSeidel();
    public String e (){
        return String.valueOf(a.getER());
    }
    public double PrimeraForm(double X2, double X3) {
        return (6 + X2 - 2 * X3) / 10;
    }

    public double SegundaForm(double X1, double X3, double X4) {
        return (25 + X1 + X3 - 3 * X4) / 11;
    }

    public double TerceraForm(double X1, double X2, double X4) {
        return (-11 - 2 * X1 + X2 + X4) / 10;
    }

    public double CuartaForm(double X2, double X3) {
        return (15 - 3 * X2 +  X3) / 8;
    }
}
