package practica1;

public class nota {
	private String nombre, ID;
	private float seguimiento, parcial1, parcial2, notaFinal;
	final private String asignatura;
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
	public float getSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(float seguimiento) {
		this.seguimiento = seguimiento;
	}
	public float getParcial1() {
		return parcial1;
	}
	public void setParcial1(float parcial1) {
		this.parcial1 = parcial1;
	}
	public float getParcial2() {
		return parcial2;
	}
	public void setParcial2(float parcial2) {
		this.parcial2 = parcial2;
	}
	public float getNotaFinal() {
		notaFinal = seguimiento * (float)0.5 + parcial1 * (float)0.25 + parcial2 * (float)0.25;
		return notaFinal;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public nota(String nombre, String iD, float seguimiento, float parcial1, float parcial2, String asignatura) {
		this.nombre = nombre;
		ID = iD;
		this.seguimiento = seguimiento;
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.notaFinal = 0;
		this.asignatura = asignatura;
	}
	
}
