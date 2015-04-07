package practica1;
import java.util.LinkedList;
import java.util.Random;

public class punto12 {
	private LinkedList<estudiantePunto12> C1 = new LinkedList<estudiantePunto12>();
	private estudiantePunto12 tempStudent;
	public void newDataBase(int n){
		for( int i=0; i<n; i++){
			addStudent(Integer.toString(i));
			for( int j=0; j<=3;j++){
				setNota(i,j,randNota());
			}
			getFinal(i);
		}
	}
	public void addStudent(String codigo){
		tempStudent = new estudiantePunto12(codigo);
		C1.addLast(tempStudent);
	}
	public String getCodigo(int n){
		return C1.get(n).getCodigo();
	}
	public void setCodigo(int n, String codigo){
		C1.get(n).setCodigo(codigo);
	}
	public void setNota(int Estudiante, int n, double nota){
		C1.get(Estudiante).setNota(n, nota);
	}
	public double getNota(int Estudiante, int n){
		return C1.get(Estudiante).getNota(n);
	}
	public double getPorcentaje(int Estudiante, int n){
		return C1.get(Estudiante).getPorcentaje(n);
	}
	public double randNota(){
		Random rand = new Random();
		int[] topes = {0,50};
		int randomNum = rand.nextInt((topes[1]-topes[0])+1)+topes[0];
		return (double)randomNum/10;
	}
	public double getFinal(int Estudiante){
		double nfinal=0;
		for( int j=0; j<=3;j++){
			nfinal = nfinal + getNota(Estudiante,j)*getPorcentaje(Estudiante,j);
		}
		setNota(Estudiante,4,nfinal);
		return nfinal;
	}
	public double promDefinitiva(int n){
		double suma = 0;
		for( int i= 0; i<n; i++){
			suma = suma + getFinal(i)/(double)n;
		}
		return suma;
	}
	public double porcentajeBrutos(int n){
		int cont = 0;
		for(int i=0; i<n; i++){
			if(getFinal(i)<3) cont++;
		}
		return (double)cont/(double)n*100;
	}
}
