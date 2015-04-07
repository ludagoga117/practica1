package practica1;

public class Direccion extends Nombre{
	private String calle, ciudad, provincia, codPostal;

	protected String getCalle() {
		return calle;
	}

	protected void setCalle(String calle) {
		this.calle = calle;
	}

	protected String getCiudad() {
		return ciudad;
	}

	protected void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	protected String getProvincia() {
		return provincia;
	}

	protected void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	protected String getCodPostal() {
		return codPostal;
	}

	protected void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
	Direccion(String calle, String ciudad, String provincia, String codPostal, String nombre, String primer_apellido, String segundo_apellido){
		super(nombre, primer_apellido, segundo_apellido);
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
	}
	Direccion(){
		super();
	}
	
	void Nueva_direccion(String calle, String ciudad, String provincia, String codPostal){
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
	}
	
	void Nuevo_nombre(String nombre, String primer_apellido, String segundo_apellido){
		super.Leer_nombre(nombre, primer_apellido, segundo_apellido);
	}
	
	void Mostrar(){
		super.Mostrar_nombre();
		System.out.println("Dirección: "+calle);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("Provincia: "+provincia);
		System.out.println("Código postal: "+codPostal);
	}
}
