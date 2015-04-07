package practica1;

public class punto14 {
	private double[] elemento = {0,0,0};
	public double getElemento(int n){
		return elemento[n];
	}
	public void setElemento(int n, double valor){
		elemento[n] = valor;
	}
	public double getArea(int elemento){
		double area = 0;
		switch (elemento){
			case 0://círculo
				area = Math.PI*Math.pow(this.elemento[0], 2);
				break;
			case 1://triangulo
				double p = 0;
				for( int i = 0; i<=2; i++){
					p += this.elemento[i]/(double)2;
				}
				area = Math.sqrt(p*(p-this.elemento[0])*(p-this.elemento[1])*(p-this.elemento[2]));
				break;
			case 2://cuadrado
				area = Math.pow(this.elemento[0], 2);
				break;
			case 3://rectangulo
				area = this.elemento[0] * this.elemento[1];
				break;
		}
		return area;
	}
}
