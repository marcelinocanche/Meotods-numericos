package Unidad_3;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mtFijo extends AbstractTableModel {

    private String[] columna = {"k", "x1", "x2", "x3", "Error"};
    private ArrayList<csFilaFijo> lista;

    public mtFijo(ArrayList<csFilaFijo> lista) {
        this.lista = lista;
    }

    public mtFijo() {
    }
    @Override
    public int getRowCount() {   
        return this.lista.size();
    }
    @Override
    public int getColumnCount() {    
        return this.columna.length;
    }
    @Override
    public Object getValueAt(int fila, int columna) {
        
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getM1();
            case 2:
                return this.lista.get(fila).getM2();
            case 3:
                return this.lista.get(fila).getM3();
            case 4:
                return this.lista.get(fila).getError();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int i) {
        return this.columna[i];
    }

}
