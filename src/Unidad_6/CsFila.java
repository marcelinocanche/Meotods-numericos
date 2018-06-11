
package Unidad_6;

public class CsFila {
    
    private int i; // ITERACION
    private double x; // X
    private double y; // YI+1
    
    private double funcion;

    public double getFuncion() {
        return funcion;
    }

    public void setFuncion(double funcion) {
        this.funcion = funcion;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "CsFila{" + "i=" + i + ", x=" + x + ", y=" + y + '}';
    }
    
    
    
}
