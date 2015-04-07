package practica1;

public class punto11 {
	public int calcularFactorial(int i){
		int acu = 1;
		for( int j= 1; j<=i; j++){
			acu *= j;
		}
		return acu;
	}
}
