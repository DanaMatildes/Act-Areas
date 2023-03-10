package package5;
import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args) {
		int operacion;
		float lado=0, radio=0;
		
		Scanner input = new Scanner (System.in);
		while(true) {
			System.out.println("1. Área del cuadrado.");
			System.out.println("2. Perímetro del cuadrado.");
			System.out.println("3. Diagonal del cuadrado.");
			System.out.println("4. Área del círculo.");
			System.out.println("5. Circunferencia del cuadrado.");
			System.out.println("6. Salir.");
			System.out.print("Escriba el número de la operación que desea calcular: ");
			operacion = input.nextInt();
			
			if(operacion==1 || operacion==2 || operacion==3) {
				System.out.print("¿Cuál es el lado del cuadrado?: ");
				lado = input.nextFloat();
			}else if(operacion==4 || operacion==5) {
				System.out.print("¿Cuál es el radio del círculo?: ");
				radio = input.nextFloat();
			}
			
			switch(operacion) {
			case 1:
				Cuadrado5 cuad = new Cuadrado5();
				System.out.println("El área del cuadrado con lado " + lado + " es: " + cuad.calculaArea(lado));
				break;
			case 2:
				Cuadrado5 cuad1 = new Cuadrado5();
				System.out.println("El perímetro del cuadrado con lado " + lado + " es: " + cuad1.calculaPerim(lado));
				break;
			case 3:
				Cuadrado5 cuad2 = new Cuadrado5();
				System.out.println("La diagonal del cuadrado con lado " + lado + " es: " + cuad2.calculaDiag(lado));
				break;
			case 4:
				Circulo5 circ = new Circulo5(radio);
				System.out.println("El área del círculo con radio " + radio + " es: " + circ.calculaArea(radio));
				break;
			case 5:
				Circulo5 circ1 = new Circulo5(radio);
				System.out.println("La circunferencia del círculo con radio " + radio + " es: " + circ1.calculaCircunferencia(radio));
				break;
			case 6:
				System.out.println("Saliendo. Hasta luego.");
				System.exit(0);
			default:
				System.out.println("Inválido");
				break;
			}		
			System.out.println(" ");
			System.out.println(" ");
		}
		
	}
	

}
