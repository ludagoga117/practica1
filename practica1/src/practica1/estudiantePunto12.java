package practica1;

public class estudiantePunto12 {
	private final double[] porcentajes = {0.25,0.2,0.25,0.3,1};
	private double[] notas = {0,0,0,0,0};
	private String codigo;
	public estudiantePunto12(String codigo) {
		this.codigo = codigo;
	}
	public double getNota(int n){
		return notas[n];
	}
	public double getPorcentaje(int n){
		return porcentajes[n];
	}
	public void setNota(int n, double nota){
		notas[n]=nota;
	}
	public String getCodigo(){
		return codigo;
	}
	public void setCodigo(String codigo){
		this.codigo=codigo;
	}
}
