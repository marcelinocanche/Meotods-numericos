package Unidad_4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mtUnTercioSimpson extends AbstractTableModel {

    private String[] columnas = {"I", "H", "A+IH", "f(A+IH)"};
    private ArrayList<csFilaUnTercioSimpson> lista;

    public mtUnTercioSimpson(ArrayList<csFilaUnTercioSimpson> lista) {
        this.lista = lista;
    }

    public mtUnTercioSimpson() {

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
