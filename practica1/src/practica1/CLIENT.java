package practica1;

public class CLIENT extends PERSONAL_DATE {
	private long saldo = 0;
	public long consignacion(long cantidad){
		saldo = saldo + cantidad;
		return saldo;
	}
	public long retiro(long cantidad){
		if( cantidad <= saldo){
			saldo = saldo - cantidad;
		}else{
			cantidad = saldo;
			saldo = 0;
		}
		return cantidad;
	}
	public long consultar_saldo(){
		return saldo;
	}
}
