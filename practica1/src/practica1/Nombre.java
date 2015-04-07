package practica1;

public class Nombre {
	private String nombre, primer_apellido, segundo_apellido;
	Nombre(String nombre, String primer_apellido, String segundo_apellido){}
	Nombre(){}
	void Leer_nombre(String nombre, String primer_apellido, String segundo_apellido){
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
	}
	void Mostrar_nombre(){
		System.out.println(nombre+" "+primer_apellido+" "+segundo_apellido);
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getPrimer_apellido() {
		return primer_apellido;
	}
	protected void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	protected String getSegundo_apellido() {
		return segundo_apellido;
	}
	protected void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
}
