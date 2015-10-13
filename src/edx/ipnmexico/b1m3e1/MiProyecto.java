package edx.ipnmexico.b1m3e1;

public class MiProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//-> Valida la edad permitida para la expedición de la licencia de conducir.
	public static boolean validarEdad( int edad ) {
		
		if( edad >= 18 ) {
			System .out .println( edad + " Si es mayor de edad :)" );
			return true;
		}
		else {
			System .out .println( edad + " No es mayor de edad :'(" );
			return false;
		}
		
	}
	
	public static int incrementarEdad( int edad ) {
		return edad + 1;
	}
	
}
