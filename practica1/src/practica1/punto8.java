package practica1;

public class punto8 {
	public int getOpcion(int num1){
		return num1%10; //Asi saco las unidades
	}
	public int getMayor(int num1, int num2){
		if(num1>num2) return num1;
		else return num2;
	}
	public int getMenor(int num1, int num2){
		if(num1<num2) return num1;
		else return num2;
	}
	public int getSuma(int num1, int num2){
		return num1+num2;
	}
	public int iguales(int num1, int num2){
		if(num1==num2) return 0;
		else return -1;
	}
	public int getResta(int num1, int num2){
		return getMayor(num1,num2)-getMenor(num1,num2);
	}
	public int getMultiplicacion(int num1, int num2){
		return num1*num2;
	}
	public float getDivision(int num1, int num2){
		return (float)num1/(float)num2;
	}
	public float getRaiz(int num1){
		return (float)Math.sqrt((double)num1);
	}
	public int modulo(int num1, int num2){
		return num1%num2;
	}
}
