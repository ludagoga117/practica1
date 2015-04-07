package practica1;
public class pitagoras {
	private float lado1, lado2;
	public double hipotenusa(){
		return Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
	}
	public pitagoras(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
}
