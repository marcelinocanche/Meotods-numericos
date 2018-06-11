package Unidad_2;
public class csFilaPunto {
    private int iteraciones;
    private double xInicial;
    private double gxi;
    private double Error;

    
    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getxInicial() {
        return xInicial;
    }

    public void setxInicial(double xInicial) {
        this.xInicial = xInicial;
    }

    public double getGxi() {
        return gxi;
    }

    public void setGxi(double gxi) {
        this.gxi = gxi;
    }

    public double getError() {
        return Error;
    }

    public void setError(double Error) {
        this.Error = Error;
    }

    @Override
    public String toString() {
        return "csFilaPunto{" + "iteraciones=" + iteraciones + ", xInicial=" + xInicial + ", gxi=" + gxi + ", Error=" + Error + '}';
    }
    
    
}
