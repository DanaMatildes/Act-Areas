package packageexamen;

import java.util.Arrays;

public class Examen {
	
	String miCadena, resultado, cadenaInvertida="";
	int i;
	
	//caso 1
	public String primeraMayuscula(String miCadena) {
		
		char upperString = miCadena.toUpperCase().charAt(0);   //toma el primer caracter y lo transforma en Mayúscula
		int length = miCadena.length();   //mide la longitud de la cadena
		String subString = miCadena.substring(1,length);   //substrae subcadena empezando por 1 hasta la long total de la cadena
		resultado = upperString + subString;
		
		return resultado;
	}

	//caso 2
	public String cadenaInver (String miCadena) {
		
		int length = miCadena.length();
		for(i=length-1; i>=0; i--) {
			cadenaInvertida += miCadena.charAt(i);
	}
		return cadenaInvertida;
}
	//caso 3
	public String vocalesMayuscula (String miCadena) {
		String nuevaCadena = miCadena.replace("a", "A");
		String cadena2 = nuevaCadena.replace("e", "E");
		String cadena3 = cadena2.replace("i", "I");
		String cadena4 = cadena3.replace("o", "O");
		String cadena5 = cadena4.replace("u", "U");
		return cadena5;
	}
	
	//caso 4
	public void fizzBuzz() {
		for(i=1; i<=100; i=i+1) {
			if(i%15==0) {
				System.out.print("FizzBuzz, ");
			}else if(i%3==0) {
				System.out.print("Fizz, ");
			}else if(i%5==0) {
				System.out.print("Buzz, ");
			}else {
				System.out.print(i + ", ");
			}
		}
	}
	
	//caso 5
	public boolean palindromo (String miCadena) {
		
		String newString = miCadena.replace(" ", "");
		int length = newString.length();
		for(i=length-1; i>=0; i--) {
			cadenaInvertida += newString.charAt(i);
		}
		Boolean result = newString.equals(cadenaInvertida);
		return result;
	}
	
	public void danaEka(String miCadena) {
		
		String[] cadSep = miCadena.split("/");
		System.out.print(Arrays.asList(cadSep));
	}
	
}

