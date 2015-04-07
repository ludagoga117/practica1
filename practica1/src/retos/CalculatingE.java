package retos;

public class CalculatingE {
	public long factorial(int n){
		long salida = 1;
		for(int i = 2; i <= n; i++){
			salida = salida * i;
		}
		return salida;
	}
	public double serie(int n){
		double salida = 0;
		for(int i = 0; i< n;i++){
			salida = salida + 1/(double)factorial(i);
		}
		return salida;
	}
}
