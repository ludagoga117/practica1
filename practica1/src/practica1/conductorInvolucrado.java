package practica1;

public class conductorInvolucrado {
	private int annoNascita;
	private int sesso;	//1. Femminile, 2. Maschile
	private int registroMachina;	//1. Medellin, 2. Altre città
	public conductorInvolucrado(int annoNascita, int sesso, int registroMachina) {
		this.annoNascita = annoNascita;
		this.sesso = sesso;
		this.registroMachina = registroMachina;
	}
	public int getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	public int getSesso() {
		return sesso;
	}
	public void setSesso(int sesso) {
		this.sesso = sesso;
	}
	public int getRegistroMachina() {
		return registroMachina;
	}
	public void setRegistroMachina(int registroMachina) {
		this.registroMachina = registroMachina;
	}
}
