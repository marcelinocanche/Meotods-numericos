package Unidad_3;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class csMetodoTablaSeidel2 extends AbstractTableModel{
    MetodoGaussSeidel a = new MetodoGaussSeidel();

    private String[] columna = {"X1", "X2", "X3", "X4"};
    private ArrayList<CsFilaGaussSeidel> lista;

    public csMetodoTablaSeidel2(ArrayList<CsFilaGaussSeidel> lista) {
        this.lista = lista;
    }

    public csMetodoTablaSeidel2() {

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
    public Object getValueAt(int fi, int columnas) {
        switch (columnas) {
            case 0:
                return this.lista.get(fi).getRX1();
            case 1:
                return this.lista.get(fi).getRX2();
            case 2:
                return this.lista.get(fi).getRX3();
            case 3:
                return this.lista.get(fi).getRX4();
            default:
                return null;

        }
    }

    public String getColumnName(int i) {
        return this.columna[i];
    }
}
