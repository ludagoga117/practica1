package practica1;

public class Publicacion {
	protected String titulo;
	protected long precio;
	public Publicacion(String titulo, long precio) {
		this.titulo = titulo;
		this.precio = precio;
	}
	public Publicacion(){
		this.precio = 0;
		this.titulo = "";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public void mostrar(){
		mostrarTitulo();
		mostrarPrecio();
		System.out.println("");
	}
	protected void mostrarTitulo(){
		System.out.println("Título: "+titulo);
	}
	protected void mostrarPrecio(){
		System.out.println("Precio: "+precio);
	}
}
