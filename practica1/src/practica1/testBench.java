package practica1;
import java.util.Scanner;

public class testBench {
	//Punto1
	public static void main(String[] args) {
		cubo C1;
		float arista;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la longitud de la arista del cubo: ");;
		arista = teclado.nextFloat();
		C1 = new cubo(arista);
		System.out.println("El volumen del cubo es: "+C1.volumen()+" u^3.");
		System.out.println("El area del cubo es: "+C1.area()+" u^2.");
	}
/*		//Punto2
	public static void main(String[] args) {
		pitagoras T1;
		float l1, l2;
		Scanner teclado = new Scanner( System.in);
		System.out.print("Ingrese la longitud del cateto 1: ");
		l1 = teclado.nextFloat();
		System.out.print("Ingrese la longitud del cateto 2: ");
		l2 = teclado.nextFloat();
		T1 = new pitagoras(l1,l2);
		System.out.println("La hipotenusa del tri�ngulo es: "+T1.hipotenusa()+" u");
	}
*//*
	//Punto3
	public static void main(String[] args) {
		equilatero E1;
		float lado;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la longitud del lado del tri�ngulo equil�tero: ");;
		lado = teclado.nextFloat();
		E1 = new equilatero(lado);
		System.out.println("El per�metro del tri�ngulo es: "+E1.perimetro()+" u.");
		System.out.println("El area del tri�ngulo es: "+E1.area()+" u^2.");
	}
*//*
	//Punto4
	public static void main(String[] args) {
		nota N1;
		String nombre, ID;
		float seguimiento, parcial1, parcial2;
		String asignatura;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la asignatura: ");
		asignatura = teclado.next();
		System.out.print("Ingrese el nombre del estudiante: ");
		nombre = teclado.next();
		System.out.print("Ingrese el n�mero de identificaci�n ");
		ID = teclado.next();
		System.out.print("Ingrese la nota de seguimiento que obtuvo " + nombre +": ");
		seguimiento = teclado.nextFloat();
		System.out.print("Ingrese la nota del parcial 1 que obtuvo " + nombre +": ");
		parcial1 = teclado.nextFloat();
		System.out.print("Ingrese la nota del parcial 2 que obtuvo " + nombre +": ");
		parcial2 = teclado.nextFloat();
		N1 = new nota(nombre, ID, seguimiento, parcial1, parcial2, asignatura);
		System.out.print("La nota final que obtuvo " + N1.getNombre() + " en la asignatura de " + N1.getAsignatura() + " fue: " + N1.getNotaFinal());
	}
*//*
	//Punto4
	public static void main(String[] args) {
		nota_DM M1;
		String nombre, ID;
		double nota;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del estudiante: ");
		nombre = teclado.next();
		System.out.print("Ingrese el n�mero de identificaci�n ");
		ID = teclado.next();
		M1 = new nota_DM(nombre, ID);
		
		for(int i = 1; i <= M1.numNotas(); i++){
			System.out.print("Ingrese la nota de "+ M1.getTrabajo(i) + " de " + M1.getNombre() +": ");
			nota = teclado.nextDouble();
			M1.setNota(i, nota);
		}
		
		System.out.print("La nota final de " + M1.getNombre() + " es: " + M1.notaFinal());
	}
*//*
	//Punto5
	public static void main(String[] args) {
		nota_DM M1;
		String nombre, ID;
		double nota;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del estudiante: ");
		nombre = teclado.next();
		System.out.print("Ingrese el n�mero de identificaci�n ");
		ID = teclado.next();
		M1 = new nota_DM(nombre, ID);
		
		for(int i = 1; i <= M1.numNotas(); i++){
			System.out.print("Ingrese la nota de "+ M1.getTrabajo(i) + " de " + M1.getNombre() +": ");
			nota = teclado.nextDouble();
			M1.setNota(i, nota);
		}
		
		//System.out.print("La nota final de " + M1.getNombre() + " es: " + M1.notaFinal());
		
		switch(M1.mensaje(M1.notaFinal())){
			case 1:
				System.out.print("El estudiante "+M1.getNombre()+" est� en el lugar equivocado.");
				break;
			case 2:
				System.out.print("El estudiante "+M1.getNombre()+" est� re-mal.");
				break;
			case 3:
				System.out.print("El estudiante "+M1.getNombre()+" puede recuperarse.");
				break;
			case 4:
				System.out.print("El estudiante "+M1.getNombre()+" es normalito.");
				break;
			case 5:
				System.out.print("El estudiante "+M1.getNombre()+" est� muy bien");
				break;
			case 6:
				System.out.print("El estudiante "+M1.getNombre()+" es excelente");
				break;
			default:
				break;
		}
	}
*//*
	//Punto6
	public static void main(String[] args) {
		int n;
		productos P1 = new productos();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el n�mero del producto (1-4): ");
		n = teclado.nextInt();
		System.out.println("El precio del producto "+n+" es: "+P1.getPrecio1(n)+" (array).");
		System.out.println("El precio del producto "+n+" es: "+P1.getPrecio2(n)+" (switch).");
	}
*//*
	//Punto7
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion, n;
		estadisticasConductor stats = new estadisticasConductor();
		while(true){
			System.out.print("Men� inicial de estad�sticas\n1. Salir\n2. A�adir nuevo conductor\n3. Ver conductor\n4. Ver estad�sticas\n ---> Opci�n: ");
			opcion = teclado.nextInt();
			System.out.print("\n");
			switch (opcion){
				case 1:
					break;
				case 2:
					int annoNascita, sesso, registroMachina;
					System.out.print("Ingrese la edad del criminal: ");
					annoNascita = teclado.nextInt();
					System.out.print("Ingrese el sexo del criminarl (1. Femenino, 2. Masculino): ");
					sesso = teclado.nextInt();
					System.out.print("Ingrese el lugar donde esta registrado el vehiculo (1.Medellin, 2. Otro):");
					registroMachina = teclado.nextInt();
					stats.addConductor(annoNascita, sesso, registroMachina);
					break;
				case 3:
					if(stats.numConduct()!=0){
						System.out.print("Ingrese el n�mero de conductor que quiere ver (1-"+stats.numConduct()+"): ");
						n = teclado.nextInt();
						n--;
						if((n<=stats.numConduct()-1)&&(n>=0)){
							System.out.print("El criminal, de sexo ");
							if(stats.getSexo(n)==1){
								System.out.print("femenino");
							}else if(stats.getSexo(n)==2){
								System.out.print("masculino");
							}
							System.out.print(", tiene "+stats.getAge(n)+" a�os, y su veh�culo est� registrado en ");
							if(stats.getRegistro(n)==1){
								System.out.print("Medell�n.\n");
							}else if(stats.getRegistro(n)==2){
								System.out.print("otro municipio distinto a Medell�n.\n");
							}
						}else{
							System.out.print("Error: n�mero inv�lido\n");
						}
					}else{
						System.out.println("No hay conductores en la base de datos.");
					}
					break;
				case 4:
					System.out.println("Actualmente hay "+stats.numConduct()+" conductores registrados.");
					System.out.println("El "+stats.porcentajeEdadMenorQueN(25)+"% de los conductores tiene menos de 25 a�os.");
					System.out.println("El "+stats.porcentajeFemenino()+"% de los conductores son mujeres.");
					System.out.println("El "+stats.porcentajeOutMedellin()+"% de los conductores vive fuera de Medell�n");
					break;
				default:
					System.out.print("Opci�n inv�lida");
					break;
			}
			System.out.print("\n");
			if(opcion==1) break;
		}
	}
*//*
	//Punto8
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto8 calculos = new punto8();
		int num1 = 0, num2 = 0, opcion = 0;
		if( args.length==0){
			System.out.print("Ingrese el primer n�mero de dos cifras: ");
			num1 = teclado.nextInt();
			System.out.print("Ingrese el segundo n�mero de dos cifras: ");
			num2 = teclado.nextInt();
		}else if( args.length>2){
			System.out.println("Error: Demasiados argumentos.");
		}else{
			num1 = Integer.parseInt(args[0]);	//Para convertir un String (cadena) a int (entero) hay que emplear el m�todo est�tico de la clase Integer, parseInt
			num2 = Integer.parseInt(args[1]);
		}
		if( args.length<=2){
			opcion = calculos.getOpcion(num1);
			switch ( opcion ){
				case 0: // CUal es mayor
					if(calculos.iguales(num1, num2)!=0) System.out.println("El n�mero mayor es: "+calculos.getMayor(num1,num2));
					else System.out.println("Los n�meros son iguales. No hay uno mayor que otro.");
					break;
				case 1: // Cual es menor
					if(calculos.iguales(num1,num2)!=0) System.out.println("El n�mero menor es: "+calculos.getMenor(num1,num2));
					else System.out.println("Los n�meros son iguales. No hay uno menor que otro.");
					break;
				case 2: // Calcule suma
					System.out.println("La suma de los dos n�meros es: "+calculos.getSuma(num1,num2));
					break;
				case 3: // Calcule resta
					System.out.println("La resta de los dos n�meros es: "+calculos.getResta(num1,num2));
					break;
				case 4: // Calcule multiplicaci�n
					System.out.println("La multiplicaci�n de los dos n�meros es: "+calculos.getMultiplicacion(num1,num2));
					break;
				case 5: // Divisi�n
					System.out.println(num1+"/"+num2+"="+calculos.getDivision(num1,num2));
					System.out.println(num2+"/"+num1+"="+calculos.getDivision(num2,num1));
					break;
				case 6:	// Primero divisible por el segundo
					if(calculos.modulo(num1,num2)==0) System.out.println(num1+" es divisible entre "+num2);
					else System.out.println(num1+" NO es divisible entre "+num2);
					break;
				case 7: // Segundo divisible por el primero
					if(calculos.modulo(num2,num1)==0) System.out.println(num2+" es divisible entre "+num1);
					else System.out.println(num2+" NO es divisible entre "+num1);
					break;
				case 8: // Raiz cuadrada del primer n�mero
					System.out.println("La ra�z cuadrada del primer n�mero es: "+calculos.getRaiz(num1));
					break;
				case 9: // Qu� punto tan f�cil
					System.out.println("Qu� punto tan f�cil.");
					break;
			}
		}
	}
*//*
	//Punto9
	public static void main(String[] args) {
		punto9 numeros = new punto9();
		numeros.generar();
	}
*//*	
	//Punto10
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto10 fibonacci = new punto10();
		System.out.print("Ingrese el n�mero a analizar: ");
		int numero = teclado.nextInt();
		if(fibonacci.determinar(numero)==1)	System.out.println("El n�mero "+numero+" pertenece a la serie fibonacci.");
		else System.out.println("El n�mero "+numero+" NO pertenece a la serie fibonacci.");
	}
*//*
	//Punto11
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto11 factorial = new punto11();
		System.out.print("Ingrese el n�mero a analizar: ");
		int numero = teclado.nextInt();
		for( int i= 0; i<= numero; i++){
			System.out.println(i+"! = "+factorial.calcularFactorial(i));
		}
	}
*//*
	//Punto12
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto12 cursoAle = new punto12();
		System.out.print("Ingrese el n�mero de estudiantes: ");
		int n = teclado.nextInt();
		cursoAle.newDataBase(n);
		for( int i= 0; i<n; i=i+2){
			System.out.println("La nota final del estudiante de c�digo "+cursoAle.getCodigo(i)+" fue: "+cursoAle.getFinal(i));
		}
		System.out.println("El promedio de las definitivas fue: "+cursoAle.promDefinitiva(n));
		System.out.println("El porcentaje de gente que perdio fue: "+cursoAle.porcentajeBrutos(n));
	}
*//*
	//Punto13
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto13 fibonacci = new punto13();
		System.out.print("Ingrese el n�mero de t�rminos de la serie que quiere ver: ");
		int n = teclado.nextInt();
		for( int i = 1; i<=n; i++ ){
			System.out.println(fibonacci.getTerm(i));
		}
		
	}
*//*
	//Punto14
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		punto14 areas = new punto14();
		double valor = 0;
		int opcion = 0;
		while(true){
			System.out.print("Men� inicial de �reas\n1. Salir\n2. Calcular �rea de c�rculo\n3. Calculas �rea de tri�ngulo\n4. Calcular �rea de cuadrado\n5. Calcular �rea de rect�ngulo\n ---> Opci�n: ");
			opcion = teclado.nextInt();
			switch(opcion){
				case 1:
					System.out.print("Suerte!");
					break;
				case 2:
					System.out.print("Ingrese la longitud del radio del c�rculo: ");
					valor = teclado.nextDouble();
					areas.setElemento(0, valor);
					break;
				case 3:
					for( int i= 1; i<=3; i++){
						System.out.print("Ingrese la longitud del lado "+i+" del tri�ngulo: ");
						valor = teclado.nextDouble();
						areas.setElemento(i-1,valor);
					}
					break;
				case 4:
					System.out.print("Ingrese la longitud del lado del cuadrado: ");
					valor = teclado.nextDouble();
					areas.setElemento(0, valor);
					break;
				case 5:
					for( int i= 1; i<=2; i++){
						if(i==1) System.out.print("Ingrese la longitud de la base del rect�ngulo: ");
						else System.out.print("Ingrese la longitud de la altura del rect�ngulo: ");
						valor = teclado.nextDouble();
						areas.setElemento(i-1,valor);
					}
					break;
				default:
					System.out.print("Error: Opci�n inv�lida.\n");
					break;
			}
			if( opcion == 1) break;
			else if((opcion>=2)&&(opcion<=5)) System.out.println("El �rea pedida es: "+areas.getArea(opcion-2)+"u^2");
		}
	}
*//*
	//Punto15
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CLIENT David = new CLIENT();
		David.loading_data();
		David.data_Show();
		long plata = 0;
		int opcion, opcionAct = 0;
		while(true){
			System.out.print("Men� del banco virtual\n1. Salir\n2. Consignar plata\n3. Retirar plata\n4. Consultar saldo\n5. Actualizar datos\n ---> Opci�n: ");
			opcion = teclado.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Suerte!");
					break;
				case 2:
					System.out.print("Ingrese la cantidad de plata a consignar: ");
					plata = teclado.nextLong();
					David.consignacion(plata);
					System.out.println("Consignaci�n exitosa: Se consignaron "+plata+" pesos en la cuenta del Se�or(a) "+David.getNombre());
					break;
				case 3:
					System.out.print("Ingrese la plata a retirar: ");
					plata = teclado.nextLong();
					System.out.println("Del cajero sali�: "+David.retiro(plata)+" pesos. Qued�: "+David.consultar_saldo()+" pesos");
					break;
				case 4:
					System.out.println("Saldo actual de la cuenta del se�or(a) "+David.getNombre()+": "+ David.consultar_saldo()+" pesos");
					break;
				case 5:
					break;
				default:
					System.out.print("Error: Opci�n inv�lida.\n");
					break;
			}
			if( opcion == 1) break;
			else if(opcion == 5){
				while(true){
					System.out.print("Submen� de actualizaci�n de datos. Informaci�n a actualizar: \n1. Nada (salir)\n2. Nombre\n3. Apellido\n4. Fecha de nacimiento\n5. C�dula\n6. Direcci�n\n7. Tel�fono\n ---> Opci�n: ");
					opcionAct = teclado.nextInt();
					switch(opcionAct){
						case 1:
							System.out.println("Suerte!");
							break;
						case 2:
							David.pedirNombre();
							break;
						case 3:
							David.pedirApellidos();
							break;
						case 4:
							David.pedirNascita();
							break;
						case 5:
							David.pedirCedula();
							break;
						case 6:
							David.pedirDireccion();
							break;
						case 7:
							David.pedirTelefono();
							break;
						default:
							System.out.print("Error: Opci�n inv�lida.\n");
							break;
					}
					if( opcionAct == 1) break;
					else{
						System.out.println("Datos actualizados correctamente.");
						David.data_Show();
					}
				}
			}
		}
	}
*//*
	//Punto16
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Disco D1 = new Disco();
		Libro L1 = new Libro();
		System.out.print("Ingrese t�tulo del disco: ");
		String ans = teclado.nextLine();
		D1.setTitulo(ans);
		System.out.print("Ingrese el precio del disco: ");
		ans = teclado.nextLine();
		D1.setPrecio((long)Integer.parseInt(ans));
		System.out.print("Ingrese la duraci�n en minutos: ");
		ans = teclado.nextLine();
		D1.setDurMin(Integer.parseInt(ans));
		System.out.println();
		System.out.print("Ingrese el t�tulo del libro: ");
		ans = teclado.nextLine();
		L1.setTitulo(ans);
		System.out.print("Ingrese el precio del libro: ");
		ans = teclado.nextLine();
		L1.setPrecio(Integer.parseInt(ans));
		System.out.print("Ingrese el n�mero de p�ginas del libro: ");
		ans = teclado.nextLine();
		L1.setNumPag((long)Integer.parseInt(ans));
		System.out.print("Ingrese el a�o de publicaci�n del libro: ");
		ans = teclado.nextLine();
		L1.setAnoPublica(Integer.parseInt(ans));
		System.out.println();
		D1.mostrar();
		L1.mostrar();
	}
*//*
	//Punto17
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Ventas bobada = new Ventas();
		String ans, ans2;
		while(true){
			System.out.print("Quiere a�adir una venta?[Y/N]: ");
			ans = teclado.nextLine();
			if(ans.equals("N")||ans.equals("n")){
				break;
			}else if(ans.equals("Y")||ans.equals("y")){
				System.out.print("Ingrese el t�tulo de la publicaci�n: ");
				ans = teclado.nextLine();
				System.out.print("Ingrese el precio de la publicaci�n: ");
				ans2 = teclado.nextLine();
				bobada.addVenta(ans, (long)Integer.parseInt(ans2));
			}
		}
		while(true){
			System.out.print("Quiere buscar una venta?[Y/N]: ");
			ans = teclado.nextLine();
			if(ans.equals("N")||ans.equals("n")){
				break;
			}else if(ans.equals("Y")||ans.equals("y")){
				System.out.print("Ingrese el t�tulo de la publicaci�n: ");
				ans = teclado.nextLine();
				bobada.mostrar(ans);
			}
		}
		System.out.println("Suerte!");
	}
*//*
	//Punto18
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Direccion Address = new Direccion();
		System.out.print("Ingrese el nombre de la persona: ");
		String ans1 = teclado.nextLine();
		System.out.print("Ingrese el primer apellido de "+ans1+": ");
		String ans2 = teclado.nextLine();
		System.out.print("Ingrese el segundo apellido de "+ans1+" "+ans2+": ");
		String ans3 = teclado.nextLine();
		Address.Nuevo_nombre(ans1, ans2, ans3);
		System.out.print("Ingrese la direcci�n: ");
		ans1 = teclado.nextLine();
		System.out.print("Ingrese la ciudad: ");
		ans2 = teclado.nextLine();
		System.out.print("Ingrese la provincia: ");
		ans3 = teclado.nextLine();
		System.out.print("Ingrese el c�digo postal: ");
		String ans4 = teclado.nextLine();
		Address.Nueva_direccion(ans1, ans2, ans3, ans4);
		Address.Mostrar();
	}
*//*
	//Punto19
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Circulo C1 = new Circulo();
		Cilindro C2 = new Cilindro();
		CilindroHueco C3 = new CilindroHueco();
	}
*/
}
