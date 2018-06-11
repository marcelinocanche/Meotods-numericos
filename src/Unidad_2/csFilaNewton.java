
package Unidad_2;
public class csFilaNewton {
    private int iteracion;
    private double xinicial;
    private double fx;
    private double dfx;
    private double suma;
    private double error;

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double getXinicial() {
        return xinicial;
    }

    public void setXinicial(double xinicial) {
        this.xinicial = xinicial;
    }

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getDfx() {
        return dfx;
    }

    public void setDfx(double dfx) {
        this.dfx = dfx;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "csFilaNewton{" + "iteracion=" + iteracion + ", xinicial=" + xinicial + ", fx=" + fx + ", dfx=" + dfx + ", suma=" + suma + ", error=" + error + '}';
    }
    
}
