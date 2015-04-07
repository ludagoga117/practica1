package practica1;

public class equilatero {
	private float lado, altura;
	public double perimetro(){
		return lado*3;
	}
	public double area(){
		return 0.5*lado*altura;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public equilatero(float lado) {
		this.lado = lado;
		//altura = (float)(Math.sqrt(Math.pow(lado,2)-Math.pow(lado*0.5,2)));
		altura = (float)(lado*Math.sin(Math.PI/3));
	}
}