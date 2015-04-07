package retos;

import java.util.Scanner;

public class ImplementCalculatingE {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CalculatingE E1 = new CalculatingE();
		int ans = 0;
		while(true){
			System.out.print("Ingrese la precisión de e: ");
			ans = teclado.nextInt();
			if(ans==-1) break;
			System.out.println("e= "+E1.serie(ans));
		}
	}

}
