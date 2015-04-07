package practica1;

import java.util.LinkedList;

public class estadisticasConductor {
	private LinkedList<conductorInvolucrado> C1 = new LinkedList<conductorInvolucrado>();
	private conductorInvolucrado tempConductor;
	public double porcentajeEdadMenorQueN(int n){
		double cont = 0;
		for( int i=0; i<C1.size(); i++){
			if(C1.get(i).getAnnoNascita()<n){
				cont++;
			}
		}
		return cont/(double)(C1.size())*100;
	}
	public double porcentajeFemenino(){
		double cont = 0;
		for( int i=0; i<C1.size(); i++){
			if(C1.get(i).getSesso()==1){
				cont++;
			}
		}
		return cont/(double)(C1.size())*100;
	}
	public double porcentajeOutMedellin(){
		double cont = 0;
		for( int i=0; i<C1.size(); i++){
			if(C1.get(i).getRegistroMachina()==2){
				cont++;
			}
		}
		return cont/(double)(C1.size())*100;
	}
	public conductorInvolucrado getConductor(int n){
		return C1.get(n);
	}
	public void setAge(int n, int age){
		C1.get(n).setAnnoNascita(age);
	}
	public int getAge(int n){
		return C1.get(n).getAnnoNascita();
	}
	public void setRegistro(int n, int registro){
		C1.get(n).setRegistroMachina(registro);
	}
	public int getRegistro(int n){
		return C1.get(n).getRegistroMachina();
	}
	public void setSexo( int n, int sexo){
		C1.get(n).setSesso(sexo);
	}
	public int getSexo(int n){
		return C1.get(n).getSesso();
	}
	public void addConductor(int annoNascita, int sesso, int registroMachina){
		tempConductor = new conductorInvolucrado(annoNascita, sesso, registroMachina);
		C1.addLast(tempConductor);
		//setAge(C1.size()-1,annoNascita);
		//setRegistro(C1.size()-1,registroMachina);
		//setSexo(C1.size()-1,sesso);
	}
	public void removeConductor(int n){
		C1.remove(n);
	}
	public int numConduct(){
		return C1.size();
	}
}
