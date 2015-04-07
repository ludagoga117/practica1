package practica1;

public class Libro extends Publicacion {
	private long numPag;
	private int anoPublica;
	public Libro(String titulo, long precio, long numPag, int anoPublica) {
		super(titulo, precio);
		this.numPag = numPag;
		this.anoPublica = anoPublica;
	}
	public Libro(){
		super();
		this.numPag = 0;
		this.anoPublica = 0;
	}
	public long getNumPag() {
		return numPag;
	}
	public void setNumPag(long numPag) {
		this.numPag = numPag;
	}
	public int getAnoPublica() {
		return anoPublica;
	}
	public void setAnoPublica(int anoPublica) {
		this.anoPublica = anoPublica;
	}
	public void mostrar(){
		System.out.println("Tipo: Libro.");
		mostrarTitulo();
		mostrarPrecio();
		mostrarPag();
		mostrarAno();
		System.out.println("");
	}
	private void mostrarPag(){
		System.out.println("Número de páginas: "+numPag);
	}
	private void mostrarAno(){
		System.out.println("Año de publicación: "+anoPublica);
	}
}
