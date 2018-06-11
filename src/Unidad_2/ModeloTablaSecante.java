package Unidad_2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaSecante extends AbstractTableModel{
    
    
    private String []columnas={"i","Xi-1","Xi","F(xi-1)","(xi-1-xi)","F(xi)","Num","Den","Raiz","Error"};
    private ArrayList<csFilaSecante> lista;

    public ModeloTablaSecante(ArrayList<csFilaSecante> lista) {
        this.lista = lista;
    }
    
    
    public ModeloTablaSecante() {
    }

    @Override
    public Object getValueAt(int fila, int columna) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     switch(columna){
         case 0: return this.lista.get(fila).getIteraciones();
         case 1:return this.lista.get(fila).getXinicial();
         case 2:return this.lista.get(fila).getXi();
         case 3:return this.lista.get(fila).getFx3();
         case 4:return this.lista.get(fila).getFx2();
         case 5:return this.lista.get(fila).getFx1();
         case 6:return this.lista.get(fila).getNumerador();
         case 7:return this.lista.get(fila).getDenominador();
         case 8:return this.lista.get(fila).getRaiz();
         case 9:return this.lista.get(fila).getError();
         default:return null;
         
     }
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }
    
}
