package Unidad_3;

//import metodounidad3.csFilaJacobi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class csModeloTablaJacovi extends AbstractTableModel {

    private String[] columnas = {"K", "X1", "X2", "X3", "X4"};
    private ArrayList<csFilaJacobi> lista;

    public csModeloTablaJacovi(ArrayList<csFilaJacobi> lista) {
        this.lista = lista;
    }

    public csModeloTablaJacovi() {

    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            // case 5:
            // return this.lista.get(fila).getRestAbs();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    }

}
