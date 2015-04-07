package practica1;

public class punto10 {
	private int[] f = {0,1,0};
	public int determinar(int numExt){
		while(f[1]<numExt){
			f[0]=f[1]+f[2];
			f[2]=f[1];
			f[1]=f[0];
		}
		if(numExt==f[1]) return 1;
		else return 0;
	}
}
