package practica1;

public class Disco extends Publicacion{
	private int durMin;
	public Disco(String titulo, long precio, int durMin) {
		super(titulo, precio);
		this.durMin = durMin;
	}
	public Disco(){
		super();
		this.durMin = 0;
	}
	public int getDurMin() {
		return durMin;
	}
	public void setDurMin(int durMin) {
		this.durMin = durMin;
	}
	public void mostrar(){
		System.out.println("Tipo: Disco.");
		mostrarTitulo();
		mostrarPrecio();
		mostrarMin();
		System.out.println("");
	}
	private void mostrarMin(){
		System.out.println("Duración en minutos: "+durMin);
	}
	
}
