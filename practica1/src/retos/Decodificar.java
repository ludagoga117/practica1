package retos;

public class Decodificar {
	public String decode(String input){
		int cont = 1;
		String deco = "";
		char c = input.charAt(0);
		for( int i = 1; i < input.length() ; i++){
			if( input.charAt(i) == c ){
				cont++;
			}else{
				deco = deco.concat(Integer.toString(cont));
				deco = deco.concat(Character.toString(c));
				c = input.charAt(i);
				cont = 1;
			}
		}
		return deco;
	}
	public String encode(String input){
		String enco = "";
		int cont, j;
		char c;
		for( int i = 0; i<input.length()/2; i++){
			cont = Character.getNumericValue(input.charAt(2*i));
			c = input.charAt(2*i+1);
			for( j = 0; j < cont; j++){
				enco = enco.concat(Character.toString(c));
			}
		}
		return enco;
	}
}
