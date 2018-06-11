package Unidad_5;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lagrange {
    double y;
    public ArrayList<cssFilaLagrange> MetodoInterLagrange(int n, double x){
        
        ArrayList<cssFilaLagrange>lista;
        int iteacion=0;
        
        lista=new ArrayList<cssFilaLagrange>();
        
            Scanner t=new Scanner(System.in);
		int i;
		
		double a[][] = new double [4][2];
		do{
		}while(n<2 || n>4);
		for(i=0;i<n;i++){
                                a[i][0]=Double.parseDouble( JOptionPane.showInputDialog("Dame x "+i) );
				a[i][1]=Double.parseDouble( JOptionPane.showInputDialog("Dame f(x) "+i) );
                                
                                cssFilaLagrange fila = new cssFilaLagrange();
                                fila.setI(i);
                                fila.setX(a[i][0]);
                                fila.setFx(a[i][1]);
                                lista.add(fila);
				}
                
               cssFilaLagrange fila = new cssFilaLagrange();
          
		switch(n){
			case 2:
			y=(((((x-a[1][0])*a[0][1])/(a[0][0]-a[1][0]))+(((x-a[0][0])*a[1][1])/(a[1][0]-a[0][0]))));
			System.out.println("f(x) en ese punto es: "+y);
			break;
			case 3:
			y=((x-a[1][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0]))+((x-a[0][0])*(x-a[2][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0]))+((x-a[1][0])*((x-a[0][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])));
			System.out.println("f(x) en ese punto es: "+y);
			break;
			case 4:
			y=((x-a[1][0])*(x-a[3][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0])*(a[0][0]-a[3][0]))+((x-a[0][0])*(x-a[2][0])*(x-a[3][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0])*(a[1][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[3][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])*(a[2][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[2][0])*a[
3][1])/((a[3][0]-a[0][0])*(a[3][0]-a[1][0])*(a[3][0]-a[2][0]))));
			System.out.println("f(x) en ese punto es: "+y);
			break;
			default:
			System.out.println("INVALIDO");
			break;	
		}
                return lista;
	}
    public String resultado(){
        return String.valueOf(y);
    }
}
