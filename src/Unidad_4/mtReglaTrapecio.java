package Unidad_4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mtReglaTrapecio extends AbstractTableModel {

    private String[] columnas = {"I", "H=B-A/N", "X", "F(X)"};
    private ArrayList<csFilaReglaTrapecio> lista;

    public mtReglaTrapecio(ArrayList<csFilaReglaTrapecio> lista) {
        this.lista = lista;
    }

    public mtReglaTrapecio() {

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
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getH();
            case 2:
                return this.lista.get(fila).getX();
            case 3:
                return this.lista.get(fila).getFx();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
