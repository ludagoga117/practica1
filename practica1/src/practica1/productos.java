package practica1;

public class productos {
	private int[] precios = {500,800,300,900};
	public int getPrecio1(int n){
		if((n>=1)&&(n<=precios.length)){
			return precios[n-1];
		}else
			return -1;
	}
	public int getPrecio2(int n){
		switch (n){
			case 1:
				return 500; //No es necesario poner break pues con return sale
			case 2:
				return 800;
			case 3:
				return 300;
			case 4:
				return 900;
			default:
				return -1;
		}
	}
}
