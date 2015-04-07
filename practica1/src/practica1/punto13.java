package practica1;

public class punto13 {
	private int[] num = {1,0};
	public int getTerm( int n){
		int temp = 0;
		num[0] = 0;
		num[1] = 1;
		for( int i = 1; i<=n; i++){
			temp = num[0] + num[1];
			num[1]=num[0];
			num[0]=temp;
		}
		return temp;
	}
}
