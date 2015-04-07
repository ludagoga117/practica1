package practica1;
import java.util.LinkedList;

public class Ventas {
	private LinkedList<Publicacion> C1 = new LinkedList<Publicacion>();
	private Publicacion temp;
	public long leer(String titulo){
		long cont = 0;
		for( int i = 0; i<C1.size(); i++){
			if ( C1.get(i).getTitulo().equals(titulo) ){
				cont++;
			}
		}
		return cont;
	}
	public void mostrar(String titulo){
		System.out.print("Número de ventas de "+titulo+": "+leer(titulo)+".\n");
	}
	public void addVenta(String titulo, long precio){
		temp = new Publicacion(titulo,precio);
		C1.add(temp);
	}
	public void rmVenta(int index){
		C1.remove(index);
	}
}