package retos;

public class ImplementDecodificar {
	public static void main(String[] args) {
		Decodificar D1 = new Decodificar();
		String input = "3a4b2a";
		System.out.println("Encode ("+input+"): "+D1.encode(input));
		input = "4b1a1b3a5b";
		System.out.println("Encode ("+input+"): "+D1.encode(input));
		input = "3b7a1b";
		System.out.println("Encode ("+input+"): "+D1.encode(input));
	}
}
