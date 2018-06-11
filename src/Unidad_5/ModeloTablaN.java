
package Unidad_5;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaN extends AbstractTableModel{
    
    private String []cabeza={"i","x","y"};
    private ArrayList<csFilaN> lista;
    
    public ModeloTablaN(ArrayList<csFilaN> lista){
        this.lista=lista;
    }
    
    public ModeloTablaN(){
        
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabeza.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch(columna){
            case  0: return this.lista.get(fila).getI();
            case 1: return this.lista.get(fila).getX();
            case 2: return this.lista.get(fila).getY();
            default:return null;

        }
    }
    
        @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.cabeza[i];
    }
    
    
    
}
