
package Unidad_6;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CsTablaPunto extends AbstractTableModel{
    
     private String[] columnas = {"Iteraciones","X","y1+i"};
      private ArrayList<CsFila> lista;
      
      public CsTablaPunto(ArrayList<CsFila> lista){
          this.lista=lista;
      }
      
      public CsTablaPunto(){
          
      }

    @Override
    public int getRowCount() {
       return this.lista.size();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
            
            switch(columna){
        case 0: return this.lista.get(fila).getI();
        case 1: return this.lista.get(fila).getX();
        case 2: return this.lista.get(fila).getFuncion();

        default :return null;
    }
    } 
        @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    }
}
