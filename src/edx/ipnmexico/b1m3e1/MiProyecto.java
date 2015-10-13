package edx.ipnmexico.b1m3e1;

public class MiProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Juanita";
		int edad = 13;
		
		//-> Ciclo que incrementa la edad en uno.
		while( !validarEdad( edad ) ) {
			edad = incrementarEdad( edad );
		}
		
		System .out .println( "Licencia otorgada a " + nombre );
		
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
	
	//-> Incrementa la edad en uno.
	public static int incrementarEdad( int edad ) {
		return edad + 1;
	}
	
}
