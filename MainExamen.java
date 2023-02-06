package packageexamen;
import java.util.Scanner;

public class MainExamen {

	public static void main(String[] args) {
		int opcion;
		String frase;
		
		Examen miExamen = new Examen();
		
		Scanner input = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("1. Primera Mayuscula");
		System.out.println("2. Invertir Cadena");
		System.out.println("3. Vocales en Mayúscula");
		System.out.println("4. FizzBuzz");
		System.out.println("5. Verificar palíndromo");
		System.out.print("Escriba el número de la opción que desea: ");
		opcion = input.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("Método para convertir la primera letra de una frase en Mayúscula.");
			System.out.print("Escriba la frase: ");
			frase = sc.nextLine();
			System.out.println(miExamen.primeraMayuscula(frase));
			break;
			
		case 2:
			System.out.println("Método para invertir una frase.");
			System.out.print("Escriba la frase que desea invertir: ");
			frase = sc.nextLine();
			System.out.println(miExamen.cadenaInver(frase));
			break;
			
		case 3:
			System.out.println("Método para poner las vocales de la frase en Mayúsculas.");
			System.out.print("Escriba la frase: ");
			frase = sc.nextLine();
			System.out.println(miExamen.vocalesMayuscula(frase));
			break;
			
		case 4:
			System.out.println("Impresión de los números 1 al 100, múltiplos de 3 son reemplazados con 'Fizz', de 5 con 'Buzz', de 15 con 'FizzBuzz'.");
			System.out.println(" ");
			miExamen.fizzBuzz();
			break;
			
		case 5:
			System.out.println("Método para verificar si una frase es palíndromo o no.");
			System.out.print("¿Qué frase desea verificar?: ");
			frase = sc.nextLine();
			System.out.println(miExamen.palindromo(frase));
			break;
			
			
		}
	}
	

}
