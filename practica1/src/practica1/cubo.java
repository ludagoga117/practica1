package practica1;

public class cubo {
	private float arista;
	public double area(){
		return Math.pow(arista, 2)*6;
	}
	public double volumen(){
		return Math.pow(arista, 3);
	}
	public float getArista() {
		return arista;
	}
	public void setArista(float arista) {
		this.arista = arista;
	}
	public cubo(float arista) {
		this.arista = arista;
	}
}
