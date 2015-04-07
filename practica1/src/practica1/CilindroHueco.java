package practica1;

public class CilindroHueco extends Cilindro {
	private double radioInt;
	public double getArea(){
		return super.getArea()-2*Math.PI*Math.pow(radioInt,2)+2*Math.PI*super.getH()*radioInt;
	}
	public double getVolumen(){
		return Math.PI*super.getH()*(Math.pow(super.getRadio(),2)-Math.pow(radioInt,2));
	}
}
