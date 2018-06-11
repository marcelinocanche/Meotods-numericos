
package Unidad_2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaPunto extends AbstractTableModel{
    private String []columnas={"i","XO","XI","ERROR"};
    private ArrayList<csFilaPunto> lista;
    
        public ModeloTablaPunto(ArrayList<csFilaPunto> lista) {
        this.lista = lista;
    }
        
        public ModeloTablaPunto(){
            
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
    public Object getValueAt(int fila, int columnas) {
             switch(columnas){
         
         case 0:return this.lista.get(fila).getIteraciones();
         case 1: return this.lista.get(fila).getxInicial();
         case 2:return this.lista.get(fila).getGxi();
         case 3:return this.lista.get(fila).getError();
         default:return null;
         
     }
    }
    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.columnas[i];
    }
    
}
