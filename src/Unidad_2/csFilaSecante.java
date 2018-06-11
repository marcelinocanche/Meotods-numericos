package Unidad_2;
public class csFilaSecante {
    private int iteraciones;
    private double xinicial;
    private double xi;
    private double fx3;
    private double fx2;
    private double fx1;
    private double numerador;
    private double denominador;
    private double raiz;
    private double error;

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getXinicial() {
        return xinicial;
    }

    public void setXinicial(double xinicial) {
        this.xinicial = xinicial;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getFx3() {
        return fx3;
    }

    public void setFx3(double fx3) {
        this.fx3 = fx3;
    }

    public double getFx2() {
        return fx2;
    }

    public void setFx2(double fx2) {
        this.fx2 = fx2;
    }

    public double getFx1() {
        return fx1;
    }

    public void setFx1(double fx1) {
        this.fx1 = fx1;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "csFilaSecante{" + "iteraciones=" + iteraciones + ", xinicial=" + xinicial + ", xi=" + xi + ", fx3=" + fx3 + ", fx2=" + fx2 + ", fx1=" + fx1 + ", numerador=" + numerador + ", denominador=" + denominador + ", raiz=" + raiz + ", error=" + error + '}';
    }
    
}
