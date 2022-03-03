package empresa;

import java.util.Scanner;

public class principal {

	public static void main (String[] args) {
		System.out.println("Por favor digite seu peso (kg)");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura (m)");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.printf("Seu IMC É: %.2f", imc);
		
	}

}
