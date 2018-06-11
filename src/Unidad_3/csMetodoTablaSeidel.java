package Unidad_3;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class csMetodoTablaSeidel extends AbstractTableModel{
    private String[] columnas = {"K", "X1", "X2", "X3", "X4"};
    private ArrayList<CsFilaGaussSeidel> lista;

    public csMetodoTablaSeidel(ArrayList<CsFilaGaussSeidel> lista) {
        this.lista = lista;
    }

    public csMetodoTablaSeidel() {

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
                return this.lista.get(fila).getK();
            case 1:
                return this.lista.get(fila).getX1();
            case 2:
                return this.lista.get(fila).getX2();
            case 3:
                return this.lista.get(fila).getX3();
            case 4:
                return this.lista.get(fila).getX4();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}