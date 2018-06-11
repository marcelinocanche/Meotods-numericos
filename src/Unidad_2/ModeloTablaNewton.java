package Unidad_2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaNewton extends AbstractTableModel{
    private String []columnas={"i","Xi","Fx","F´(X)","Xi+1","Error"};
    private ArrayList<csFilaNewton> lista;

    public ModeloTablaNewton(ArrayList<csFilaNewton> lista) {
        this.lista = lista;
    }
    
    public ModeloTablaNewton() {
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch(columna){
         case 0: return this.lista.get(fila).getIteracion();
         case 1:return this.lista.get(fila).getXinicial();
         case 2:return this.lista.get(fila).getFx();
         case 3:return this.lista.get(fila).getDfx();
         case 4:return this.lista.get(fila).getSuma();
         case 5:return this.lista.get(fila).getError();
         default:return null;
     }
    }
    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.columnas[i];
    }
}
