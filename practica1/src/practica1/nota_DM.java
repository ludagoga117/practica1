package practica1;

public class nota_DM{
	private double[] notas = {0,0,0,0,0,0};
	private double[] porcentaje = {0.2,0.3,0.1,0.15,0.25,1};
	private String[] trabajos = {"Quices y seguimiento", "Prácticas de laboratorio", "Exposiciones", "Proyecto 1", "Proyecto final", "Nota final"};
	private String nombre, ID;
	
	public double notaFinal(){
		for( int i = 0; i < notas.length-1; i++){
			notas[notas.length-1] += notas[i]*porcentaje[i];
		}
		return notas[notas.length-1];
	}

	public nota_DM(String nombre, String ID) {
		this.nombre = nombre;
		this.ID = ID;
	}

	public double getNota(int n){
		if((n<=notas.length)&&(n>0)){
			return notas[n-1];
		}else
			return 0;
	}
	
	public void setNota(int n, double nota){
		if((n<=notas.length)&&(n>0)){
			notas[n-1] = nota;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public int numNotas(){
		return notas.length-1;
	}
	
	public String getTrabajo(int n){
		if((n<=notas.length)&&(n>0)){
			return trabajos[n-1];
		}else
			return "error";
	}
	
	public int mensaje(double nota){
		if(nota<=1){
			return 1;
		}else if(nota <= 2){
			return 2;
		}else if(nota <= 3){
			return 3;
		}else if(nota <= 4){
			return 4;
		}else if(nota <= 4.5){
			return 5;
		}else if(nota <= 5){
			return 6;
		}else return 7;
	}
}
