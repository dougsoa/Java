package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade=10;
		System.out.println("Digite sua idade");
		
		Scanner teclado = new Scanner(System.in);
		
		idade = teclado.nextInt();
		
		System.out.println("Sua idade é: " + idade);
		
	}

}
