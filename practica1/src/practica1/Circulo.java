package practica1;

public class Circulo {
	protected double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double getCircunferencia(){
		return (double)2*Math.PI*radio;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public Circulo(){
		this.radio = 0;
	}
}
