package package1;
import java.util.Scanner;

public class AreasMain3 {
	
	public static void main(String[] args) {
		
		String figura, opeCuadrado, opeCirculo;
		long ladoNuevo, radioNuevo;
		
		Scanner input1 = new Scanner(System.in); //declarar scanner para leer
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		
		System.out.println("¿Qué figura desea calcular?");
		figura = input1.nextLine();
		
		//cálculos del cuadrado
		if(figura.equals("cuadrado")) {
			
			System.out.println("¿Cuál es la medida del cuadrado?");
			ladoNuevo = input1.nextInt();
			Cuadrado3 c = new Cuadrado3(ladoNuevo);
			
			
			System.out.println("Ingrese el resultado que desea: perímetro, área o diagonal.");
			opeCuadrado = input2.nextLine();
			
			
			//calculos
			if(opeCuadrado.equals("perimetro")) {
				System.out.println("El perímetro es " + c.calculaPerim(ladoNuevo));
			}
			if(opeCuadrado.equals("area")) {
				System.out.println("El área es " + c.calculaArea(ladoNuevo));
			}
			if(opeCuadrado.equals("diagonal")) {
				System.out.println("La diagonal es " + c.calculaDiag(ladoNuevo));
			}
			
			
			}
			
		if(figura.equals("circulo")) {
			
			System.out.println("¿Cuál es la medida del radio?");
			radioNuevo = input1.nextInt();
			Circulo3 circ = new Circulo3(radioNuevo);
			
			
			System.out.println("Ingrese el cálculo que desea: area o circunferencia.");
			opeCirculo = input2.nextLine();
			
			//calculos
			if(opeCirculo.equals("area")) {
				System.out.println("El área es " + circ.calculaArea(radioNuevo));
			}
			if(opeCirculo.equals("circunferencia")) {
				System.out.println("La circunferencia es " + circ.calculaCircunferencia(radioNuevo));
			}
		}
		
		}
		
		

	}

