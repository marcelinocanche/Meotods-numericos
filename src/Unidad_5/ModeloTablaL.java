
package Unidad_5;

import java.util.ArrayList;
//import metodos.cssFilaLagrange;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaL extends AbstractTableModel{
    
   private String cabecera[]={"i","x","fx"};
   private ArrayList<cssFilaLagrange>lista;
   
   ModeloTablaL(ArrayList<cssFilaLagrange>lista){
       this.lista=lista;
   }

   ModeloTablaL(){
       
   }

    @Override
    public int getRowCount() {
        return this.lista.size();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.cabecera.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
       switch(columna){
           case 0: return this.lista.get(fila).getI();
           case 1: return this.lista.get(fila).getX();
           case 2:return this.lista.get(fila).getFx();
           default: return null;
       }
    }
    
    public String getColumnName(int i){
        return this.cabecera[i];
    }
}
