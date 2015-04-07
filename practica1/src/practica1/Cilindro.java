package practica1;

public class Cilindro extends Circulo{
	protected double h;
	public double getArea(){
		return super.getArea()*2+super.getCircunferencia()*h;
	}
	public double getVolumen(){
		return super.getArea()*h;
	}
	public Cilindro(){
		super();
		h = 0;
	}
	public Cilindro(double h, double r){
		super(r);
		this.h = h;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
}
